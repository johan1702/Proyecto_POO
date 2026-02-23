
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
    
    
    public void agregar(Candidato c){
        if (numero<MAX){
            candidatos[numero] = c;
            numero++;
        }else{
            System.out.println("ERROR:MEMORIA LLENA");
        }
    }
    public String mostrarDatos(){
        String mensaje = "";
        for (int i = 0; i < numero; i++) {
            mensaje = mensaje+candidatos[i]+"\n";
        }
        return mensaje;
    }
    public int longitud(){
        return numero;
    }

    public boolean eliminarPorDni(int dni) {
        int pos = buscarPorDni(dni);
        if (pos == -1) {
            return false;  // no encontrado
        }
    // mover elementos hacia la izquierda
        for (int i = pos; i < numero - 1; i++) {
            candidatos[i] = candidatos[i + 1];
        }
        candidatos[numero - 1] = null; // limpiar última posición
        numero--;  // reducir cantidad
        return true;
        }
    public void eliminar(int pos){
        if (pos>=0 && pos<numero){
            for (int i = pos; i <numero-1; i++) {
                candidatos[i] = candidatos[i+1];
            }
            numero--;
        }else{
            System.out.println("Error: posicion no valida!!!");
        }
    }
    
        public int buscarPorDni(int dni) {
    for (int i = 0; i < numero; i++) {
        if (candidatos[i].getDni() == dni) {
            return i;  // devuelve la posición donde lo encontró
        }
    }
    return -1;  // si no lo encuentra
}

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
}
