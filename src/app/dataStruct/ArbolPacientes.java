package app.dataStruct;

import app.logic.users.Paciente;

import java.util.ArrayList;

public class ArbolPacientes {

    private Nodo raiz;

    public ArbolPacientes() {
        raiz = null;
    }

    public ArbolPacientes(Paciente nuevo) {
        raiz = new Nodo(nuevo);
    }

    private void insertar(Nodo nuevo, Nodo actual) {
        if (nuevo.getDato().getNombre().charAt(0) < actual.getDato().getNombre().charAt(0)) {
            if (actual.getIzquierda() == null) {
                actual.setIzquierda(nuevo);
            } else {
                insertar(nuevo, actual.getIzquierda());
            }
        } else {
            if (actual.getDerecha() == null) {
                actual.setDerecha(nuevo);
            } else {
                insertar(nuevo, actual.getDerecha());
            }
        }
    }

    public void insertar(Paciente nuevo) {
        if (raiz == null) {
            raiz = new Nodo(nuevo);
        } else {
            Nodo nodoNuevo = new Nodo(nuevo);
            insertar(nodoNuevo, raiz);
        }
    }

    private String preOrden(Nodo actual) {
        if (actual != null) {
            return actual.getDato().toString() + "\n"
                    + preOrden(actual.getIzquierda())
                    + preOrden(actual.getDerecha());
        } else {
            return "";
        }
    }

    public String preOrden() {
        if (raiz == null) {
            return "No existen elementos en el árbol";
        } else {
            return preOrden(raiz);
        }
    }

    public ArrayList<Paciente> getPacientes() {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        // Recorre el arbol sacando los pacientes y agregandolos a a lista
        if (raiz != null) {
            getPacientes(raiz, pacientes);
        }

        return pacientes;
    }

    private void getPacientes(Nodo raiz, ArrayList<Paciente> pacientes) {
        if (raiz != null) {
            pacientes.add(raiz.getDato());
            getPacientes(raiz.getIzquierda(), pacientes);
            getPacientes(raiz.getDerecha(), pacientes);
        }
    }

}
