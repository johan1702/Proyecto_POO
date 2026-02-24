
package modelo;

public class GestionCandidato {
    // Atributos
    private Candidato[] candidatos;
    private int numero; // nro. de productos
    private final static int MAX = 36;
    // metodos
    public GestionCandidato(){
        candidatos = new Candidato[MAX];
        numero = 0;
    }

    public int getNro() {
        return numero;
    }
    
    //AGREGAR CANDIDATOS
    public void agregar(Candidato c){
        if (numero<MAX){
            candidatos[numero] = c;
            numero++;
        }else{
            System.out.println("ERROR:MEMORIA LLENA");
        }
    }
    
    
    //ELIMINAR POR DNI
    public int buscarPorDni(int dni) {
        for (int i = 0; i < numero; i++) {
            if (candidatos[i].getDni() == dni) {
                return i;  // devuelve la posición donde lo encontró
            }
        }
        return -1;  // si no lo encuentra
    }
    
    public void eliminarCandidato(int pos) {
        if (pos >=0 && pos <numero){
            for (int i = pos; i < numero-1; i++) {
                candidatos[i] = candidatos[i+1];
            }
            numero--;
        }else{
            System.out.println("Candidato no encontrado");
        }
    }
    
    //MODIFICAR
    public void modificarPorDni(int dni, String nuevoNombre,String nuevoApellido,PartidoPolitico nuevoPartido) {
        int pos = buscarPorDni(dni);
        if (pos != -1) {
            candidatos[pos].setNombre(nuevoNombre);
            candidatos[pos].setApellido(nuevoApellido);
            candidatos[pos].setPartido(nuevoPartido);
            System.out.println("Candidato modificado correctamente");
        } else {
            System.out.println("Candidato no encontrado");
        }
    }
    
    // LONGITUD
    public int longitud() {
        return numero;
    }

    // IESIMO
    public Candidato iesimo(int pos) {
        if (pos >= 0 && pos < numero) {
            return candidatos[pos];
        }
        return null;
    }
    
    //MOSTRAR LOS DATOS
    public String mostrarCandidatos(){
        String mensaje = "";
        for (int i = 0; i < numero; i++) {
            mensaje = mensaje+candidatos[i]+"\n";
        }
        return mensaje;
    }
}
