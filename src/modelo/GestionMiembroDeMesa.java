
package modelo;
public class GestionMiembroDeMesa {
    //ATRIBUTOS
    private MiembroDeMesa[] miembrosmesa;
    private int numero;
    private final static int MAX = 6;
    
    // COINSTRUCTOR
    public GestionMiembroDeMesa() {
        miembrosmesa = new MiembroDeMesa[MAX];
        numero = 0;
    }
    
    // AGREGAR MIEMBRO
    public void agregarMiembro(MiembroDeMesa m) {
        if (numero < MAX) {
            miembrosmesa[numero] = m;
            numero++;
        } else {
            System.out.println("Memoria llena");
        }
    }
    
    // MODIFICAR MIEMBRO 
    public void modificarPorPosicion(int pos,String nuevoNombre,String nuevoApellido,
            String nuevoTipo) {
        if (pos >= 0 && pos < numero) {
            miembrosmesa[pos].setNombre(nuevoNombre);
            miembrosmesa[pos].setApellido(nuevoApellido);
            miembrosmesa[pos].setTipo(nuevoTipo);
        }
    }
    
    //ELIMINAR
    public void eliminarMiembro(int pos) {
        if (pos >=0 && pos <numero){
            for (int i = pos; i < numero-1; i++) {
                miembrosmesa[i] = miembrosmesa[i+1];
            }
            numero--;
        }else{
            System.out.println("Partido no encontrado");
        }
    }
    
    // LONGITUD
    public int longitud() {
        return numero;
    }

    // IESIMO
    public MiembroDeMesa iesimo(int pos) {
        if (pos >= 0 && pos < numero) {
            return miembrosmesa[pos];
        }
        return null;
    }
    
    // MOSTRAR MIEMBROS
    public void mostrarMiembros() {
        for (int i = 0; i < numero; i++) {
            System.out.println(miembrosmesa[i]);
        }
    }
}
