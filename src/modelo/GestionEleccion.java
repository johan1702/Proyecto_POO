
package modelo;

public class GestionEleccion {
     private Eleccion[] elecciones;
    private int numero; // nro. de productos
    private final static int MAX = 4; // senadores y diputados, presidencial, comunidad andina, alcaldia

    public GestionEleccion() {
        elecciones=new Eleccion[MAX];
        numero=0;
    }
    
    //AGREGAR
    public void agregar(Eleccion e){
        if (numero<MAX){
            elecciones[numero] = e;
            numero++;
        }else{
            System.out.println("ERROR:MEMORIA LLENA");
        }
    }
    
    //MODIFICAR
    public void modificarPorPosicion(int id, Fecha nuevaFecha, String nuevoTipo) {
        if (id >= 0 && id < numero) {
            elecciones[id].setFecha(nuevaFecha);
            elecciones[id].setTipoEleccion(nuevoTipo);
        }
    }

    //ELIMINAR
    public void eliminarEleccion(int pos) {
        if (pos >=0 && pos <numero){
            for (int i = pos; i < numero-1; i++) {
                elecciones[i] = elecciones[i+1];
            }
            numero--;
        }else{
            System.out.println("Eleccion no encontrado");
        }
    }
    
    // LONGITUD
    public int longitud() {
        return numero;
    }

    // IESIMO
    public Eleccion iesimo(int pos) {
        if (pos >= 0 && pos < numero) {
            return elecciones[pos];
        }
        return null;
    }
    
    //MOSTRAR DATOS
    public String mostrarGestionEleccion(){
        String mensaje = "";
        for (int i = 0; i < numero; i++) {
            mensaje = mensaje + elecciones[i] + "\n";
        }
        return mensaje;
    }
}
