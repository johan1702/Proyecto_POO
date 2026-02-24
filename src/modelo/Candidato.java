
package modelo;
public class Candidato extends Persona {
    ///////////////////CLASE HIJA////////////// 
    private int dni;
    private PartidoPolitico partido;
    //==================================CONSTRUCTORES=========================================//
    public Candidato(String nombre, String apellido, int dni, PartidoPolitico partido){
    super(nombre, apellido);
    this.dni = dni;
    this.partido = partido;
}
    //===================================GETTERS==============================================//

    public int getDni(){
        return dni;
    }
    public PartidoPolitico getPartido(){
        return partido;
    }
    //====================================SETTERS==================================================//
    
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setPartido(PartidoPolitico partido){
        this.partido = partido;
    }
    
    @Override
    public String verInfo(){
    return super.verInfo() + "\n Dni: " + dni + " \n Partido: " + partido.verInfo();
    }
   
}
