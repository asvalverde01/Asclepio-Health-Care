package app.logic.users;

import app.dataStruct.ListaPacientes;
import app.logic.Fecha;
import static app.logic.Main.connect;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
    
     public static ListaPacientes obtenerSignosVitalesPaciente() {
        ListaPacientes pacientesLista = new ListaPacientes();

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
                //System.out.println("--------------");
                //System.out.println(nuevoPaciente.getEdad());
                nuevoPaciente.getEdad();
                // añade el paciente registrado a la lista
                pacientesLista.agregar(nuevoPaciente);
                nacimiento = null;
            }
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        // Regresa el usuario que se ha guardado
        return pacientesLista;
    }

    @Override
    public String toString() {
        return super.toString() + this.especialidad + "  " + this.correo;
    }

}
