
package modelo;
import java.util.Scanner;
public class MesaElectoral {
    
    //ATRIBUTOS
    private int idMesa;
    private MiembroDeMesa[] miembroDeMesa;
    private int n; //cantidad de mesas
    
    //METODOS
    //CONSTRCUTOR CON PARAMETROS
    public MesaElectoral(int idMesa, int n){
        this.idMesa = idMesa;
        this.miembroDeMesa = new MiembroDeMesa[6];
        // llenar data
        registrarMiembroDeMesa();
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
        for (int i = 0; i < miembroDeMesa.length; i++) {
            System.out.println("Miembro de mesa ["+(i+1)+"]");
            System.out.println("Ingrese Nombres: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese Apellidos:  ");
            String apellido = sc.nextLine();
            System.out.println("Ingrese tipo: ");
            String tipo = sc.next();
            MiembroDeMesa m1 = new MiembroDeMesa(nombre,apellido,tipo);
            miembroDeMesa[i] = m1;
        }
    }
    
    public void mostrarMesa(){
        System.out.println("ID Mesa: " + idMesa);
        for(int i = 0; i < n; i++){
            miembroDeMesa[i].mostrar();
        }
    }
    
    }
    
