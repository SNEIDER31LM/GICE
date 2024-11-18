package Consola;

public class H1_1crearNuevoUsuario {
    private String nombreUsuario;
    private String apellidoUsuario;
    private String usuario;
    private String contraseña;

    // Constructor vacío
    public H1_1crearNuevoUsuario() {
    }

    // Constructor con parámetros
    public H1_1crearNuevoUsuario(String nombreUsuario, String apellidoUsuario, String usuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    // Métodos Get y Set
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

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

