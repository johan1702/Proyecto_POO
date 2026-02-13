
package modelo;
public class SistemaElectoral {
    private MesaElectoral[] mesas;
    private int cantidadMesas;

    public SistemaElectoral(int capacidad) {
        mesas = new MesaElectoral[capacidad];
        cantidadMesas = 0;
    }

    public void agregarMesa(MesaElectoral m) {
        if (cantidadMesas < mesas.length) {
            mesas[cantidadMesas] = m;
            cantidadMesas++;
        }
    }

    public void eliminarMesaPorId(int id) {
        for (int i = 0; i < cantidadMesas; i++) {
            if (mesas[i].getIdme() == id) {
                for (int j = i; j < cantidadMesas - 1; j++) {
                    mesas[j] = mesas[j + 1];
                }
                mesas[cantidadMesas - 1] = null;
                cantidadMesas--;
                System.out.println("Mesa eliminada.");
                return;
            }
        }
        System.out.println("No se encontró la mesa.");
    }
}
