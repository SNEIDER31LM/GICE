package Consola;

import java.util.ArrayList;
import java.util.Scanner;

public class SubMenuUsuario {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> cortes = new ArrayList<>(); // Lista de cortes
    private static ArrayList<String> incidencias = new ArrayList<>(); // Lista de incidencias

    public static void mostrar() {
        int opcion;
        do {
            System.out.println("===============================");
            System.out.println("\n      MENÚ DE USUARIO        ");
            System.out.println("===============================");
            System.out.println("1. Consultar Cortes");
            System.out.println("2. Reportar Incidencia");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    consultarCortes();
                    break;
                case 2:
                    reportarIncidencia();
                    break;
                case 0:
                    System.out.println("Saliendo del menú de usuario...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);
    }

    // Método para consultar los cortes disponibles
    private static void consultarCortes() {
        if (cortes.isEmpty()) {
            System.out.println("No hay cortes disponibles.");
        } else {
            System.out.println("\n===== Lista de Cortes =====");
            for (int i = 0; i < cortes.size(); i++) {
                System.out.println((i + 1) + ". " + cortes.get(i));
            }
        }
    }

    // Método para reportar una incidencia
    private static void reportarIncidencia() {
        System.out.println("\n===== Reportar Incidencia =====");
        System.out.print("Describe la incidencia: ");
        String incidencia = scanner.nextLine();
        incidencias.add(incidencia);
        System.out.println("Incidencia reportada con éxito.");
    }

    // Método para agregar cortes (usado solo para pruebas)
    public static void agregarCorte(String corte) {
        cortes.add(corte);
    }

    // Método para ver las incidencias reportadas (opcional para administración)
    public static void verIncidencias() {
        if (incidencias.isEmpty()) {
            System.out.println("No hay incidencias reportadas.");
        } else {
            System.out.println("\n===== Incidencias Reportadas =====");
            for (String incidencia : incidencias) {
                System.out.println("- " + incidencia);
            }
        }
    }
}
