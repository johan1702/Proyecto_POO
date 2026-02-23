/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class GestionEleccion {
     private Eleccion[] elecciones;
    private int nro; // nro. de productos
    private final static int MAX = 5;

    public GestionEleccion() {
        elecciones=new Eleccion[MAX];
        nro=0;
    }
    
    public void agregar(Eleccion e){
        if (nro<MAX){
            elecciones[nro] = e;
            nro++;
        }else{
            System.out.println("ERROR:MEMORIA LLENA");
        }
    }
    
    public void modificarPorPosicion(int id, Fecha nuevaFecha, String nuevoTipo) {
    if (id >= 0 && id < nro) {
        elecciones[id].setFecha(nuevaFecha);
        elecciones[id].setTipoEleccion(nuevoTipo);
    }
}
    
    
    
    
    
}
