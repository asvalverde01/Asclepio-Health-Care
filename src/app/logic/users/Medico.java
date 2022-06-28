package app.logic.users;

import app.logic.Fecha;

/**
 * Programa AsclepioHC Clase Usuario
 *
 * @author Valverde, Vinueza, Vintimilla, Liria, Ordoñez
 */
public class Medico extends Usuario {

    /*-------------------------------------------------------------
    /Atributos de la clase Usuario :)
    /-------------------------------------------------------------*/
    private String especialidad;
    private String correo;

    /*-------------------------------------------------------------
    /Constructores de la clase Usuario
    /-------------------------------------------------------------*/
    /**
     * Constructor por defecto de la clase Medico
     *
     * @param especialidad
     * @param correo
     */
    public Medico(String especialidad, String correo) {
        this.especialidad = especialidad;
        this.correo = correo;
    }

    /**
     * Constructor de la clase Medico con parametros
     *
     * @param especialidad
     * @param correo
     * @param usuario
     * @param contrasenia
     * @param cedula String
     * @param nombre String
     * @param rol
     * @param apellido String
     * @param avatar int
     * @param sexo
     * @param fechaNacimiento Fecha
     */
    public Medico(String especialidad, String correo, String usuario, String contrasenia, String nombre, String apellido, String rol, String cedula, int avatar, String sexo, Fecha fechaNacimiento) {
        super(usuario, contrasenia, nombre, apellido, rol, cedula, avatar, sexo, fechaNacimiento);
        this.especialidad = especialidad;
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
