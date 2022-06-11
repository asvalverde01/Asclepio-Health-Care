package app.dataStruct;

import app.logic.users.Paciente;
import java.util.ArrayList;

/**
 *  Estructura de datos de tipo ArrayList para almacenar objetos de tipo Paciente
 *
 */
public class ListaPacientes {

    private ArrayList<Paciente> listaPacientes;

    public ListaPacientes() {
        listaPacientes = new ArrayList<>();
    }

    public boolean esVacia() {
        return listaPacientes.isEmpty();
    }

    public void agregar(Paciente nueva) {
        listaPacientes.add(nueva);
    }

    public void agregar(Paciente nueva, int indice) {
        listaPacientes.add(indice, nueva);
    }

    public void eliminar(int indice) {
        listaPacientes.remove(indice);
    }

    public void eliminarCodigo(String cedula) {
        for (Paciente user : listaPacientes) {
            if (user.getCedula().equals(cedula)) {
                listaPacientes.remove(user);
                break;
            }
        }
    }

    public void actualizar(Paciente nuevo, int indice) {
        listaPacientes.set(indice, nuevo);
    }

    public Paciente consultar(int indice) {
        return listaPacientes.get(indice);
    }

    public ArrayList<Paciente> getPacientes() {
        return listaPacientes;
    }

    public void predefinir() {
        //agregar();
    }
    
    public int tamanio() {
        return listaPacientes.size();
    }
    
    public void eliminarElementos() {
        listaPacientes.clear();
    }
}
