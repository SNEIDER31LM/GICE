package dominio;

import ec.edu.uce.AdministradorDelSistema;

public class TestAdministradorDelSistema {
    private static AdministradorDelSistema admin;

    public static void main(String[] args) {
        admin = new AdministradorDelSistema();
        System.out.println("Test de AdministradorDelSistema");

        admin.registrar();
        System.out.println("Validación de datos: " + admin.validarDatos());
        System.out.println("Credenciales: " + admin.generarCredenciales());
        admin.iniciarSesion(admin.getUsuario(), admin.getContrasena());
        admin.cerrarSesion();
    }
}
