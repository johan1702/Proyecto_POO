

package modelo;
///////IMPORTAR SCANNER//////
import java.util.Scanner;

public class MenuSistema {
    private static ResultadoCandidato[] ultimosResultados;
    private static int cantidadResultados = 0;
    private static GestionCandidato gestion = new GestionCandidato();
///////METODO EJECUTAR/////
    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n---- SISTEMA ELECTORAL ----");
            System.out.println("1. Registrar Eleccion");
            System.out.println("2. Registrar Candidato");
            System.out.println("3. Registrar Mesa Electoral");
            System.out.println("4. Registrar Acta Electoral");
            System.out.println("5. Ver Resultados");
            System.out.println("6. Ver Candidatos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            /////next line  para que no salga  error////
            sc.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.println("--- REGISTRAR ELECCIÓN ---");
                    System.out.print("Tipo de elección: ");
                    String tipo = sc.nextLine();

                    Fecha fecha = new Fecha(21, 6, 2026);
                    Eleccion eleccion = new Eleccion(fecha, tipo, 10);

                    System.out.println("Elección registrada.");
                    break;

                case 2:
                    System.out.println("--- REGISTRAR CANDIDATO ---");
                    System.out.print("Nombres: ");
                    String nombre = sc.nextLine();

                    System.out.print("Apellidos: ");
                    String apellido = sc.nextLine();

                    System.out.print("DNI: ");
                    int dni = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Partido: ");
                    String partido = sc.nextLine();

                    Candidato candidato = new Candidato(nombre, apellido, dni, partido);
                    gestion.agregar(candidato);

                    System.out.println("Candidato registrado.");
                    break;

                case 3:
                    System.out.println("--- REGISTRAR MESA ELECTORAL ---");
                    System.out.print("Número de mesa: ");
                    int numeroMesa = sc.nextInt();
                    sc.nextLine();

                    MesaElectoral mesa = new MesaElectoral(numeroMesa);

                    System.out.println("Mesa registrada.");
                    break;

                case 4:
                    System.out.println("--- REGISTRAR ACTA ELECTORAL ---");

                    Fecha f = new Fecha(21, 6, 2026);
                    Hora h = new Hora(10, 30);

                    ResultadoCandidato[] resultados = new ResultadoCandidato[1];

                    Candidato c = new Candidato("Maria Rosa", "Alberta Pepe", 202495423, "Apra");
                    resultados[0] = new ResultadoCandidato(c, 100, 10);

                    ActaElectoral acta = new ActaElectoral("Acta Oficial",f,h,"Lima",1,200,180,resultados,5,3,"Sin observaciones",true,true,1);
                    
                    ultimosResultados = resultados;
                    
                    cantidadResultados = resultados.length;

                    acta.verInfo();
                    break;

                case 5:
                    System.out.println("=== RESULTADOS ===");
                    if (ultimosResultados == null || cantidadResultados == 0) {
                        System.out.println("No hay resultados registrados.");
                         } else { SistemaVotos.desgloseCandidatos(ultimosResultados);
                        
                    }
                    break;
                case 6:
                    System.out.println("=== LISTA DE CANDIDATOS ===");
                    if (gestion.longitud() == 0) { System.out.println("No hay candidatos");
                    }else{ 
                        for (int i = 0; i < gestion.longitud(); i++) {
                        System.out.println("Candidato [" + (i+1) + "]");
                        System.out.println(gestion.iesimo(i).verInfo());
                            System.out.println();
                        
                    }
                    }
                    break;
                    

                case 0:
                    System.out.println("Saliendo del sistema.");
                    break;

                default:
                    System.out.println("Opción invalida.");
            }
            ////////////SI LA OPCION NO ESTA AHI///////////
            /// ////////SE REPITE CON EL WHILE/////////////
        } while (opcion != 0);
        /////SI ESCRIBES 0 SE ROMPE EL WHILE Y TERMINA EL PROGRAMA//////
    }
}