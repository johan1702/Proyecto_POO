
package modelo;

public class GestionMesas {
    // Atributos
    private MesaElectoral[] mesas;
    private int nro; // nro. de productos
    private final static int MAX = 5;
    // metodos
    public GestionMesas(){
        mesas = new MesaElectoral[MAX];
        nro = 0;
    }

    public int getNro() {
        return nro;
    }
    
    
    public void agregar(MesaElectoral o1){
        if (nro<MAX){
            mesas[nro] = o1;
            nro++;
        }else{
            System.out.println("ERROR:MEMORIA LLENA");
        }
    }
    public String mostrarDatos(){
        String mensaje = "";
        for (int i = 0; i < nro; i++) {
            mensaje = mensaje+mesas[i]+"\n";
        }
        return mensaje;
    }
    public int longitud(){
        return nro;
    }
    public MesaElectoral iesimo(int pos){
        if (pos>=0 && pos<nro){
            return mesas[pos];
        }else{
            return null;
        }
    }
    
    public void eliminar(int pos){
        if (pos>=0 && pos<nro){
            for (int i = pos; i <nro-1; i++) {
                mesas[i] = mesas[i+1];
            }
            nro--;
        }else{
            System.out.println("Error: posicion no valida!!!");
        }
    }
}
