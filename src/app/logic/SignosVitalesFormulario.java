package app.logic;

public class SignosVitalesFormulario {

    // Atributos
    private int id;
    private String pacienteId;
    private int peso;
    private int altura;
    private int respiracion;
    private int tension;
    private int pulso;
    private String grupoSanguieno;
    private int prioridad;
    private Fecha fecha;

    public SignosVitalesFormulario() {
    }

    public SignosVitalesFormulario(int id, String pacienteId, int peso, int altura, int respiracion, int tension, int pulso, String grupoSanguieno, int prioridad, Fecha fecha) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.peso = peso;
        this.altura = altura;
        this.respiracion = respiracion;
        this.tension = tension;
        this.pulso = pulso;
        this.grupoSanguieno = grupoSanguieno;
        this.prioridad = prioridad;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(String pacienteId) {
        this.pacienteId = pacienteId;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getRespiracion() {
        return respiracion;
    }

    public void setRespiracion(int respiracion) {
        this.respiracion = respiracion;
    }

    public int getTension() {
        return tension;
    }

    public void setTension(int tension) {
        this.tension = tension;
    }

    public int getPulso() {
        return pulso;
    }

    public void setPulso(int pulso) {
        this.pulso = pulso;
    }

    public String getGrupoSanguieno() {
        return grupoSanguieno;
    }

    public void setGrupoSanguieno(String grupoSanguieno) {
        this.grupoSanguieno = grupoSanguieno;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getPrioridadString() {
        /*
        1 = Resucitación
        2 = Emergencia
        3 = Urgencia
        4 = Urgencia menor
        5 = Sin urgencia
         */
        switch (prioridad) {
            case 1:
                return "Resucitación";
            case 2:
                return "Emergencia";
            case 3:
                return "Urgencia";
            case 4:
                return "Urgencia menor";
            case 5:
                return "Sin urgencia";
            default:
                return "Sin prioridad";
        }
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return id + " , prioridad=" + prioridad + ", fecha=" + fecha;
    }

}
