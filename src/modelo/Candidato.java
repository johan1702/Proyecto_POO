
package modelo;
import java.util.*;
public class Candidato {
    private String nombre;
    private String apellido;
    private int dni;
    private String partido;
    private Candidato[] candidatos;
    private int n;
    //==================================CONSTRUCTORES=========================================//
    public Candidato(String nombre, String apellido, int dni, String partido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.partido = partido;
        n = 0; 
        candidatos = new Candidato[n];  //n=numero de los candidatos
    }
    //===================================GETTERS==============================================//
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getDni(){
        return dni;
    }
    public String getPartido(){
        return partido;
    }
    //====================================SETTERS==================================================//
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setPartido(String partido){
        this.partido = partido;
    }
    //=====================================OTROS METODOS===========================================//
    //REGISTRAR CANDIDATO 
    public void registrarCandidato(){
        Scanner sc = new Scanner(System.in);
        boolean terminado = false;
        do{
            System.out.println("Canadidato ("+n+1+"): ");
            System.out.println("Nombre ");
            nombre = sc.nextLine();
            System.out.println("Apellido: ");
            apellido = sc.nextLine();
            System.out.println("DNI: ");
            dni = sc.nextInt();
            System.out.println("Partido: ");
            partido = sc.nextLine();
            
            //Crearun objeto candidato con los datos leidos
            Candidato c = new Candidato(nombre, apellido, dni, partido);
            
            //Agregar
            candidatos[n] = c;
            n++;
            System.out.println("¿Desea agregar mas candidatos?");
            char opcion = sc.next().charAt(0);
            if(opcion == 'N' || opcion == 'n'){
                terminado = true;
            }
        }while(!terminado && n<candidatos.length);
    }
    
    public void ModificarCandidato(String nombre, String apellido, int dni, String partido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.partido = partido; 
    }
    public void EliminarCandidato(){
        this.nombre = null;
        this.apellido = null;
        this.dni = 0;
        this.partido = null; 
    }
}
