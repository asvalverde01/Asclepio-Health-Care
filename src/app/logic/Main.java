package app.logic;

import app.dataStruct.Lista;
import app.dataStruct.ListaPacientes;
import app.gui.inicio.InicioForm;
import app.logic.users.Paciente;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.sql.*;

/**
 *
 * Librería sqlite-jdbc-3.20.1.jar
 *
 * Clase Main. Se encarga de empezar el programa verificando si existe una base
 * de datos Se encarga de las conexiones y administración de la base de datos
 *
 */
public class Main {

    /*-------------------------------------------------------------
    /Atributos de la clase Main :)
    /-------------------------------------------------------------*/
    // Direccion de la base de datos
    // Atributo publico pues permite a otras clases accceder a la ubicación de la base de datos
    public static String url = "jdbc:sqlite:appdata.sqlite";
    // Objeto de conección con la base SQLite
    // Atributo público pues es usado por otras clases para realizar conexiones y peticiones SQL
    public static Connection connect;
    // Indica si existe coneccion con base de datos
    // Permite a otras clases conocer si la conexión con la base de datos existe
    private static boolean conectado = false;

    /**
     * Inicializa el programa
     *
     * @param args
     */
    public static void main(String[] args) {
        /*-------------------------------------------------------------
        /Atributos 
        /-------------------------------------------------------------*/
        // Lista de usuarios registrados
        Lista usuarios = new Lista();
        // Objeto del archivo de la base de datos
        File file = new File("appdata.sqlite");


        /*-------------------------------------------------------------
        /Se busca si existe una archivo base de datos
        /-------------------------------------------------------------*/
        if (file.exists()) //Verifica si existe el archivo
        {
            // Se conecta a la base de datos
            conectado = conectarBaseDatos();
        } else {
            crearBaseDatos();
            conectado = conectarBaseDatos();
        }
        // Inicia el programa mostrando el inicio
        InicioForm mainInicio = new InicioForm(usuarios);
        mainInicio.setVisible(true);
        mainInicio.setLocationRelativeTo(null);
    }


    /*-------------------------------------------------------------
    /Métodos get y set de la clase Main
    /-------------------------------------------------------------*/
    public static void setConectado(boolean conectado) {
        Main.conectado = conectado;
    }

    public static Connection getConnect() {
        return connect;
    }

    public static boolean isConectado() {
        return conectado;
    }

