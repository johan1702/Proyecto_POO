package modelo;

public class GestionPartidoPolitico {

    private PartidoPolitico[] partidos;
    private int nro;
    private final static int MAX = 5;

    // Constructor
    public GestionPartidoPolitico() {
        partidos = new PartidoPolitico[MAX];
        nro = 0;
    }

    // AGREGAR PARTIDO
    public void agregarPartido(PartidoPolitico p) {
        if (nro < MAX) {
            partidos[nro] = p;
            nro++;
        } else {
            System.out.println("Memoria llena");
        }
    }

    // MOSTRAR PARTIDOS
    public void mostrarPartidos() {
        for (int i = 0; i < nro; i++) {
            System.out.println(partidos[i]);
        }
    }

    // MODIFICAR PARTIDO 
    public void modificarPartido(String nombreBuscado,String sigla,String logo,String representante) {
        for (int i = 0; i < nro; i++) {
            if (partidos[i].getNombre().equals(nombreBuscado)) {
                partidos[i].ModificarPartidoPolitico(nombreBuscado, sigla, logo, representante);
                System.out.println("Partido modificado correctamente");
                return;
            }
        }
        System.out.println("No se encontró el partido");
    }

    // ELIMINAR PARTIDO 
    public void eliminarPartido(String nombreBuscado) {
        for (int i = 0; i < nro; i++) {
            if (partidos[i].getNombre().equals(nombreBuscado)) {
                for (int j = i; j < nro - 1; j++) {
                    partidos[j] = partidos[j + 1];
                }
                nro--;
                System.out.println("Partido eliminado correctamente");
            }
        }
        System.out.println("No se encontró el partido");
    }

    // LONGITUD
    public int longitud() {
        return nro;
    }

    // IESIMO
    public PartidoPolitico iesimo(int pos) {
        if (pos >= 0 && pos < nro) {
            return partidos[pos];
        }
        return null;
    }
}