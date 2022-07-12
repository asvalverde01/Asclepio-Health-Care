package app.logic.users;

import app.logic.Fecha;
import app.logic.HistoriaClinicaPaciente;
import app.logic.Main;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Programa AsclepioHC Clase Paciente
 *
 */
public class Paciente {

    /*-------------------------------------------------------------
    /Atributos de la clase Paciente
    /-------------------------------------------------------------*/
    private String cedula;
    private String nombre;
    private String apellido;
    private String sexo;
    private Fecha fechaNacimiento;
    private String idMedicoResponsable;
    private String estado;
    private HistoriaClinicaPaciente historiaClinica;
    
    // Lista de fichas medicas (Almacena una lista con las fichas medicas)
    //private List<ResultadoActividad> listaFichas;

    /*-------------------------------------------------------------
    /Constructores de la clase Paciente
    /-------------------------------------------------------------*/
    /**
     * Constructor por defecto de la clase Usuario
     */
    public Paciente() {
    }

    /**
     * Constructor de la clase Usuario con parametros
     *
     * @param cedula String
     * @param nombre String
     * @param apellido String
     * @param sexo String
     * @param fechaNacimiento Fecha
     * @param idMedicoResponsable String
     */
    public Paciente(String cedula, String nombre, String apellido, String sexo, Fecha fechaNacimiento, String idMedicoResponsable) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.idMedicoResponsable = idMedicoResponsable;
        estado = "Espera";
    }

    /*-------------------------------------------------------------
    /Métodos get y set de la clase Usuario
    /-------------------------------------------------------------*/
    /**
     * Regresa el nombre del paciente
     *
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del paciente
     *
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el apellido del paciente
     *
     * @return String apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Asigna el apellido del paciente
     *
     * @param apellido String
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Regresa la cedula del paciente
     *
     * @return String cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Asigna la cedula en el paciente
     *
     * @param cedula String cedula nueva
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Regresa el sexo del paciente
     *
     * @return String sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Asigna el sexo en el paciente
     *
     * @param sexo String sexo nueva
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Regresa la fecha de nacimiento del paciente como String
     *
     * @return String fechaNacimiento
     */
    public String getFechaNacimientoString() {
        return fechaNacimiento.toString();
    }

    /**
     * Regresa la fecha de nacimiento del paciente
     *
     * @return Fecha fechaNacimiento
     */
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Asigna la fecha de nacimiento del paciente
     *
     * @param fechaNacimiento Fecha
     */
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Regresa la edad del paciente calculada con el metodo
     * calcularEdad(fechaNacimiento)
     *
     * @return int edad
     */
    public int getEdad() {
        return fechaNacimiento.diferenciaEntreFechas(this.fechaNacimiento);
    }

    public String getIdMedicoResponsable() {
        return idMedicoResponsable;
    }

    public void setIdMedicoResponsable(String idMedicoResponsable) {
        this.idMedicoResponsable = idMedicoResponsable;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public HistoriaClinicaPaciente getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinicaPaciente historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    
    
 /*-------------------------------------------------------------
    /Métodos capa de negocio
    /-------------------------------------------------------------*/
    /**
     * Metodo que permite modificar un atributo del paciente
     *
     * @param nombre
     * @param apellido
     * @param nuevaFecha
     * @return Boolean true si se modifico correctamente false si no
     */
    public boolean modificarInfoUsuario(String nombre, String apellido, Fecha nuevaFecha) {
        // Modifica el atributo seleccionado en la base de datos
        try {
            PreparedStatement st = null;
            int dia = nuevaFecha.getDia();
            int mes = nuevaFecha.getMes();
            int anio = nuevaFecha.getAnio();
            // Modifica en la base de datos el nombre, apellido, dia, mes, anio
            st = Main.getConnect().prepareStatement("UPDATE paciente SET nombre = ?, apellido = ?, dia = ?, mes = ?, anio = ? WHERE cedula = ?");
            st.setString(1, nombre);
            st.setString(2, apellido);
            st.setInt(3, dia);
            st.setInt(4, mes);
            st.setInt(5, anio);
            st.setString(6, cedula);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

    }

    /**
     * Regresa los valores de paciente
     *
     * @return String info paciente
     */
    @Override
    public String toString() {
        return cedula + "      " + nombre + "       " + apellido + "       " + getEdad();
    }
}
