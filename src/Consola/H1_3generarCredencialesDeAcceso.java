package Consola;

public class H1_3generarCredencialesDeAcceso {
    private String usuarioGenerado;
    private String contraseñaGenerada;

    // Constructor vacío
    public H1_3generarCredencialesDeAcceso() {
    }

    // Constructor con parámetros
    public H1_3generarCredencialesDeAcceso(String usuarioGenerado, String contraseñaGenerada) {
        this.usuarioGenerado = usuarioGenerado;
        this.contraseñaGenerada = contraseñaGenerada;
    }

    // Métodos Get y Set
    public String getUsuarioGenerado() {
        return usuarioGenerado;
    }

    public void setUsuarioGenerado(String usuarioGenerado) {
        this.usuarioGenerado = usuarioGenerado;
    }

    public String getContraseñaGenerada() {
        return contraseñaGenerada;
    }

    public void setContraseñaGenerada(String contraseñaGenerada) {
        this.contraseñaGenerada = contraseñaGenerada;
    }
}
