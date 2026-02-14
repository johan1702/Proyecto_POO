
package modelo;

public class ResultadoCandidato {
    private Candidato candidato;
    private int votos;
    private int votosPreferenciales;
    //CONSTRUCTORES
    public ResultadoCandidato(Candidato candidato, int votos, int votosPreferenciales) {
        this.candidato = candidato;
        this.votos = votos;
        this.votosPreferenciales = votosPreferenciales;
    }

    public ResultadoCandidato() {
    }
    
    //GETTERS AND SETTERS

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getVotosPreferenciales() {
        return votosPreferenciales;
    }

    public void setVotosPreferenciales(int votosPreferenciales) {
        this.votosPreferenciales = votosPreferenciales;
    }
    
    public String verInfo(){
        return "Candidato: " + candidato. + "\n Votos: " + votos + "\n Votos Preferenciales: " + votosPreferenciales + "\n";
    }
}
