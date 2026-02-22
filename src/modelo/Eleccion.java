
package modelo;

public class Eleccion {
    //ATRIBUTOS
    private Fecha fecha;
    private String tipoEleccion;
    private Candidato[] candidatos;
    private int cantidadCandidatos; 
    
    //CONSTRUCTORES

    public Eleccion() {
                this.fecha = fecha;
        this.tipoEleccion = "";
    }
    
    
    public Eleccion(Fecha fecha, String tipoEleccion, int capacidad) {
        this.fecha = fecha;
        this.tipoEleccion = tipoEleccion;
        candidatos = new Candidato[capacidad];
        cantidadCandidatos = 0;
    }
    //GETTERS
    public Fecha getFecha() {
        return fecha;
    }
    public String getTipoEleccion() {
        return tipoEleccion;
    }
    public Candidato[] getCandidatos() {
        return candidatos;
    }
    public int getCantidadCandidatos() {
        return cantidadCandidatos;
    }
    
    //SETTER
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public void setTipoEleccion(String tipoEleccion) {
        this.tipoEleccion = tipoEleccion;
    }
    public void setCantidadCandidatos(int cantidadCandidatos) {
        this.cantidadCandidatos = cantidadCandidatos;
    }
    
    //OTROS METODOS
    //AGREGAR CANDIDATOS A ELEECCIÓN    
    public void agregarCandidato(Candidato c){
        if(cantidadCandidatos < candidatos.length){
            candidatos[cantidadCandidatos] = c;
            cantidadCandidatos++;
            System.out.println("Candidato agregado.");
        }else {
            System.out.println("No hay espacio para más candidatos.");
        }
    }
    
    //MODIFICAR LA ELECCIÓN (FECHA Y TIPO)
    public void modificarEleccion(Fecha nuevaFecha, String nuevoTipo) {
        this.fecha = nuevaFecha;
        this.tipoEleccion = nuevoTipo;
    }
    
    //ELIMINAR CANDIDATOS
    public void eliminarCandidatoPorDni(int dni){
    for (int i = 0; i < cantidadCandidatos; i++){
        if(candidatos[i].getDni()== dni){
            for(int j = i; j < cantidadCandidatos-1; j++){
                candidatos[j] = candidatos[j+1];
            }
            candidatos[cantidadCandidatos-1] = null;
            cantidadCandidatos--;
            System.out.println("Candidato eliminado.");
            return;
        }
    }
    }   
}
