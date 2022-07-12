package app.logic;

import app.dataStruct.ArbolPacientes;
import app.dataStruct.Lista;
import app.gui.inicio.InicioForm;
import app.logic.users.Paciente;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;

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
                    + "	anio integer,\n"
                    + "	idResponsable text,\n"
                    + "	estado text\n"
                    + ");";
            st = connect.prepareStatement(sql);
            st.execute();

            // Se crea la tabla con informacion de Signos Vitales de paciente
            sql = "CREATE TABLE IF NOT EXISTS signosvitales (\n"
                    + "	id integer,\n"
                    + "	pacienteId text,\n"
                    + "	peso integer,\n"
                    + "	altura integer,\n"
                    + "	respiracion integer,\n"
                    + "	tension integer,\n"
                    + "	pulso integer,\n"
                    + "	grupoSanguineo text,\n"
                    + "	prioridad integer,\n"
                    + "	dia integer,\n"
                    + "	mes integer,\n"
                    + "	anio integer\n"
                    + ");";
            st = connect.prepareStatement(sql);
            st.execute();

            // Se crea la tabla con informacion de historiaclinica
            sql = "CREATE TABLE IF NOT EXISTS historiaclinica (\n"
                    + "	id integer,\n"
                    + "	pacienteId text,\n"
                    + "	ocupacion text,\n"
                    + "	nacionalidad text,\n"
                    + "	estado_civil text,\n"
                    + "	padre_fallecido boolean,\n"
                    + "	madre_fallecido boolean,\n"
                    + "	antecedentes_padre text,\n"
                    + "	antecedentes_madre text,\n"
                    + "	otros text,\n"
                    + "	alcohol boolean,\n"
                    + "	tabaco boolean,\n"
                    + "	drogas boolean,\n"
                    + "	enfermedades text,\n"
                    + "	medicacion text,\n"
                    + "	dia integer,\n"
                    + "	mes integer,\n"
                    + "	anio integer,\n"
                    + "	motivo text,\n"
                    + "	sintomas text,\n"
                    + "	comentarios text\n"
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

    public static ArbolPacientes getPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static ArbolPacientes obtenerPacientesDataBase() {
        ArbolPacientes pacientesLista = new ArbolPacientes();

        // Se obtiene la informacion de la tabla usuario en base de datos
        //String medicoActual = MainScreen.getUserID();
        try {
            String sql = "SELECT * FROM paciente";
            PreparedStatement st = connect.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Fecha nacimiento = new Fecha();
                Paciente nuevoPaciente = new Paciente();

                nuevoPaciente.setNombre(rs.getString("nombre"));
                nuevoPaciente.setApellido(rs.getString("apellido"));
                nuevoPaciente.setCedula(rs.getString("cedula"));
                nuevoPaciente.setSexo(rs.getString("sexo"));

                nacimiento.setDia(rs.getInt("dia"));
                nacimiento.setMes(rs.getInt("mes"));
                nacimiento.setAnio(rs.getInt("anio"));

                nuevoPaciente.setFechaNacimiento(nacimiento);
                nuevoPaciente.setIdMedicoResponsable(rs.getString("idResponsable"));
                nuevoPaciente.setEstado(rs.getString("estado"));
                //System.out.println("--------------");
                //System.out.println(nuevoPaciente.getEdad());
                nuevoPaciente.getEdad();
                // añade el paciente registrado a la lista
                pacientesLista.insertar(nuevoPaciente);
                nacimiento = null;
            }
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        // Regresa el usuario que se ha guardado
        return pacientesLista;
    }

    public static ArrayList<SignosVitalesFormulario> getFormulariosDataBase() {
        ArrayList<SignosVitalesFormulario> formularios = new ArrayList<>();
        // Se obtiene la informacion de la tabla usuario en base de datos
        try {
            String sql = "SELECT * FROM signosvitales";
            PreparedStatement st = connect.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Fecha fecha = new Fecha();
                SignosVitalesFormulario nuevoFormulario = new SignosVitalesFormulario();

                nuevoFormulario.setId(rs.getInt("id"));
                nuevoFormulario.setPacienteId(rs.getString("pacienteId"));
                nuevoFormulario.setPeso(rs.getInt("peso"));
                nuevoFormulario.setAltura(rs.getInt("altura"));
                nuevoFormulario.setRespiracion(rs.getInt("respiracion"));
                nuevoFormulario.setTension(rs.getInt("tension"));
                nuevoFormulario.setPulso(rs.getInt("pulso"));
                nuevoFormulario.setGrupoSanguieno(rs.getString("grupoSanguineo"));
                nuevoFormulario.setPrioridad(rs.getInt("prioridad"));
                // fecha
                fecha.setDia(rs.getInt("dia"));
                fecha.setMes(rs.getInt("mes"));
                fecha.setAnio(rs.getInt("anio"));

                nuevoFormulario.setFecha(fecha);

                // añade el formulario registrado a la lista
                formularios.add(nuevoFormulario);
                fecha = null;
            }
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        // Regresa la lista de formularios
        return formularios;
    }

    public static HistoriaClinicaPaciente obtenerHistoriaClinica(String cedula) {
        HistoriaClinicaPaciente historia = new HistoriaClinicaPaciente();
        // Se obtiene la informacion de la tabla usuario en base de datos
        try {
            String sql = "SELECT * FROM historiaclinica WHERE pacienteId = ?";
            PreparedStatement st = connect.prepareStatement(sql);
            st.setString(1, cedula);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                HistoriaClinicaPaciente nuevaHistoria = new HistoriaClinicaPaciente();

                nuevaHistoria.setPacienteId(rs.getString("pacienteId"));
                nuevaHistoria.setOcupacion(rs.getString("ocupacion"));
                nuevaHistoria.setNacionalidad(rs.getString("nacionalidad"));
                nuevaHistoria.setEstadoCivil(rs.getString("estado_civil"));
                nuevaHistoria.setPadreFallecido(rs.getBoolean("padre_fallecido"));
                nuevaHistoria.setMadreFallecido(rs.getBoolean("madre_fallecido"));
                nuevaHistoria.setAntecedentesPadre(rs.getString("antecedentes_padre"));
                nuevaHistoria.setAntecedentesMadre(rs.getString("antecedentes_madre"));
                nuevaHistoria.setOtros(rs.getString("otros"));
                nuevaHistoria.setAlcohol(rs.getBoolean("alcohol"));
                nuevaHistoria.setTabaco(rs.getBoolean("tabaco"));
                nuevaHistoria.setDrogas(rs.getBoolean("drogas"));
                nuevaHistoria.setEnfermedades(rs.getString("enfermedades"));
                nuevaHistoria.setMedicacion(rs.getString("medicacion"));

                nuevaHistoria.setMotivoConsulta(rs.getString("motivo"));
                nuevaHistoria.setSintomas(rs.getString("sintomas"));
                nuevaHistoria.setComentarios(rs.getString("comentarios"));
                // añade el formulario registrado a la lista
                historia = nuevaHistoria;
            }
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        // Regresa la lista de formularios
        return historia;
    }

} // FIN CLASE 
