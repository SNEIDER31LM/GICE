import ec.edu.uce.Usuario;

import java.util.Date;

public class TestUsuario {

    private static Usuario usuarioTest;

    public static void main(String[] args) {
        // Crear un usuario de prueba
        usuarioTest = new Usuario("Juan", "Pérez", "juan123", "password123", new Date());

        // Mostrar detalles del usuario creado
        System.out.println("Usuario creado:");
        System.out.println("Nombre: " + usuarioTest.getNombre());
        System.out.println("Apellido: " + usuarioTest.getApellido());
        System.out.println("Usuario: " + usuarioTest.getUsuario());
        System.out.println("Contraseña: " + usuarioTest.getContrasena());
        System.out.println("Fecha de Registro: " + usuarioTest.getFechaRegistro());

        // Probar el inicio de sesión con credenciales correctas
        if (testIniciarSesion("juan123", "password123")) {
            System.out.println("Inicio de sesión exitoso con credenciales correctas.");
        } else {
            System.out.println("Fallo en el inicio de sesión con credenciales correctas.");
        }

        // Probar el inicio de sesión con credenciales incorrectas
        if (!testIniciarSesion("juan123", "wrongPassword")) {
            System.out.println("Correcto: Falló el inicio de sesión con credenciales incorrectas.");
        } else {
            System.out.println("Error: Inicio de sesión exitoso con credenciales incorrectas.");
        }
    }

    public static boolean testIniciarSesion(String usuario, String contrasena) {
        return usuarioTest.iniciarSesion(usuario, contrasena);
    }
}