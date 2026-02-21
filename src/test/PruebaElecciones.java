
package test;
import modelo.*;
import modelo.ResultadoCandidato;
import java.util.Scanner;
public class PruebaElecciones {
    public static void main(String[] args) {
        //////////////////////INTERFAZ ENTRADA USUARIO--CONTRASEÑA/////////////////////////////
        ///import modelo.SistemaAutenticacion;
        
        SistemaAutenticacion.iniciarSesion();
        //////Usuario: Sistemas////////
        //////Contraseña: 123//////////
        MenuSistema.ejecutar();


        
           /*/-------------------------------PRUEBA 1----------------------------------//
            Fecha f1 = new Fecha(17,02,2007);
            Hora h1 = new Hora(13,50);
            Candidato c1 = new Candidato("renato","quispe",939139,"lpp");
            Candidato c2 = new Candidato("Luis","Perez",123456,"APRA");
            ResultadoCandidato r1 = new ResultadoCandidato(c1,60,2);
            ResultadoCandidato r2 = new ResultadoCandidato(c2,40,1);
            ResultadoCandidato[] res = new ResultadoCandidato[2];
            res[0] = r1;
            res[1] = r2;
            ActaElectoral a1 = new ActaElectoral("jujen",f1,h1,"chorriyork",12,50,20,res,4,2,"agresion",true,true,1);
            a1.verInfo();
          *///////////////////////////////////////////////////////////////
            
            
         

                
          /*  Candidato R1[] = RegistroCandidato.registarCandidatos();
         ResultadoCandidato[] resultados = new ResultadoCandidato[R1.length];
         Scanner sc = new Scanner(System.in);
         for (int i = 0; i < R1.length; i++) {
             if (R1[i] != null) {
                 System.out.println("---------------Ingrese votos para---------- ");
                 System.out.println(R1[i].verInfo());
                 System.out.print("Votos totales: ");
                 int votos = sc.nextInt();
                 System.out.print("Votos preferenciales: ");
                 int votosPreferenciales = sc.nextInt();
                 resultados[i] = new ResultadoCandidato(R1[i],votos,votosPreferenciales);
             }
        }
         SistemaVotos.desgloseCandidatos(resultados); */
        
            

        
    }      
}  