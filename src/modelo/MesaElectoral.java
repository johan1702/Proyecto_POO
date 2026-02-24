package modelo;

public class MesaElectoral {

    private int idMesa;
    private MiembroDeMesa[] miembros;
    private int nro;

    public static final int MAX = 6;

    public MesaElectoral(int idMesa) {
        this.idMesa = idMesa;
        miembros = new MiembroDeMesa[MAX];
        nro = 0;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void agregarMiembro(MiembroDeMesa m) {

        if (nro < MAX) {
            miembros[nro] = m;
            nro++;
        }
    }

    public int getCantidad() {
        return nro;
    }

    public MiembroDeMesa getMiembro(int i) {
        if (i >= 0 && i < nro) {
            return miembros[i];
        }
        return null;
    }

    public String mostrarMiembros() {
        String info = "Mesa: " + idMesa + "\n";

        for (int i = 0; i < nro; i++) {
            info += miembros[i].verInfo() + "\n";
        }

        return info;
    }
}