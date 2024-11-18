package ec.edu.uce;

import consola.H2GestionarHorarios;
import consola.H3ReportarIncidencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario = "", contrasena;
        int intentos = 3; // Límite de intentos para iniciar sesión
        boolean sesionIniciada = false;


        // INICIO DE SESIÓN //

        System.out.println("========================================");
        System.out.println("     BIENVENIDO AL SISTEMA GICE   ");
        System.out.println("========================================");
        while (intentos > 0 && !sesionIniciada) {
            System.out.print("Usuario: ");
            usuario = teclado.nextLine();

            System.out.print("Contraseña: ");
            contrasena = teclado.nextLine();

            // VALIDACIÓN DE CREDENCIALES //

            if (usuario.equals("UceUsuario") && contrasena.equals("Programacion2")) {
                sesionIniciada = true;
                System.out.println("\n¡Inicio de sesión exitoso! Bienvenido, " + usuario + ".");
            } else {
                intentos--;
                System.out.println("\nCredenciales incorrectas. Intentos restantes: " + intentos);
            }
        }

        if (!sesionIniciada) {
            System.out.println("\nSe han agotado los intentos. El sistema se cerrará.");
            teclado.close();
            return; // Salir del programa si no se inicia sesión //
        }


        // MENÚ PRINCIPAL (USUARIO) //

        int opcion;
        do {
            System.out.println("\n========================================");
            System.out.println("             MENÚ PRINCIPAL             ");
            System.out.println("========================================");
            System.out.println("1. Consultar Horarios");
            System.out.println("2. Reportar Incidencia");
            System.out.println("0. Cerrar Sesión");
            System.out.println("========================================");
            System.out.print("Elige una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Consultar Horarios ---");
                    H2GestionarHorarios gestionarHorarios = new H2GestionarHorarios();
                    System.out.println("Horarios de Cortes de Energía");
                    break;
                case 2:
                    System.out.println("\n--- Reportar Incidencia ---");
                    H3ReportarIncidencia reportarIncidencia = new H3ReportarIncidencia();
                    System.out.println("Reportar Incidencia");
                    break;
                case 0:
                    System.out.println("\nCerrando sesión. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        } while (opcion != 0);

        teclado.close();
    }
}

