package Consola;
import ec.edu.uce.CorteDeLuz;
import ec.edu.uce.Incidencia;
import ec.edu.uce.Usuario;

import java.util.Date;
import java.util.Scanner;

public class SubMenu {

    public static void registrarUsuario(Scanner scanner) {
        System.out.println("===== Registrar Usuario =====");
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String contrasena = scanner.nextLine();

        // Crear instancia de Usuario y registrar
        Usuario nuevoUsuario = new Usuario(nombre, apellido, usuario, contrasena, new Date());
        nuevoUsuario.registrar();

        System.out.println("Usuario registrado exitosamente.");
    }

    public static void consultarCortes(Scanner scanner) {
        System.out.println("===== Consultar Cortes =====");
        // Se simula una consulta de cortes
        System.out.print("Ingrese la fecha de consulta (formato: YYYY-MM-DD): ");
        String fechaConsulta = scanner.nextLine();

        // Aquí podrías conectar con una instancia de CorteDeLuz
        CorteDeLuz corte = new CorteDeLuz("C001", new Date(), new Date(), "Mantenimiento", "Programado");
        System.out.println("Corte consultado:");
        System.out.println("ID: " + corte.getIdCorte());
        System.out.println("Motivo: " + corte.getMotivo());
        System.out.println("Estado: " + corte.getEstado());
    }

    public static void reportarIncidencia(Scanner scanner) {
        System.out.println("===== Reportar Incidencia =====");
        System.out.print("Ingrese el ID de la incidencia: ");
        String idIncidencia = scanner.nextLine();
        System.out.print("Ingrese la zona: ");
        String zona = scanner.nextLine();
        System.out.print("Ingrese la descripción de la incidencia: ");
        String descripcion = scanner.nextLine();

        // Crear instancia de Usuario para ejemplo
        Usuario usuario = new Usuario("Ejemplo", "Prueba", "usuario123", "password", new Date());

        // Crear instancia de Incidencia y registrar
        Incidencia nuevaIncidencia = new Incidencia(idIncidencia, usuario, zona, new Date(), descripcion, "Pendiente");
        nuevaIncidencia.crearIncidencia();

        System.out.println("Incidencia reportada exitosamente.");
    }
}
