
package modelo;
////////////////CLASE HIJA////////////
public class MiembroDeMesa extends Persona {
    //ATRIBUTOS
    private String tipo;
    private int id;
    

    //CONSTRCUTOR CON PARAMETROS
    public MiembroDeMesa(String nombre, String apellido, String tipo, int id){
        super(nombre, apellido);
        this.tipo = tipo;
        this.id = id;
    }
    
    //GETTERS
    public String getTipo(){
        return tipo;
    }
    public int getId(){
        return id;
    }
    
    //SETTERS
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setId(int id){
        this.id = id;
    }
    
    //MOSTRAR INFORMACION
    @Override
    public String verInfo(){
        return super.verInfo() + "\n Tipo: " + tipo + "\n";
    }
}
