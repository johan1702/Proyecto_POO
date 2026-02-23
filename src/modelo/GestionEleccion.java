
package modelo;

public class GestionEleccion {
     private Eleccion[] elecciones;
    private int nro; // nro. de productos
    private final static int MAX = 4; // senadores y diputados, presidencial, comunidad andina, alcaldia

    public GestionEleccion() {
        elecciones=new Eleccion[MAX];
        nro=0;
    }
    
    //AGREGAR
    public void agregar(Eleccion e){
        if (nro<MAX){
            elecciones[nro] = e;
            nro++;
        }else{
            System.out.println("ERROR:MEMORIA LLENA");
        }
    }
    
    //MODIFICAR
    public void modificarPorPosicion(int id, Fecha nuevaFecha, String nuevoTipo) {
        if (id >= 0 && id < nro) {
            elecciones[id].setFecha(nuevaFecha);
            elecciones[id].setTipoEleccion(nuevoTipo);
        }
    }    
}