    /**
     * Método que crea una base de datos. Crea la tabla usuario y actividad
     *
     * @return true si se ha podido crear a la base de datos
     */
    public static boolean crearBaseDatos() {
        try {
            connect = DriverManager.getConnection(url);
            // Se crea la tabla con informacion de usuario
            // Guardar la cedula como ID 

            String sql = "CREATE TABLE IF NOT EXISTS usuario (\n"
                    + "	usuario text,\n"
                    + "	contrasenia text,\n"
                    + "	rol text,\n" // Administrador - Medico - Paciente
                    + "	cedula text,\n"
                    + "	nombre text,\n"
                    + "	apellido text,\n"
                    + "	sexo text,\n"
                    + "	avatar integer,\n" // Avatar en GUI
                    + "	dianac integer,\n" // Dia de nacimiento
                    + "	mesnac integer,\n"
                    + "	anionac integer,\n"
                    + "	especialidad text,\n" // Si es rol medico, caso contrario null
                    + "	correo text\n" // // Si es rol medico o administrador caso contrario null
                    + ");";
            PreparedStatement st = connect.prepareStatement(sql);
            st.execute();
            // Ingresa por defecto un usuario administrador
            sql = "INSERT INTO usuario (usuario, contrasenia, rol, cedula, nombre, apellido, sexo, avatar, dianac, mesnac, anionac, especialidad, correo) VALUES ('admin', 'admin', 'Administrador', 'admin', 'admin', 'admin' ,'admin', 1, 1, 1, 1, 'admin', 'admin')";
            st = Main.getConnect().prepareStatement(sql);
            st.executeUpdate();

            // Se crea la tabla con informacion de Paciente
            sql = "CREATE TABLE IF NOT EXISTS paciente (\n"
                    + "	nombre integer,\n"
                    + "	apellido text,\n"
                    + "	cedula text,\n"
                    + "	sexo text,\n"
                    + "	dia integer,\n"
                    + "	mes text,\n"
                    + "	anio integer\n"
                    + ");";
            st = connect.prepareStatement(sql);
            st.execute();
            System.out.println("Base de datos creada con usuario administrador");

        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Método que conecta el programa con la base de datos
     *
     * @return true si se ha podido conectar a la base de datos
     */
    public static boolean conectarBaseDatos() {
        try {
            // Guarda en cconnect la conexión 
            connect = DriverManager.getConnection(url);
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Saca de la base de datos todas las fichas
     *
     * @param cedulaUsuario String con la cedula del usuario
     * @return listaResultado
     *
     * public static List<Formulario> obtenerFormularioDataBase(String
     * cedulaUsuario) { List<Formulario> listaResultado = new ArrayList<>();
     * PreparedStatement st = null;
     *
     * // Intenta sacar todos los resultados de la base de datos try { st =
     * Main.getConnect().prepareStatement("SELECT * FROM actividad WHERE id =
     * ?"); st.setString(1, cedulaUsuario); } catch (SQLException e) {
     * e.printStackTrace(); } catch (Exception ex) { ex.printStackTrace(); }
     *
     * // Mientras hayan filas en la tabla rs try { // Ejecuta la orden y la
     * guarda en modo de tabla ResultSet rs = null; assert st != null; rs =
     * st.executeQuery(); while (rs.next()) { String cedulaRe =
     * rs.getString("id"); String nombreRe = rs.getString("nombre"); int
     * aciertos = rs.getInt("aciertos"); String etapaRe = rs.getString("etapa");
     * int segundos = rs.getInt("segundos"); int dia = rs.getInt("dia"); String
     * mes = rs.getString("mes"); int anio = rs.getInt("anio"); //Crea un objeto
     * de tipo Fecha Fecha fecha = new Fecha(dia, 0, anio);
     * fecha.setMesString(mes); //Crea un objeto de tipo Formulario Formulario
     * resultadoActividad = new Formulario(cedulaRe, nombreRe, aciertos, fecha,
     * etapaRe, segundos); //Agrega el objeto a la lista
     * listaResultado.add(resultadoActividad); } } catch (SQLException e) {
     * e.printStackTrace(); } // regresa la lista de resultados con los valores
     * de la búsqueda return listaResultado; }
     *
     */

    /*-------------------------------------------------------------
    /Métodos  utsados con la clase Formulario
    /-------------------------------------------------------------*/
    /**
     * Registra el resultado de la actividad en la base de datos
     *
     * @param resultado
     */
    /*
    public static void registrarDataBase(Formulario resultado) {
        // Guarda los atributos en la tabla actividad en la base de datos
        if (conectado) {
            // En la tabla actividad de la base de datos registra los datos
            try {
                // Fecha en la cual se realiza la actividad
                int dia = resultado.getFecha().getDia();
                String mes = resultado.getFecha().getMesString();
                int anio = resultado.getFecha().getAnio();

                // Orden SQL para guardar los datos
                String SQL = "INSERT INTO actividad (id, nombre, aciertos, etapa, segundos, dia, mes, anio) VALUES";
                // Appends to SQL
                SQL = SQL + " ('" + resultado.getId() + "','" + resultado.getNombre() + "', '" + resultado.getAciertos() + "', '" + resultado.getEtapa() + "', '" + resultado.getSegundos() + "' , '" + dia + "', '" + mes + "', '" + anio + "')";
                // Prepara el objeto de orden SQL
                PreparedStatement st = Main.getConnect().prepareStatement(SQL);
                // Ejecuta la orden SQL
                st.executeUpdate();
                // regresa true si se registro correctamente
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error, intente nuevamente");
                // Imprime el error en consola
                ex.printStackTrace();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error, intente nuevamente");
                // Imprime el error en consola
                ex.printStackTrace();
            }
        } else {
            // Si no se conecta a la base de datos
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
        }
    }
     */
    /**
     * Metodo que elimina el usuario de la base de datos
     *
     * @param cedula
     * @return Boolean true si se elimino correctamente
     */
    public static boolean eliminarUsuarioDataBase(String cedula) {
        try {
            // Elimina el usuario
            PreparedStatement st = Main.getConnect().prepareStatement("DELETE FROM paciente WHERE cedula = ?");
            st.setString(1, cedula);
            // Ejecuta la consulta SQL
            st.executeUpdate();
            // Elimina las -- del usuario
            //st = Main.getConnect().prepareStatement("DELETE FROM tabla WHERE id = ?");
            //st.setString(1, cedula);
            // Ejecuta la consulta SQL
            // st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Método que elimina toda la base de datos. Elimina el archivo en el cual
     * se almacena toda la información
     *
     * @return true si se ha eliminado la base de datos
     */
    public static boolean eliminarDataBase() {
        try {
            // closes the database file
            connect.close();
            File myObj = new File("appdata.sqlite");
            if (myObj.delete()) {
                System.out.println("Deleted the file: " + myObj.getName());
                return true;
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (SQLException ex1) {
            JOptionPane.showMessageDialog(null, ex1.getMessage());
        }
        return false;
    }

    public static ListaPacientes getPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static ListaPacientes obtenerPacientesDataBase() {
        ListaPacientes pacientesLista = new ListaPacientes();
        Fecha nacimiento = new Fecha();
        // Se obtiene la informacion de la tabla usuario en base de datos
        try {
            String sql = "SELECT * FROM paciente";
            PreparedStatement st = connect.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Paciente nuevoPaciente = new Paciente();

                nuevoPaciente.setNombre(rs.getString("nombre"));
                nuevoPaciente.setApellido(rs.getString("apellido"));
                nuevoPaciente.setCedula(rs.getString("cedula"));
                nuevoPaciente.setSexo(rs.getString("sexo"));

                nacimiento.setDia(rs.getInt("dia"));
                nacimiento.setMes(rs.getInt("mes"));
                nacimiento.setAnio(rs.getInt("anio"));
                nuevoPaciente.setFechaNacimiento(nacimiento);

                // añade el paciente registrado a la lista
                pacientesLista.agregar(nuevoPaciente);
            }
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        // Regresa el usuario que se ha guardado
        return pacientesLista;
    }
} // FIN CLASE 
