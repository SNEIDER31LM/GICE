package main;

import consola.GUIUsuario;
import modelo.Usuario;
import modelo.Zona;

public class ProyectoUsuarioMain {
    public static void main(String[] args) {
        // Crear la GUI para Usuario y Zona
        GUIUsuario guiUsuario = new GUIUsuario();

        // Solicitar datos del usuario
        Usuario usuario = guiUsuario.solicitarUsuario();
        System.out.println("Usuario ingresado: " + usuario.getNombre() + ", Edad: " + usuario.getEdad());

        // Solicitar la zona y la fecha de corte
        Zona zona = guiUsuario.solicitarZona();
        System.out.println("Zona seleccionada:");
        System.out.println(zona);

        // Avanzar al siguiente corte de zona cada 4 horas
        for (int i = 0; i < 3; i++) { // Ejemplo: avanza por 3 ciclos (zonas)
            zona = guiUsuario.siguienteZona(zona);
            System.out.println("\nSiguiente zona después de 4 horas:");
            System.out.println(zona);
        }
    }
}
