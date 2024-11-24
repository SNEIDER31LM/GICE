package Consola;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== MENÚ PRINCIPAL - GICE =====");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Consultar Cortes");
            System.out.println("3. Reportar Incidencias");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    SubMenu.registrarUsuario(scanner);
                    break;
                case 2:
                    SubMenu.consultarCortes(scanner);
                    break;
                case 3:
                    SubMenu.reportarIncidencia(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}