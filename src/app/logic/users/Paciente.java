package app.logic.users;

import app.logic.Fecha;
import app.logic.Main;
import javax.swing.*;
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
     */
    public Paciente(String cedula, String nombre, String apellido, String sexo, Fecha fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
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
        return fechaNacimiento.diferenciaEntreFechas(fechaNacimiento);
    }

    /**
     * Recibe el tipo de argumento por el cual se quieren filtrar las búsquedas
     * de resultados y regresa una lista con Resultados de Actividades
     *
     * @param filtro String filtro de actividades a buscar
     * @return listaFichasFiltro
     */
    /*
    public List<ResultadoActividad> buscarResultadoActividad(String filtro) {
        List<ResultadoActividad> listaFichasFiltro = new ArrayList<>();

        try {
            switch (filtro) {
                case "Todos": {
                    // Regresa la lista de resultados de actividades
                    return listaFichas;
                }

                case "Moderada": {
                    // Recorre la lista de resultados de actividades
                    for (ResultadoActividad resultado : listaFichas) {
                        // Si el resultado de la actividad es del tipo filtro
                        if (resultado.getEtapa().equals(filtro)) {
                            // Agrega el resultado a la lista de resultados filtrados
                            listaFichasFiltro.add(resultado);
                        }
                    }
                    // Regresa la lista de resultados filtrados
                    return listaFichasFiltro;
                }

                case "Hoy": {
                    // Recorre la lista de resultados de actividades
                    for (ResultadoActividad resultado : listaFichas) {
                        // Si el resultado de la actividad es del tipo filtro
                        if (resultado.getFecha().getDia() == (new Fecha()).getDia()) {
                            // Agrega el resultado a la lista de resultados filtrados
                            listaFichasFiltro.add(resultado);
                        }
                    }
                    return listaFichasFiltro;
                }

            }
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listaFichasFiltro;
    }
     */

 /*-------------------------------------------------------------
    /Métodos capa de negocio
    /-------------------------------------------------------------*/
    /**
     * Metodo que permite modificar un atributo del paciente
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
                    st = Main.getConnect().prepareStatement("UPDATE paciente SET nombre = ? WHERE cedula = ?");
                    st.setString(1, nuevo);
                    st.setString(2, cedula);
                    nombre = nuevo;
                }
                case "Apellido": {
                    st = Main.getConnect().prepareStatement("UPDATE paciente SET apellido = ? WHERE cedula = ?");
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
                        st = Main.getConnect().prepareStatement("UPDATE paciente SET etapa = ? WHERE cedula = ?");
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
                    st = Main.getConnect().prepareStatement("UPDATE paciente SET dianac = ?, mesnac = ?, anionac = ? WHERE cedula = ?");
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
     * Regresa los valores de paciente
     *
     * @return String info paciente
     */
    @Override
    public String toString() {
        return cedula + "      " + nombre + "       " + apellido + "          " + getEdad();
    }
}
