
package modelo;
public class Candidato extends Persona {
    
    ///////////////////CLASE HIJA////////////// 
    private int dni;
    private String partido;
    //==================================CONSTRUCTORES=========================================//
    public Candidato(String nombre, String apellido, int dni, String partido){
    super(nombre, apellido);
    this.dni = dni;
    this.partido = partido;
}
    //===================================GETTERS==============================================//

    public int getDni(){
        return dni;
    }
    public String getPartido(){
        return partido;
    }
    //====================================SETTERS==================================================//
    
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setPartido(String partido){
        this.partido = partido;
    }
    //=====================================OTROS METODOS===========================================//
    public void ModificarCandidato(String nombre, String apellido, int dni, String partido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.partido = partido; 
    }
    public void EliminarCandidato(){
        this.nombre = null;
        this.apellido = null;
        this.dni = 0;
        this.partido = null; 
    }

    public String verInfo(){
    return super.mostrarPersona() +
           "\nDni: " + dni +
           "\nPartido: " + partido;
}
}
