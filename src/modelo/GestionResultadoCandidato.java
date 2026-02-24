package modelo;

public class GestionResultadoCandidato {

    private ResultadoCandidato[] arreglo;
    private int nro;
    public static final int MAX = 100;

    public GestionResultadoCandidato() {
        arreglo = new ResultadoCandidato[MAX];
        nro = 0;
    }

    // Agregar 
    public void agregar(ResultadoCandidato r) {

        if (nro < MAX) {
            arreglo[nro] = r;
            nro++;
        }

    }

    // longitud
    public int getCantidad() {
        return nro;
    }

    // resultado por posición
    public ResultadoCandidato getResultado(int i) {

        if (i >= 0 && i < nro) {
            return arreglo[i];
        }

        return null;
    }

    // Mostrar todos los resultados
    public String mostrarTodos() {

        String info = "";

        for (int i = 0; i < nro; i++) {
            info += arreglo[i].verInfo() + "\n";
        }

        return info;
    }

    // Buscar resultado por candidato
    public ResultadoCandidato buscarPorCandidato(String nombreCandidato) {

        for (int i = 0; i < nro; i++) {

            if (arreglo[i].getCandidato().getNombre().equalsIgnoreCase(nombreCandidato)) {
                return arreglo[i];
            }
        }

        return null;
    }

    //Eliminar por posición
    public void eliminar(int pos) {

        if (pos >= 0 && pos < nro) {

            for (int i = pos; i < nro - 1; i++) {
                arreglo[i] = arreglo[i + 1];
            }
            nro--;          
        }
    }
}