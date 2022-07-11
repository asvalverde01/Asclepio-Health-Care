package app.dataStruct;


import app.logic.users.Paciente;
import java.util.LinkedList;
import java.util.Queue;

public class ColaPacientes {

    private Queue<Paciente> cola;

    public ColaPacientes() {
        cola = new LinkedList();
    }

    // Saber si hay elementos
    public boolean esVacia() {
        return cola.isEmpty();
    }

    // Agregar un elemento a la cola
    public void agregar(Paciente dato) {
        cola.add(dato);
    }

    // Saca un elemento
    public Paciente descencolar() {
        return cola.poll();
    }

    public Paciente frente() {
        return cola.peek();
    }

    public int tamanio() {
        return cola.size();
    }

    public String listarEstudiantes() {
        String resultado = "";
        for (Paciente estudiante : cola) {
            resultado += estudiante;
        }
        return resultado;
    }

}
