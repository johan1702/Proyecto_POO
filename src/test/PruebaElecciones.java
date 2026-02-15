
package test;
import modelo.*;
public class PruebaElecciones {
    public static void main(String[] args) {
        RegistroCandidato.registarCandidatos();
        
        
        
        
        
        
        
        
        
        
        
        
        //-------------------------------PRUEBA 1----------------------------------//
            Fecha f1 = new Fecha(17,02,2007);
            Hora h1 = new Hora(13,50);
            Candidato c1 = new Candidato("renato","quispe",939139,"lpp");
            ResultadoCandidato r1 = new ResultadoCandidato(c1,60,2);
            ResultadoCandidato[] res = new ResultadoCandidato[1];
            res[0] = r1;
            ActaElectoral a1 = new ActaElectoral("jojna",f1,h1,"chorriyork",12,50,20,res,4,2,"agresion",true,true,1);
            a1.verInfo();
    }   
}
