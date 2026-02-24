package modelo;

public class MesaElectoral {
    // ATRIBUTOS
    private int idMesa;
    private MiembroDeMesa[] miembros;
    private int numero;
     private final static int MAX = 3;
    
    // CONSTRUCTOR
    public MesaElectoral(int idMesa) {
        this.idMesa = idMesa;
        this.miembros = new MiembroDeMesa[MAX];
        this.numero = 0;
    }

    // GETTER
    public int getIdMesa() {
        return idMesa;
    }
    
    //SETTER
    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
    
    //IESIMO
    public MiembroDeMesa iesimo(int pos) {
        if (pos >= 0 && pos < numero) {
            return miembros[pos];
        }
        return null;
    }
    
    // LONGITUD
    public int longitud() {
        return numero;
    }

    // AGREGAR MIEMBRO
    public void agregarMiembro(MiembroDeMesa m) {
        if (numero < MAX) {
            miembros[numero] = m;
            numero++;
        } else {
            System.out.println("Mesa llena");
        }
    }
    
    //ELIMINAR MIEMBRO
    public void quitarMiembro(int pos) {
        if (pos >= 0 && pos < numero) {
            for (int i = pos; i < numero - 1; i++) {
                miembros[i] = miembros[i+1];
            }
            numero--;
        }
    }

    // MOSTRAR
    public void verInfo() {
        System.out.println("ID Mesa: " + idMesa);
        for (int i = 0; i < numero; i++) {
            miembros[i].verInfo();
        }
    }
}