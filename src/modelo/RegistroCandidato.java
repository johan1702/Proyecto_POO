
package modelo;
import java.util.Scanner;
public class RegistroCandidato {
    public static Candidato[] registarCandidatos(){
        Scanner sc = new Scanner(System.in);
        boolean terminado = false;
        int n = 0;
        Candidato[] candidatos = new Candidato[36];
        do{
            System.out.println("Canadidato ("+n+1+"): ");
            System.out.println("Nombre ");
            String nombre = sc.nextLine();
            System.out.println("Apellido: ");
            String apellido = sc.nextLine();
            System.out.println("");
            System.out.println("DNI: ");
            int dni = sc.nextInt();
            System.out.println("Partido: ");
            String partido = sc.nextLine();
            
            //Crearun objeto candidato con los datos leidos
            Candidato c = new Candidato(nombre, apellido, dni, partido);
            
            //Agregar
            candidatos[n] = c;
            n++;
            if (n % 2 == 0) {
               System.out.println("¿Desea Terminar?");
            char opcion = sc.next().charAt(0);
            if(opcion == 'S' || opcion == 's'){
                terminado = true;
                } 
            }           
        }while(!terminado && n<candidatos.length);
        return candidatos;
    }    
    
}
