package consola;

import modelo.Usuario;
import modelo.Zona;

import java.time.LocalDateTime;
import java.util.Scanner;

public class GUIUsuario {
    private Scanner scanner;

    public GUIUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public Usuario solicitarUsuario() {
        // Pedir el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Pedir la edad del usuario
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer después de leer un int

        // Crear y devolver el objeto Usuario con nombre y edad
        return new Usuario(nombre, edad);
    }

    public Zona solicitarZona() {
        System.out.println("=== Selección de Zona ===");
        String nombreZona = "";
        LocalDateTime fechaCorte = null;

        // Validar que el usuario ingrese una zona válida
        while (true) {
            System.out.print("Ingrese la zona (norte, sur o centro): ");
            nombreZona = scanner.nextLine().toLowerCase();

            // Asignar una fecha de corte con hora según la zona
            if (nombreZona.equals("norte")) {
                fechaCorte = LocalDateTime.of(2024, 12, 1, 8, 0, 0, 0); // Fecha y hora para la zona norte (8:00 AM)
                break;
            } else if (nombreZona.equals("sur")) {
                fechaCorte = LocalDateTime.of(2024, 12, 1, 12, 0, 0, 0); // Fecha y hora para la zona sur (12:00 PM)
                break;
            } else if (nombreZona.equals("centro")) {
                fechaCorte = LocalDateTime.of(2024, 12, 1, 16, 0, 0, 0); // Fecha y hora para la zona centro (4:00 PM)
                break;
            } else {
                System.out.println("Zona inválida. Por favor, ingrese 'norte', 'sur' o 'centro'.");
            }
        }

        // Crear la zona
        return new Zona(nombreZona, fechaCorte);
    }

    public Zona siguienteZona(Zona zonaActual) {
        // Avanzar 4 horas para el siguiente corte
        LocalDateTime nuevaFechaCorte = zonaActual.getFechaCorte().plusHours(4);
        String nuevaZona = "";

        // Determinar la siguiente zona
        switch (zonaActual.getNombre()) {
            case "norte":
                nuevaZona = "sur";
                break;
            case "sur":
                nuevaZona = "centro";
                break;
            case "centro":
                nuevaZona = "norte";
                break;
        }

        // Crear la nueva zona con la nueva fecha de corte
        return new Zona(nuevaZona, nuevaFechaCorte);
    }
}

