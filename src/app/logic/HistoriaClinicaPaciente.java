package app.logic;

/**
 * Programa AsclepioHC Clase HistoriaClinicaPaciente
 *
 */
public class HistoriaClinicaPaciente {

    /*-------------------------------------------------------------
    /Atributos de la clase HistoriaClinicaPaciente
    /-------------------------------------------------------------*/
    private String pacienteId;
    private String ocupacion;
    private String nacionalidad;
    private String estadoCivil;
    private boolean padreFallecido;
    private boolean madreFallecido;
    private String antecedentesPadre;
    private String antecedentesMadre;
    private String otros;
    private boolean alcohol;
    private boolean tabaco;
    private boolean drogas;
    private String enfermedades;
    private String medicacion;
    private String motivoConsulta;
    private String sintomas;
    private String comentarios;


    /*-------------------------------------------------------------
    /Constructores de la clase HistoriaClinicaPaciente
    /-------------------------------------------------------------*/
    /**
     * Constructor por defecto de la clase HistoriaClinicaPaciente
     */
    public HistoriaClinicaPaciente() {
    }

    /**
     * Constructor de la clase Usuario con parametros
     *
     * @param pacienteId
     * @param ocupacion
     * @param tabaco
     * @param nacionalidad
     * @param estadoCivil
     * @param padreFallecido
     * @param antecedentesPadre
     * @param madreFallecido
     * @param drogas
     * @param alcohol
     * @param otros
     * @param antecedentesMadre
     * @param enfermedades
     * @param medicacion
     * @param motivoConsulta
     * @param sintomas
     * @param comentarios
     */
    public HistoriaClinicaPaciente(String pacienteId, String ocupacion, String nacionalidad, String estadoCivil, boolean padreFallecido, boolean madreFallecido, String antecedentesPadre, String antecedentesMadre, String otros, boolean alcohol, boolean tabaco, boolean drogas, String enfermedades, String medicacion, String motivoConsulta, String sintomas, String comentarios) {
        this.pacienteId = pacienteId;
        this.ocupacion = ocupacion;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.padreFallecido = padreFallecido;
        this.madreFallecido = madreFallecido;
        this.antecedentesPadre = antecedentesPadre;
        this.antecedentesMadre = antecedentesMadre;
        this.otros = otros;
        this.alcohol = alcohol;
        this.tabaco = tabaco;
        this.drogas = drogas;
        this.enfermedades = enfermedades;
        this.medicacion = medicacion;
        this.motivoConsulta = motivoConsulta;
        this.sintomas = sintomas;
        this.comentarios = comentarios;
    }

    /*-------------------------------------------------------------
    /Métodos get y set de la clase HistoriaClinicaPaciente
    /-------------------------------------------------------------*/
    public String getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(String pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean isPadreFallecido() {
        return padreFallecido;
    }

    public void setPadreFallecido(boolean padreFallecido) {
        this.padreFallecido = padreFallecido;
    }

    public boolean isMadreFallecido() {
        return madreFallecido;
    }

    public void setMadreFallecido(boolean madreFallecido) {
        this.madreFallecido = madreFallecido;
    }

    public String getAntecedentesPadre() {
        return antecedentesPadre;
    }

    public void setAntecedentesPadre(String antecedentesPadre) {
        this.antecedentesPadre = antecedentesPadre;
    }

    public String getAntecedentesMadre() {
        return antecedentesMadre;
    }

    public void setAntecedentesMadre(String antecedentesMadre) {
        this.antecedentesMadre = antecedentesMadre;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public boolean isTabaco() {
        return tabaco;
    }

    public void setTabaco(boolean tabaco) {
        this.tabaco = tabaco;
    }

    public boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(boolean drogas) {
        this.drogas = drogas;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "HistoriaClinicaPaciente{" + "pacienteId=" + pacienteId + ", ocupacion=" + ocupacion + ", nacionalidad=" + nacionalidad + ", estadoCivil=" + estadoCivil + ", padreFallecido=" + padreFallecido + ", madreFallecido=" + madreFallecido + ", antecedentesPadre=" + antecedentesPadre + ", antecedentesMadre=" + antecedentesMadre + ", otros=" + otros + ", alcohol=" + alcohol + ", tabaco=" + tabaco + ", drogas=" + drogas + ", enfermedades=" + enfermedades + ", medicacion=" + medicacion + '}';
    }

}
