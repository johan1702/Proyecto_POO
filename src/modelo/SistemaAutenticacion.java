package modelo;

import java.util.Scanner;

public class SistemaAutenticacion {

    private static Usuario agente = new Usuario("Sistemas", "123");

    public static void iniciarSesion() {

        Scanner sc = new Scanner(System.in);
        boolean acceso = false;

        while (!acceso) {

            System.out.println("------- LOGIN -------");
       
            System.out.print("Usuario: ");
            String user = sc.nextLine();


            System.out.print("Contrasena: ");
            String pass = sc.nextLine();

            if (agente.validar(user, pass)) {
                System.out.println("Acceso permitido.");
                acceso = true;
            } else {
                System.out.println("Datos incorrectos. Intente nuevamente.\n");
            }
        }
    }
}