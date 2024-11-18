package consola;

public class H1GestionarUsuario {

// Atributos //

    private String nombreUsuario;
    private String apellidoUsuario;
    private String usuario;
    private String contraseña;
    private String fechaRegistro;


// Constructor vacío //

    public H1GestionarUsuario() {
    }


// MétodoConstructor //

    public H1GestionarUsuario(String nombreUsuario, String apellidoUsuario, String usuario, String contraseña, String fechaRegistro) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fechaRegistro = fechaRegistro;
    }

    // Métodos get y set //

    public String getnombreUsuario() {
        return nombreUsuario;
    }

    public void setnombreUsuario(String nombreUsuario) {
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

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


}
