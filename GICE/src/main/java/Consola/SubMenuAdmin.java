package Consola;

import java.util.ArrayList;
import java.util.Scanner;

public class SubMenuAdmin {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> cortes = new ArrayList<>(); // Lista de cortes

    public static void mostrar() {
        int opcion;
        do {
            System.out.println("======================================");
            System.out.println("\n       MENÚ DE ADMINISTRADOR       ");
            System.out.println("=====================================");
            System.out.println("1. Gestionar Información de Cortes");
            System.out.println("2. Ver Plan de Cortes");
            System.out.println("3. Ver Incidencias");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    gestionarInformacionCortes();
                    break;
                case 2:
                    verPlanDeCortes();
                    break;
                case 3:
                    verIncidencias();
                    break;
                case 0:
                    System.out.println("Saliendo del menú de administrador...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);
    }

    // Métodos para gestionar cortes e incidencias
    private static void gestionarInformacionCortes() {
        int opcion;
        do {
            System.out.println("\n===== Gestionar Información de Cortes =====");
            System.out.println("1. Agregar Nuevo Corte");
            System.out.println("2. Modificar Corte Existente");
            System.out.println("3. Eliminar Corte");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarCorte();
                    break;
                case 2:
                    modificarCorte();
                    break;
                case 3:
                    eliminarCorte();
                    break;
                case 0:
                    System.out.println("Volviendo al menú de administrador...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void agregarCorte() {
        System.out.print("Introduce la descripción del corte: ");
        String corte = scanner.nextLine();
        cortes.add(corte);
        System.out.println("¡Corte agregado exitosamente!");
    }

    private static void modificarCorte() {
        System.out.println("===== Modificar Corte =====");
        if (cortes.isEmpty()) {
            System.out.println("No hay cortes disponibles para modificar.");
            return;
        }

        mostrarCortes();
        System.out.print("Introduce el número del corte a modificar: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpiar el buffer

        if (index >= 0 && index < cortes.size()) {
            System.out.print("Introduce la nueva descripción del corte: ");
            String nuevoCorte = scanner.nextLine();
            cortes.set(index, nuevoCorte);
            System.out.println("¡Corte modificado exitosamente!");
        } else {
            System.out.println("Opción no válida. Intenta de nuevo.");
        }
    }

    private static void eliminarCorte() {
        System.out.println("===== Eliminar Corte =====");
        if (cortes.isEmpty()) {
            System.out.println("No hay cortes disponibles para eliminar.");
            return;
        }

        mostrarCortes();
        System.out.print("Introduce el número del corte a eliminar: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpiar el buffer

        if (index >= 0 && index < cortes.size()) {
            cortes.remove(index);
            System.out.println("¡Corte eliminado exitosamente!");
        } else {
            System.out.println("Opción no válida. Intenta de nuevo.");
        }
    }

    private static void mostrarCortes() {
        System.out.println("\n===== Lista de Cortes =====");
        if (cortes.isEmpty()) {
            System.out.println("No hay cortes disponibles.");
        } else {
            for (int i = 0; i < cortes.size(); i++) {
                System.out.println((i + 1) + ". " + cortes.get(i));
            }
        }
    }

    private static void verPlanDeCortes() {
        System.out.println("Aquí puedes consultar el plan de cortes.");
        // Mostrar el plan de cortes (puedes agregar tu lógica aquí)
    }

    private static void verIncidencias() {
        System.out.println("Aquí puedes consultar las incidencias reportadas.");
        // Mostrar las incidencias (puedes agregar tu lógica aquí)
    }
}
