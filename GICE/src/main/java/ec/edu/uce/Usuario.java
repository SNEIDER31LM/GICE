package ec.edu.uce;

import java.util.Date;

public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;
    private Date fechaRegistro;

    // Constructor por defecto
    public Usuario() {
        this.nombre = "";
        this.apellido = "";
        this.usuario = "";
        this.contrasena = "";
        this.fechaRegistro = new Date();
    }

    // Constructor con parámetros
    public Usuario(String nombre, String apellido, String usuario, String contrasena, Date fechaRegistro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.fechaRegistro = fechaRegistro;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    // Métodos específicos
    public void registrar() {
        System.out.println("Usuario registrado: " + this.usuario);
    }

    public boolean validarDatos() {
        return !this.nombre.isEmpty() && !this.apellido.isEmpty() && !this.usuario.isEmpty() && !this.contrasena.isEmpty();
    }

    public String generarCredenciales() {
        return this.usuario + ":" + this.contrasena;
    }

    public boolean iniciarSesion(String usuario, String contrasena) {
        return this.usuario.equals(usuario) && this.contrasena.equals(contrasena);
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada para el usuario: " + this.usuario);
    }
}
