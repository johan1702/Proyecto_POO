
package modelo;

public class ActaElectoral {
    //ATRIBUTOS
    private String titulo;
    private Fecha fecha;
    private String hora;
    private String lugar;
    private String identificacionMesa;
    private String nombreMM;
    private int totalVotantes;
    private int totalEfectivos;
    
    //METODOS
    public ActaElectoral(String titulo, Fecha fecha, String hora, String lugar, 
            String identificacionMesa, String nombresMM, int totalVotantes, int totalEfectivos) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.identificacionMesa = identificacionMesa;
        this.nombreMM = nombreMM;
        this.totalVotantes = totalVotantes;
        this.totalEfectivos = totalEfectivos;
    }
    
    //GETTERS AND SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getIdentificacionMesa() {
        return identificacionMesa;
    }

    public void setIdentificacionMesa(String identificacionMesa) {
        this.identificacionMesa = identificacionMesa;
    }

    public String getNombreMM() {
        return nombreMM;
    }

    public void setNombreMM(String nombreMM) {
        this.nombreMM = nombreMM;
    }

    public int getTotalVotantes() {
        return totalVotantes;
    }

    public void setTotalVotantes(int totalVotantes) {
        this.totalVotantes = totalVotantes;
    }

    public int getTotalEfectivos() {
        return totalEfectivos;
    }

    public void setTotalEfectivos(int totalEfectivos) {
        this.totalEfectivos = totalEfectivos;
    }
    
}
