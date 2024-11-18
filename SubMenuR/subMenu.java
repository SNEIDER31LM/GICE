package Consola;

import java.util.Scanner;

public class subMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menú principal
        do {
            System.out.println("=== Menú de Gestión de Usuario ===");
            System.out.println("1. Crear Nuevo Usuario");
            System.out.println("2. Validar Usuario");
            System.out.println("3. Generar Credenciales de Acceso");
            System.out.println("4. Eliminar Corte");
            System.out.println("5. Editar Corte");
            System.out.println("6. Consultar Corte");
            System.out.println("7. Buscar Corte");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Crear nuevo usuario
                    System.out.println("### Crear Nuevo Usuario ###");
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese el usuario: ");
                    String usuario = scanner.nextLine();
                    System.out.print("Ingrese la contraseña: ");
                    String contraseña = scanner.nextLine();

                    H1_1crearNuevoUsuario nuevoUsuario = new H1_1crearNuevoUsuario(nombre, apellido, usuario, contraseña);
                    System.out.println("Nuevo usuario creado: " + nuevoUsuario.getNombreUsuario() + " " + nuevoUsuario.getApellidoUsuario());
                    break;

                case 2:
                    // Validar usuario
                    System.out.println("### Validar Usuario ###");
                    System.out.print("Ingrese el usuario: ");
                    String usuarioValidar = scanner.nextLine();
                    System.out.print("Ingrese la contraseña: ");
                    String contraseñaValidar = scanner.nextLine();

                    H1_2validarUsuario validarUsuario = new H1_2validarUsuario(usuarioValidar, contraseñaValidar);
                    System.out.println("Usuario " + validarUsuario.getUsuario() + " validado correctamente.");
                    break;

                case 3:
                    // Generar credenciales
                    System.out.println("### Generar Credenciales de Acceso ###");
                    System.out.print("Ingrese el usuario para generar credenciales: ");
                    String usuarioGen = scanner.nextLine();
                    System.out.print("Ingrese la contraseña para generar credenciales: ");
                    String contraseñaGen = scanner.nextLine();

                    H1_3generarCredencialesDeAcceso credenciales = new H1_3generarCredencialesDeAcceso(usuarioGen, contraseñaGen);
                    System.out.println("Credenciales generadas para: " + credenciales.getUsuarioGenerado());
                    break;

                case 4:
                    // Eliminar corte
                    System.out.println("### Eliminar Corte ###");
                    System.out.print("Ingrese el ID del corte a eliminar: ");
                    int idCorteEliminar = scanner.nextInt();
                    H4_1eliminarCorte eliminarCorte = new H4_1eliminarCorte(idCorteEliminar);
                    System.out.println("Corte con ID " + eliminarCorte.getIdCorte() + " eliminado.");
                    break;

                case 5:
                    // Editar corte
                    System.out.println("### Editar Corte ###");
                    System.out.print("Ingrese el ID del corte a editar: ");
                    int idCorteEditar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese los detalles del corte: ");
                    String detallesCorte = scanner.nextLine();
                    H4_2editarCorte editarCorte = new H4_2editarCorte(idCorteEditar, detallesCorte);
                    System.out.println("Corte con ID " + editarCorte.getIdCorte() + " editado.");
                    break;

                case 6:
                    // Consultar corte
                    System.out.println("### Consultar Corte ###");
                    System.out.print("Ingrese el ID del corte a consultar: ");
                    int idCorteConsultar = scanner.nextInt();
                    H4_3consultarCorte consultarCorte = new H4_3consultarCorte(idCorteConsultar);
                    System.out.println("Consulta de corte con ID " + consultarCorte.getIdCorte() + " realizada.");
                    break;

                case 7:
                    // Buscar corte
                    System.out.println("### Buscar Corte ###");
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese término de búsqueda: ");
                    String terminoBusqueda = scanner.nextLine();
                    H4_4buscarCorte buscarCorte = new H4_4buscarCorte(terminoBusqueda);
                    System.out.println("Búsqueda realizada para: " + buscarCorte.getTerminoBusqueda());
                    break;

                case 8:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    break;
            }

        } while (opcion != 8);

        scanner.close();
    }
}

