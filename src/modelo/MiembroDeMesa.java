package modelo;

public class MiembroDeMesa {
    private String nombre;
    private String apellido;
    private String tipo;
    //==================================CONSTRUCTORES=========================================//
    public MiembroDeMesa(String nombre, String apellido, String tipo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
    }
    //===================================GETTERS==============================================//
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getTipo(){
        return tipo;
    }
    //====================================SETTERS==================================================//
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    //=====================================OTROS METODOS===========================================//
    public void ModificarMiembroDeMesa(String nombre, String apellido, String tipo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo; 
    }
    public void EliminarMiembroDeMesa(){
        this.nombre = null;
        this.apellido = null;
        this.tipo = null; 
    }
    
}
