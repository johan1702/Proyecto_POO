
package modelo;

public class Eleccion {
    private int dia;
    private int mes;
    private int ano;
    private String tipoEleccion;
    ////////////// CANDIDATOS ASOCIACION UNA ELECCION TIENE VARIOS CANDIDATOS  /List<Candidato> candidatos;/////////////////
    
    //==================================CONSTRUCTORES=========================================//
    public Eleccion(int dia, int mes, int ano, String tipoEleccion){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.tipoEleccion = tipoEleccion;
    }
    //===================================GETTERS==============================================//
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public String getTipoEleccion(){
        return tipoEleccion;
    }
    //====================================SETTERS==================================================//
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setTipoEleccion(String tipoEleccion){
        this.tipoEleccion = tipoEleccion;
    }
    //=====================================OTROS METODOS===========================================//
    
    /*  public Eleccion crearEleccion(){
        Eleccion objEleccion1 = new Eleccion(dia, mes, ano, tipoEleccion);
        return objEleccion1;
    }*/
    public void ModificarEleccion(int dia, int mes, int ano, String tipoEleccion){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.tipoEleccion = tipoEleccion; 
    }
    public void EliminarEleccion(){
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
        this.tipoEleccion = null; 
    }
}
