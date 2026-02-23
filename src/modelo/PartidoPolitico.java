
package modelo;

public class PartidoPolitico {
    private String nombre;
    private String sigla;
    private String logo; 
    private String representante;
    //==================================CONSTRUCTORES=========================================//
    public PartidoPolitico(String nombre, String sigla, String logo, String representante){
        this.nombre = nombre;
        this.sigla = sigla;
        this.logo = logo;
        this.representante = representante;
    }
    //===================================GETTERS==============================================//
    public String getNombre(){
        return nombre;
    }   
    public String getSigla(){
        return sigla;
    }
    public String getLogo(){
        return logo;
    }
    public String getRepresentante(){
        return representante;
    }
    //====================================SETTERS==================================================//
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    public void setLogo(String logo){
        this.logo = logo;
    }
    public void setRepresentate(String representante){
        this.representante = representante;
    }
    //=====================================OTROS METODOS===========================================//
    public void ModificarPartidoPolitico(String nombre, String sigla, String logo, String representante){
        this.nombre = nombre;
        this.sigla = sigla;
        this.logo = logo;
        this.representante = representante; 
    }
     public void EliminarPartidoPolitico(){
        this.nombre = null;
        this.sigla = null;
        this.logo = null;
        this.representante = null; 
    }
    public String verInfo(){
        return "Nombre: " + nombre + "\n Siglas: " + sigla + "\n Descripcion logo: " + logo + "\n Representante legal: " + representante + "\n";
    }
}
