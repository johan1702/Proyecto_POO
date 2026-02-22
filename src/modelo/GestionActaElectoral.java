package modelo;

public class GestionActaElectoral {

    private ActaElectoral[] actas;
    private int nro;

    // Constructor
    public GestionActaElectoral(int capacidad) {
        actas = new ActaElectoral[capacidad];
        nro = 0;
    }

    // Agregar Acta
    public void agregarActa(ActaElectoral a) {
        if (nro < actas.length) {
            actas[nro] = a;
            nro++;
        } else {
            System.out.println("No se pueden agregar más actas");
        }
    }

    // Buscar Acta por número
    public ActaElectoral buscarActa(int nroIdActa) {
        for (int i = 0; i < nro; i++) {
            if (actas[i].getNroIdActa() == nroIdActa) {
                return actas[i];
            }
        }
        return null;
    }

    // Eliminar Acta
    public void eliminarActa(int nroIdActa) {
        for (int i = 0; i < nro; i++) {
            if (actas[i].getNroIdActa() == nroIdActa) {

                for (int j = i; j < nro - 1; j++) {
                    actas[j] = actas[j + 1];
                }

                actas[nro - 1] = null;
                nro--;
                System.out.println("Acta eliminada");
                return;
            }
        }
        System.out.println("Acta no encontrada");
    }

    // Mostrar todas las actas
    public void mostrarActas() {
        for (int i = 0; i < nro; i++) {
            actas[i].verInfo();
        }
    }

    // Getter opcional
    public int getCantidadActas() {
        return nro;
    }
}