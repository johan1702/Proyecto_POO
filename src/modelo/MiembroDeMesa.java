
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
    
    //MOSTRAR INFORMACION
    @Override
    public String verInfo(){
        return super.verInfo() + "\n Tipo: " + tipo + "\n";
    }
}
