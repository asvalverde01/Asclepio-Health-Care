package app.logic;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Programa AsclepioHC Clase Usuario
 *
 * @author Valverde, Vinueza, Vintimilla, Liria, Ordoñez
 */
public class Usuario {

    /*-------------------------------------------------------------
    /Atributos de la clase Usuario :)
    /-------------------------------------------------------------*/
    private String usuario;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private String rol;
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
     * @param usuario
     * @param contrasenia
     * @param cedula String
     * @param nombre String
     * @param apellido String
     * @param avatar int
     * @param sexo
     * @param fechaNacimiento Fecha
     */
    public Usuario(String usuario, String contrasenia, String nombre, String apellido, String rol, String cedula, int avatar, String sexo, Fecha fechaNacimiento) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.cedula = cedula;
        this.avatar = avatar;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Regresa el usuario del
     *
     * @return String usuario
     */
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Regresa el rol del listaFichas
     *
     * @return int rol
     */
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Regresa el sexo del listaFichas
     *
     * @return String sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Regresa el nombre del listaFichas
     *
     * @param sexo
     * @return String nombre
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Regresa el nombre del listaFichas
     *
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del listaFichas
     *
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el apellido del listaFichas
     *
     * @return String apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Asigna el apellido del listaFichas
     *
     * @param apellido String
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Regresa la cedula del listaFichas
     *
     * @return String cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Asigna la cedula en el listaFichas
     *
     * @param cedula String cedula nueva
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Regresa el avatar del listaFichas
     *
     * @return String avatar
     */
    public int getAvatar() {
        return avatar;
    }

    /**
     * Asigna el avatar del listaFichas
     *
     * @param avatar String
     */
    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    /**
     * Regresa la fecha de nacimiento del listaFichas como String
     *
     * @return String fechaNacimiento
     */
    public String getFechaNacimientoString() {
        return fechaNacimiento.toString();
    }

    /**
     * Regresa la fecha de nacimiento del listaFichas
     *
     * @return Fecha fechaNacimiento
     */
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Asigna la fecha de nacimiento del listaFichas
     *
     * @param fechaNacimiento Fecha
     */
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Regresa la edad del listaFichas calculada con el metodo
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
     * Metodo que permite modificar un atributo del listaFichas
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
                    st = Main.getConnect().prepareStatement("UPDATE listaFichas SET nombre = ? WHERE cedula = ?");
                    st.setString(1, nuevo);
                    st.setString(2, cedula);
                    nombre = nuevo;
                }
                case "Apellido": {
                    st = Main.getConnect().prepareStatement("UPDATE listaFichas SET apellido = ? WHERE cedula = ?");
                    st.setString(1, nuevo);
                    st.setString(2, cedula);
                    apellido = nuevo;
                }
                /* TODO
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
                        st = Main.getConnect().prepareStatement("UPDATE listaFichas SET etapa = ? WHERE cedula = ?");
                        st.setInt(1, nuevoValor);
                        st.setString(2, cedula);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese solamente \"Leve\" - \"Moderada\" - \"Avanzada\"");
                        return false;
                    }
                }
                 */
                case "fecha": {
                    //Separa el string si encuentra "/"
                    String[] fecha = nuevo.split("/");
                    // Asigna los valores de dia, mes y anio
                    int dia = Integer.parseInt(fecha[0]);
                    int mes = Integer.parseInt(fecha[1]);
                    int anio = Integer.parseInt(fecha[2]);
                    // Hace los cambios en el SQL
                    st = Main.getConnect().prepareStatement("UPDATE listaFichas SET dianac = ?, mesnac = ?, anionac = ? WHERE cedula = ?");
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

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", nombre=" + nombre + ", apellido=" + apellido + ", rol=" + rol + ", cedula=" + cedula + ", avatar=" + avatar + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    /**
     * Regresa los valores de listaFichas
     *
     * @return String info listaFichas
     */
    

}
