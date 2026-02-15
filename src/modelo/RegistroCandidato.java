
package modelo;
import java.util.Scanner;
public class RegistroCandidato {
    public static Candidato[] registarCandidatos(){
        Scanner sc = new Scanner(System.in);
        boolean terminado = false;
        int n = 0;
        Candidato[] candidatos = new Candidato[36];
        do{
            System.out.println("Candidato ("+(n+1)+")");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            System.out.print("DNI: ");
            int dni = sc.nextInt();
            sc.nextLine();
            System.out.print("Partido: ");
            String partido = sc.nextLine();
            
            //Crearun objeto candidato con los datos leidos
            Candidato c = new Candidato(nombre, apellido, dni, partido);
            
            //Agregar
            candidatos[n] = c;
            if (n % 2 == 0) {
               System.out.println("¿Desea Terminar?");
            char opcion = sc.next().charAt(0);
            sc.nextLine();
            if(opcion == 'S' || opcion == 's'){
                terminado = true;
                } 
            }
            n++;
        }while(!terminado && n<candidatos.length);
        return candidatos;
    }    
    
}
