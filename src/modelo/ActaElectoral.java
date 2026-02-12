
package modelo;
public class ActaElectoral {
    //ATRIBUTOS
    private String titulo;
    private Fecha fecha;
    private String hora;
    private String lugar;
    
    //METODOS
    public ActaElectoral(String titulo, Fecha fecha, String hora, String lugar) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
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
    
    
}
