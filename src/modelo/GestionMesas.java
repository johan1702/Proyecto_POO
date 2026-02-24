
package modelo;
public class GestionMesas {
    // ATRIBUTOS
    private MesaElectoral[] mesas;
    private int numero; // nro. de productos
    private final static int MAX = 5;
    
    // CONSTRUCTOR
    public GestionMesas(){
        mesas = new MesaElectoral[MAX];
        numero = 0;
    }

    public int getNro() {
        return numero;
    }
    
    //AGREGAR MESA
    public void agregarMesa(MesaElectoral m){
        if (numero<MAX){
            mesas[numero] = m;
            numero++;
        }else{
            System.out.println("ERROR:MEMORIA LLENA");
        }
    }
    
    //MODIFICAR
    public void modificarPorPosicion(int pos, int nuevoId) {
        if (pos >= 0 && pos < numero) {
            mesas[pos].setIdMesa(nuevoId);
        }else{
            System.out.println("Mesa no encontrada");
        }
    }
    
    /* BUSCAR POR ID
    public MesaElectoral buscarPorId(int id) {
        for (int i = 0; i < numero; i++) {
            if (mesas[i].getIdMesa()== id) {
                return mesas[i];
            }
        }
        return null;
    }*/
    
    //ELIMINAR
    public void eliminarMesa(int pos){
        if (pos>=0 && pos<numero){
            for (int i = pos; i <numero-1; i++) {
                mesas[i] = mesas[i+1];
            }
            numero--;
        }else{
            System.out.println("Error: posicion no valida!!!");
        }
    }
    
    //LONGITUD
    public int longitud(){
        return numero;
    }
    
    //IESIMO
    public MesaElectoral iesimo(int pos){
        if (pos>=0 && pos<numero){
            return mesas[pos];
        }else{
            return null;
        }
    }
    
    //MOSTRAR
    public String mostrarMesas(){
        String mensaje = "";
        for (int i = 0; i < numero; i++) {
            mensaje = mensaje+mesas[i]+"\n";
        }
        return mensaje;
    }
}
    
    
    
    
    

    

