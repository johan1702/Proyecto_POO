
package modelo;

public class SistemaVotos {
    
    public static void desgloseCandidatos(ResultadoCandidato[] resultados){
        
        int votos = 0;
        int votosPreferenciales = 0;
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] != null) {
                System.out.println("Candidato ["+(i+1)+"]");
                System.out.println("-------------------------");
                System.out.println(resultados[i].verInfo());
                votos = votos + resultados[i].getVotos();
                votosPreferenciales = votosPreferenciales + resultados[i].getVotosPreferenciales();
            }
           
        }
        System.out.println("RESULTADO GENERAL");
        System.out.println("------------------");
        System.out.println("VOTOS TOTALES: "+ votos);
        System.out.println("VOTOS PREFERENCIALES TOTALES: "+ votosPreferenciales);
    }
    
    
}
