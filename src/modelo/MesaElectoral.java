
package modelo;

import java.util.Scanner;

public class MesaElectoral {
    private String titulo;
    private Fecha fecha;
    private Hora hora;
    private String lugar;
    private int nroIdMesa;
    private MiembroDeMesa[] miembroDeMesa;
    private int nroVotantesRegistrados;
    private int nroVotantesEfectivos;
    private ResultadoCandidato resultado;;
    private int votosBlancos;
    private int votosNulos;
    private String observaciones;
    private String firmas;
    private String selloOf;
    private int nroIdActa;
    //Constructor OVERFLOW
    public MesaElectoral(String titulo, Fecha fecha, Hora hora, String lugar, int nroIdMesa, MiembroDeMesa[] miembroDeMesa, int nroVotantesRegistrados, int nroVotantesEfectivos, ResultadoCandidato resultado, int votosBlancos, int votosNulos, String observaciones, String firmas, String selloOf, int nroIdActa) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.nroIdMesa = nroIdMesa;
        this.miembroDeMesa = miembroDeMesa;
        this.nroVotantesRegistrados = nroVotantesRegistrados;
        this.nroVotantesEfectivos = nroVotantesEfectivos;
        this.votosBlancos = votosBlancos;
        this.votosNulos = votosNulos;
        this.observaciones = observaciones;
        this.firmas = firmas;
        this.selloOf = selloOf;
        this.nroIdActa = nroIdActa;
        this.resultado = resultado;
        miembroDeMesa = new MiembroDeMesa[50];
    }
    //CONSTRUCTOR SIN PARAMETROS

    public MesaElectoral() {
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

    public String getResultadoCandidato() {
        return resultado.verInfo();
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

    public String getFirmas() {
        return firmas;
    }

    public String getSelloOf() {
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

    public void setResultadoCandidato(ResultadoCandidato resultado) {
        this.resultado = resultado;
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

    public void setFirmas(String firmas) {
        this.firmas = firmas;
    }

    public void setSelloOf(String selloOf) {
        this.selloOf = selloOf;
    }

    public void setNroIdActa(int nroIdActa) {
        this.nroIdActa = nroIdActa;
    }
    // OTROS METODOS

    
}
