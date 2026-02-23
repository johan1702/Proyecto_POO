package modelo;

public class MesaElectoral {

    // ATRIBUTOS
    private int idMesa;
    private MiembroDeMesa[] miembros;
    private int nro;

    // CONSTRUCTOR
    public MesaElectoral(int idMesa) {
        this.idMesa = idMesa;
        this.miembros = new MiembroDeMesa[6];
        this.nro = 0;
    }

    // GETTERS
    public int getIdMesa() {
        return idMesa;
    }

    // AGREGAR MIEMBRO
    public void agregarMiembro(MiembroDeMesa m) {
        if (nro < miembros.length) {
            miembros[nro] = m;
            nro++;
        } else {
            System.out.println("Mesa llena");
        }
    }

    // MOSTRAR
    public void mostrarMesa() {
        System.out.println("ID Mesa: " + idMesa);
        for (int i = 0; i < nro; i++) {
            miembros[i].verInfo();
        }
    }
}