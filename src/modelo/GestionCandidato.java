/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class GestionCandidato {
    // Atributos
    private Candidato[] candidatos;
    private int nro; // nro. de productos
    private final static int MAX = 36;
    // metodos
    public GestionCandidato(){
        candidatos = new Candidato[MAX];
        nro = 0;
    }

    public int getNro() {
        return nro;
    }
    
    
    public void agregar(Candidato o1){
        if (nro<MAX){
            candidatos[nro] = o1;
            nro++;
        }else{
            System.out.println("ERROR:MEMORIA LLENA");
        }
    }
    public String mostrarDatos(){
        String mensaje = "";
        for (int i = 0; i < nro; i++) {
            mensaje = mensaje+candidatos[i]+"\n";
        }
        return mensaje;
    }
    public int longitud(){
        return nro;
    }
    public Candidato iesimo(int pos){
        if (pos>=0 && pos<nro){
            return candidatos[pos];
        }else{
            return null;
        }
    }
    
    public void eliminar(int pos){
        if (pos>=0 && pos<nro){
            for (int i = pos; i <nro-1; i++) {
                candidatos[i] = candidatos[i+1];
            }
            nro--;
        }else{
            System.out.println("Error: posicion no valida!!!");
        }
    }
}
