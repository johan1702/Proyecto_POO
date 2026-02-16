
package modelo;
import java.util.Scanner;
public class ActaElectoral {
    //ATRIBUTOS
    private String titulo;
    private Fecha fecha;
    private Hora hora;
    private String lugar;
    private int nroIdMesa;
    private MiembroDeMesa[] miembroDeMesa;
    private int nroVotantesRegistrados;
    private int nroVotantesEfectivos;
    private ResultadoCandidato[] resultados;;
    private int votosBlancos;
    private int votosNulos;
    private String observaciones;
    private boolean firmas;
    private boolean selloOf;    
    private int nroIdActa;
    //Constructor OVERFLOW
    public ActaElectoral(String titulo, Fecha fecha, Hora hora, String lugar, 
        int nroIdMesa, int nroVotantesRegistrados, 
        int nroVotantesEfectivos, ResultadoCandidato[] resultados, 
        int votosBlancos, int votosNulos, String observaciones, 
        boolean firmas, boolean selloOf, int nroIdActa) {
   
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.nroIdMesa = nroIdMesa;
        this.nroVotantesRegistrados = nroVotantesRegistrados;
        this.nroVotantesEfectivos = nroVotantesEfectivos;
        this.resultados = resultados;
        this.votosBlancos = votosBlancos;
        this.votosNulos = votosNulos;
        this.observaciones = observaciones;
        this.firmas = firmas;
        this.selloOf = selloOf;
        this.nroIdActa = nroIdActa;
        // Inicializar arreglo de 6 miembros
        this.miembroDeMesa = new MiembroDeMesa[6];
        
        // llenar data
        leerMiembroMesa();
}

    //GETTERS
    public String getTitulo() {
        return titulo;
    }
    public Fecha getFecha() {
        return fecha;
    }
    public Hora getHora() {
        return hora;
    }
    public String getLugar() {
        return lugar;
    }
    public int getNroIdMesa() {
        return nroIdMesa;
    }
    public MiembroDeMesa[] getMiembroDeMesa() {
        return miembroDeMesa;
    }
    public int getNroVotantesRegistrados() {
        return nroVotantesRegistrados;
    }
    public int getNroVotantesEfectivos() {
        return nroVotantesEfectivos;
    }
    public int getVotosBlancos() {
        return votosBlancos;
    }
    public int getVotosNulos() {
        return votosNulos;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public boolean getFirmas() {
        return firmas;
    }
    public boolean getSelloOf() {
        return selloOf;
    }
    public int getNroIdActa() {
        return nroIdActa;
    }
    
    //SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public void setHora(Hora hora) {
        this.hora = hora;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public void setNroIdMesa(int nroIdMesa) {
        this.nroIdMesa = nroIdMesa;
    }
    public void setMiembroDeMesa(MiembroDeMesa[] miembroDeMesa) {
        this.miembroDeMesa = miembroDeMesa;
    }
    public void setNroVotantesRegistrados(int nroVotantesRegistrados) {
        this.nroVotantesRegistrados = nroVotantesRegistrados;
    }
    public void setNroVotantesEfectivos(int nroVotantesEfectivos) {
        this.nroVotantesEfectivos = nroVotantesEfectivos;
    }
    public void setResultadoCandidato(ResultadoCandidato[] resultados) {
        this.resultados = resultados;
    }
    public void setVotosBlancos(int votosBlancos) {
        this.votosBlancos = votosBlancos;
    }
    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public void setFirmas(boolean firmas) {
        this.firmas = firmas;
    }
    public void setSelloOf(boolean selloOf) {
        this.selloOf = selloOf;
    }
    public void setNroIdActa(int nroIdActa) {
        this.nroIdActa = nroIdActa;
    }
    //Otro metodos
    public void leerMiembroMesa(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < miembroDeMesa.length; i++) {
            System.out.println("Miembro de mesa ["+(i+1)+"]");
            System.out.println("Ingrese Nombres: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese Apellidos:  ");
            String apellido = sc.nextLine();
            System.out.println("Ingrese tipo: ");
            String tipo = sc.next();
            MiembroDeMesa m1 = new MiembroDeMesa(nombre,apellido,tipo);
            miembroDeMesa[i] = m1;
        }
    }
    
    public void verInfo() {
    System.out.println("===== ACTA ELECTORAL =====");
    System.out.println("Titulo: " + titulo);
    System.out.println("Fecha: " + fecha);
    System.out.println("Hora: " + hora);
    System.out.println("Lugar: " + lugar);
    System.out.println("Nro Mesa: " + nroIdMesa);
    System.out.println("Nro Acta: " + nroIdActa);

    System.out.println("Votantes Registrados: " + nroVotantesRegistrados);
    System.out.println("Votantes Efectivos: " + nroVotantesEfectivos);
    System.out.println("Votos Blancos: " + votosBlancos);
    System.out.println("Votos Nulos: " + votosNulos);

    System.out.println("Observaciones: " + observaciones);
    String resultado = "";
    if(firmas){
        resultado = "SI";
    }
    else{
        resultado = "NO";
    }
    System.out.println("Firmas: " + resultado);
    if(selloOf){
        resultado = "SI";
    }
    else{
        resultado = "NO";
    }
    System.out.println("Sello Oficial: " + resultado);

    // Mostrar miembros de mesa
    System.out.println("\n--- MIEMBROS DE MESA ---");
    if (miembroDeMesa != null) {
        for (int i = 0; i < miembroDeMesa.length; i++) {
            if (miembroDeMesa[i] != null) {
                System.out.println("Miembro [" + (i+1) + "]");
                miembroDeMesa[i].mostrar();  
            }
        }
    }

    // Mostrar resultados por candidato
    System.out.println("\n--- RESULTADOS ---");
        for (int i = 0; i < resultados.length; i++) {
            resultados[i].verInfo();  
            
        }
    System.out.println("==========================");
}

}
