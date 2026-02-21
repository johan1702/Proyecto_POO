
package modelo;
////////////////CLASE HIJA////////////
public class MiembroDeMesa extends Persona {
    //ATRIBUTOS
    private String tipo;
    

    //CONSTRCUTOR CON PARAMETROS
public MiembroDeMesa(String nombre, String apellido, String tipo){
    super(nombre, apellido);
    this.tipo = tipo;
}
    
    //GETTERS

    public String getTipo(){
        return tipo;
    }
    
    //SETTERS
   
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //MODIFICAR MIEMBROS DE MESA
    public void modificarMiembroDeMesa(String nombre, String apellido, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo; 
    }
    
    //MOSTRAR INFORMACION
    public void mostrar(){
        System.out.println(super.mostrarPersona() + 
                           "\nTipo: " + tipo);
    }
    
    //
}
