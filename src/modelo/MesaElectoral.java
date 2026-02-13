
package modelo;
import java.util.Scanner;
public class MesaElectoral {
    
    //ATRIBUTOS
    private int idMesa;
    private MiembroDeMesa[] miembros;
    private int n;
    
    //METODOS
    //CONSTRCUTOR CON PARAMETROS
    public MesaElectoral(int idMesa, int capacidad){
        this.idMesa = idMesa;
        miembros = new MiembroDeMesa[capacidad];
        n = 0;
    }

    //GETTERS AND SETTERS
    public int getIdme() {
        return idMesa;
    }
    public void setIdme(int idMesa) {
        this.idMesa = idMesa;
    }
    
    //REGISTRRAR MIEMBROS DE MESA
    public void registrarMiembroDeMesa(){
        Scanner sc = new Scanner(System.in);
        boolean terminado = false;
        do{
            System.out.println("Miembro de mesa (" + (n+1) + ")");
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            
            System.out.println("Apellido: ");
            String apellido = sc.nextLine();
            
            System.out.println("Tipo: ");
            String tipo = sc.nextLine();

            MiembroDeMesa m = new MiembroDeMesa(nombre, apellido, tipo);
            miembros[n] = m;
            n++;

            System.out.println("¿Desea agregar más miembros? (S/N)");
            char opcion = sc.next().charAt(0);
            sc.nextLine();
            if(opcion == 'N' || opcion == 'n'){
                terminado = true;
            }
        }while(!terminado && n < miembros.length);
    }

    public void mostrarMesa(){
        System.out.println("ID Mesa: " + idMesa);
        for(int i = 0; i < n; i++){
            miembros[i].mostrar();
        }
    }
    
    }
    
