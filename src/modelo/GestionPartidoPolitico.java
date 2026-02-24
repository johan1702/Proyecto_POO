package modelo;

public class GestionPartidoPolitico {
    private PartidoPolitico[] partidos;
    private int numero;
    private final static int MAX = 5;

    // CONSTRUCTOR
    public GestionPartidoPolitico() {
        partidos = new PartidoPolitico[MAX];
        numero = 0;
    }

    // AGREGAR PARTIDO
    public void agregarPartido(PartidoPolitico p) {
        if (numero < MAX) {
            partidos[numero] = p;
            numero++;
        } else {
            System.out.println("Memoria llena");
        }
    }

    //MODIFICAR
    public int buscarPorNombre(String nombre) {
        for (int i = 0; i < numero; i++) {
            if (partidos[i].getNombre().equalsIgnoreCase(nombre)) {
                return i;  // devuelve la posición
            }
        }
        return -1;  // no encontrado
    }
    public void modificarPorNombre(String nombreBuscado, String nuevoNombre, 
            String nuevaSigla, String nuevoRepresentante) {
        int pos = buscarPorNombre(nombreBuscado);
        if (pos != -1) {
            partidos[pos].setNombre(nuevoNombre);
            partidos[pos].setSigla(nuevaSigla);
            partidos[pos].setRepresentate(nuevoRepresentante);
            System.out.println("Partido modificado correctamente");
        }else {
            System.out.println("Partido no encontrado");
        }
    }

    
    //ELIMINAR
    public void eliminarPartido(int pos) {
        if (pos >=0 && pos <numero){
            for (int i = pos; i < numero-1; i++) {
                partidos[i] = partidos[i+1];
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
    public PartidoPolitico iesimo(int pos) {
        if (pos >= 0 && pos < numero) {
            return partidos[pos];
        }
        return null;
    }
    
    // MOSTRAR PARTIDOS
    public void mostrarPartidos() {
        for (int i = 0; i < numero; i++) {
            System.out.println(partidos[i]);
        }
    }
}