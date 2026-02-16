
package modelo;

public class MiembroDeMesa {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private String tipo;
    
    //METODOS
    //CONSTRCUTOR CON PARAMETROS
    public MiembroDeMesa(String nombre, String apellido, String tipo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getTipo(){
        return tipo;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
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
        System.out.println("Nombre: "+ nombre 
                + "\n Apellido: " + apellido 
                + "\n Tipo: " + tipo);
    }
    
    //
}
