package app.dataStruct;

import app.logic.users.Paciente;

public class Nodo {

    private Paciente dato;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(Paciente dato) {
        this.dato = dato;
        izquierda = derecha = null;
    }

    public Paciente getDato() {
        return dato;
    }

    public void setDato(Paciente dato) {
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
    

    public Paciente Paciente() {
        return this.dato;
    }

}
