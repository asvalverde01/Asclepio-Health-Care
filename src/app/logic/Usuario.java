package app.logic;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Programa AsclepioHC Clase Usuario
 *
 * @author Valverde, Vinueza, Vintimilla
 */
public class Usuario {

    /*-------------------------------------------------------------
    /Atributos de la clase Usuario :)
    /-------------------------------------------------------------*/
    private int ID;
    private String nombre;
    private String apellido;
    private String cedula;
    private int avatar;
    private String sexo;
    private Fecha fechaNacimiento;

    /*-------------------------------------------------------------
    /Constructores de la clase Usuario
    /-------------------------------------------------------------*/
    /**
     * Constructor por defecto de la clase Usuario
     */
    public Usuario() {
    }

    /**
     * Constructor de la clase Usuario con parametros
     *
     * @param ID
     * @param cedula String
     * @param nombre String
     * @param apellido String
     * @param avatar int
     * @param sexo
     * @param fechaNacimiento Fecha
     */
    public Usuario(int ID, String nombre, String apellido, String cedula, int avatar, String sexo, Fecha fechaNacimiento) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.avatar = avatar;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Regresa el ID del usuario
     *
     * @return int ID
     */
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Regresa el sexo del usuario
     *
     * @return String sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Regresa el nombre del usuario
     *
     * @return String nombre
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Regresa el nombre del usuario
     *
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del usuario
     *
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el apellido del usuario
     *
     * @return String apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Asigna el apellido del usuario
     *
     * @param apellido String
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Regresa la cedula del usuario
     *
     * @return String cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Asigna la cedula en el usuario
     *
     * @param cedula String cedula nueva
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Regresa el avatar del usuario
     *
     * @return String avatar
     */
    public int getAvatar() {
        return avatar;
    }

    /**
     * Asigna el avatar del usuario
     *
     * @param avatar String
     */
    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    /**
     * Regresa la fecha de nacimiento del usuario como String
     *
     * @return String fechaNacimiento
     */
    public String getFechaNacimientoString() {
        return fechaNacimiento.toString();
    }

    /**
     * Regresa la fecha de nacimiento del usuario
     *
     * @return Fecha fechaNacimiento
     */
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Asigna la fecha de nacimiento del usuario
     *
     * @param fechaNacimiento Fecha
     */
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Regresa la edad del usuario calculada con el metodo
     * calcularEdad(fechaNacimiento)
     *
     * @return int edad
     */
    public int getEdad() {
        return fechaNacimiento.diferenciaEntreFechas(fechaNacimiento);
    }


    /*-------------------------------------------------------------
    /Métodos capa de negocio
    /-------------------------------------------------------------*/
    /**
     * Metodo que permite modificar un atributo del usuario
     *
     * @param tipo String tipo de atributo
     * @param nuevo String nuevo valor a cambiar
     * @return Boolean true si se modifico correctamente false si no
     */
    public boolean modificarInfoUsuario(String tipo, String nuevo) {
        // Modifica el atributo seleccionado en la base de datos
        try {
            PreparedStatement st = null;
            switch (tipo) {
                case "Nombre": {
                    st = Main.getConnect().prepareStatement("UPDATE usuario SET nombre = ? WHERE cedula = ?");
                    st.setString(1, nuevo);
                    st.setString(2, cedula);
                    nombre = nuevo;
                }
                case "Apellido": {
                    st = Main.getConnect().prepareStatement("UPDATE usuario SET apellido = ? WHERE cedula = ?");
                    st.setString(1, nuevo);
                    st.setString(2, cedula);
                    apellido = nuevo;
                }
                case "Etapa": {
                    // Verifica que el nuevo valor sea valido "Leve" , "Moderada" o "Avanzada"
                    if (nuevo.equals("Leve") || nuevo.equals("Moderada") || nuevo.equals("Avanzada")) {
                        int nuevoValor;
                        switch (nuevo) {
                            case "Moderada":
                                nuevoValor = 1;
                            case "Avanzada":
                                nuevoValor = 2;
                            default:
                                nuevoValor = 0;
                        };
                        st = Main.getConnect().prepareStatement("UPDATE usuario SET etapa = ? WHERE cedula = ?");
                        st.setInt(1, nuevoValor);
                        st.setString(2, cedula);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese solamente \"Leve\" - \"Moderada\" - \"Avanzada\"");
                        return false;
                    }
                }
                case "fecha": {
                    //Separa el string si encuentra "/"
                    String[] fecha = nuevo.split("/");
                    // Asigna los valores de dia, mes y anio
                    int dia = Integer.parseInt(fecha[0]);
                    int mes = Integer.parseInt(fecha[1]);
                    int anio = Integer.parseInt(fecha[2]);
                    // Hace los cambios en el SQL
                    st = Main.getConnect().prepareStatement("UPDATE usuario SET dianac = ?, mesnac = ?, anionac = ? WHERE cedula = ?");
                    st.setInt(1, dia);
                    st.setInt(2, mes);
                    st.setInt(3, anio);
                    st.setString(4, cedula);
                    this.fechaNacimiento.setDia(dia);
                    this.fechaNacimiento.setMes(mes);
                    this.fechaNacimiento.setAnio(anio);
                }
            }
            // Ejecuta la consulta
            try {
                assert st != null;
                // Ejecuta la consulta SQL
                st.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    /**
     * Regresa los valores de usuario
     *
     * @return String info usuario
     */
    @Override
    public String toString() {
        return "Usuario{" + "ID=" + ID + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", avatar=" + avatar + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
