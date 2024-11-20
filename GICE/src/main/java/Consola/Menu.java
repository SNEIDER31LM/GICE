package Consola;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static Usuario usuarioActual = null;

    public static void main(String[] args) {
        // Llamada al método iniciar para mostrar el menú principal
        Menu menu = new Menu();
        menu.iniciar();
    }

    // Método para iniciar el menú principal
    public void iniciar() {
        int opcion;
        do {
            System.out.println("\n========================================");
            System.out.println("          GESTOR DE CORTES (GICE)        ");
            System.out.println("========================================");
            System.out.println("1. Ingresar como Usuario");
            System.out.println("2. Ingresar como Administrador");
            System.out.println("3. Registrar Usuario");
            System.out.println("0. Salir");
            System.out.println("========================================");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    iniciarSesionUsuario();
                    break;
                case 2:
                    iniciarSesionAdministrador();
                    break;
                case 3:
                    registrarUsuario();
                    break;
                case 0:
                    System.out.println("¡Gracias por usar GICE!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);
    }

    // Método para registrar un nuevo usuario
    private void registrarUsuario() {
        System.out.println("\n===== Registro de Usuario =====");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        Usuario nuevoUsuario = new Usuario(nombre, apellido, usuario, contrasena);
        usuarios.add(nuevoUsuario);
        System.out.println("¡Usuario registrado con éxito!");
    }

    // Método para iniciar sesión como usuario
    private void iniciarSesionUsuario() {
        System.out.println("\n===== Iniciar Sesión =====");
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario) && u.getContrasena().equals(contrasena)) {
                usuarioActual = u;
                System.out.println("¡Inicio de sesión exitoso! Bienvenido, " + u.getNombre());
                SubMenuUsuario.mostrar(); // Llamar al submenú de usuario
                return;
            }
        }

        System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
    }

    // Método para iniciar sesión como administrador
    private void iniciarSesionAdministrador() {
        System.out.println("\n===== Iniciar Sesión Administrador =====");
        SubMenuAdmin.mostrar(); // Llamar al submenú de administrador
    }
}
