package app.dataStruct;

import app.logic.users.Paciente;
import java.util.LinkedList;
import java.util.Queue;

public final class ColaPacientes {

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
        for (Paciente paciente : cola) {
            resultado += paciente;
        }
        return resultado;
    }

    // Ordenar por prioridad
    /*
    public void ordenar() {
        Queue<Paciente> colaOrdenada = new LinkedList();
        while (!cola.isEmpty()) {
            Paciente paciente = cola.poll();
            if (colaOrdenada.isEmpty()) {
                colaOrdenada.add(paciente);
            } else {
                boolean agregado = false;
                for (Paciente pacienteOrdenado : colaOrdenada) {
                    if (paciente.getEdad() < pacienteOrdenado.getEdad()) {
                        colaOrdenada.add(colaOrdenada.indexOf(pacienteOrdenado), paciente);
                        agregado = true;
                        break;
                    }
                }
                if (!agregado) {
                    colaOrdenada.add(paciente);
                }
            }
        }
        cola = colaOrdenada;
    }
*/

}//end ColaPacientes
//end file

