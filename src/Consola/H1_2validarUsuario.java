package Consola;

public class H1_2validarUsuario {
    private String usuario;
    private String contraseña;

    // Constructor vacío
    public H1_2validarUsuario() {
    }

    // Constructor con parámetros
    public H1_2validarUsuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    // Métodos Get y Set
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
