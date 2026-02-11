
package modelo;

public class Candidato {
    private String nombre;
    private String apellido;
    private int dni;
    private String partido;
    //==================================CONSTRUCTORES=========================================//
    public Candidato(String nombre, String apellido, int dni, String partido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.partido = partido;
    }
    //===================================GETTERS==============================================//
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getDni(){
        return dni;
    }
    public String getPartido(){
        return partido;
    }
    //====================================SETTERS==================================================//
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setPartido(String partido){
        this.partido = partido;
    }
    //=====================================OTROS METODOS===========================================//
    //REGISTRAR CANDIDATO GESTION NO CLASE ORIGINAL//
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
}
