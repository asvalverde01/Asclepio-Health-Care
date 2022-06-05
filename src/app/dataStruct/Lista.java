package app.dataStruct;

import app.logic.Usuario;
import java.util.ArrayList;

/**
 *  Estructura de datos de tipo ArrayList para almacenar objetos de tipo Usuario
 *
 */
public class Lista {

    private ArrayList<Usuario> listaUsuarios;

    public Lista() {
        listaUsuarios = new ArrayList<>();
    }

    public boolean esVacia() {
        return listaUsuarios.isEmpty();
    }

    public void agregar(Usuario nueva) {
        listaUsuarios.add(nueva);
    }

    public void agregar(Usuario nueva, int indice) {
        listaUsuarios.add(indice, nueva);
    }

    public void eliminar(int indice) {
        listaUsuarios.remove(indice);
    }

    public void eliminarCodigo(String cedula) {
        for (Usuario user : listaUsuarios) {
            if (user.getCedula().equals(cedula)) {
                listaUsuarios.remove(user);
                break;
            }
        }
    }

    public void actualizar(Usuario nuevo, int indice) {
        listaUsuarios.set(indice, nuevo);
    }

    public Usuario consultar(int indice) {
        return listaUsuarios.get(indice);
    }

    public ArrayList<Usuario> getUsuarios() {
        return listaUsuarios;
    }

    public void predefinir() {
        //agregar();
    }
    
    public int tamanio() {
        return listaUsuarios.size();
    }
    
    public void eliminarElementos() {
        listaUsuarios.clear();
    }

}
