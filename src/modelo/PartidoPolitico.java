
package modelo;

public class PartidoPolitico {
    private String nombre;
    private String sigla;
    private String logo; 
    private String representate;
    //==================================CONSTRUCTORES=========================================//
    public PartidoPolitico(String nombre, String sigla, String logo, String representate){
        this.nombre = nombre;
        this.sigla = sigla;
        this.logo = logo;
        this.representate = representate;
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
    public String getRepresentate(){
        return representate;
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
    public void setRepresentate(String representate){
        this.representate = representate;
    }
    //=====================================OTROS METODOS===========================================//
    public void ModificarPartidoPolitico(String nombre, String sigla, String logo, String representate){
        this.nombre = nombre;
        this.sigla = sigla;
        this.logo = logo;
        this.representate = representate; 
    }
     public void EliminarPartidoPolitico(){
        this.nombre = null;
        this.sigla = null;
        this.logo = null;
        this.representate = null; 
    }
}
