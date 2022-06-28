package app.logic.users;

import app.logic.Fecha;
import app.logic.Main;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Programa AsclepioHC Clase Usuario
 *
 * @author Valverde, Vinueza, Vintimilla, Liria, Ordoñez
 */
public class Administrador extends Usuario {

    /*-------------------------------------------------------------
    /Constructores de la clase Usuario
    /-------------------------------------------------------------*/
    /**
     * Constructor por defecto de la clase Administrador
     */
    public Administrador() {
    }

    /**
     * Constructor de la clase Usuario con parametros
     *
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
    public Administrador(String usuario, String contrasenia, String nombre, String apellido, String rol, String cedula, int avatar, String sexo, Fecha fechaNacimiento) {
        super(usuario, contrasenia, nombre, apellido, rol, cedula, avatar, sexo, fechaNacimiento);

    }

    public boolean registrarUsuarioDataBase(Medico usuarioNuevo) {
        boolean conectado = Main.isConectado();
        if (conectado) {
            // En el la tabla usuario de la base de datos registra los datos
            try {
                String usuario = usuarioNuevo.getUsuario();
                String contrasenia = usuarioNuevo.getContrasenia();
                String rol = usuarioNuevo.getRol();
                String cedula = usuarioNuevo.getCedula();
                String sexo = usuarioNuevo.getSexo();

                String nombre = usuarioNuevo.getNombre();
                String apellido = usuarioNuevo.getApellido();
                int avatar = usuarioNuevo.getAvatar();

                int dia = usuarioNuevo.getFechaNacimiento().getDia();
                int mes = usuarioNuevo.getFechaNacimiento().getMes();
                int anio = usuarioNuevo.getFechaNacimiento().getAnio();

                String especialidad = usuarioNuevo.getEspecialidad();
                String correo = usuarioNuevo.getCorreo();

                String SQL = "INSERT INTO usuario (usuario, contrasenia, rol, cedula, nombre, apellido, sexo, avatar, dianac, mesnac, anionac, especialidad, correo) VALUES ('"
                        + usuario + "', '" + contrasenia + "', '" + rol + "', '" + cedula + "', '" + nombre + "', '" + apellido + "', '"
                        + sexo + "', '" + avatar + "', '" + dia + "', '" + mes + "', '" + anio + "', '" + especialidad + "', '" + correo + "')";
                PreparedStatement st = Main.getConnect().prepareStatement(SQL);
                st.executeUpdate();
                return true;

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "Error, intente nuevamente");
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
        }
        return false;
    }

}
