
package modelo;

public class SistemaVotos {
    
    public static void DesgloseCandidatos(ResultadoCandidato[] resultados){
        int votos = 0;
        int votosPreferenciales = 0;
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("Candidato ["+(i+1)+"]");
            System.out.println("-------------------------");
            System.out.println(resultados[i].getCandidato().verInfo());
            votos = votos + resultados[i].getVotos();
            votosPreferenciales = votosPreferenciales + resultados[i].getVotosPreferenciales();
        }
        System.out.println("RESULTADO GENERAL");
        System.out.println("------------------");
        System.out.println("VOTOS TOTALES: "+ votos);
        System.out.println("VOTOS PREFERENCIALES TOTALES: "+ votosPreferenciales);
    }
    
    
}
