package ec.edu.uce;

public class AdministradorDelSistema {
    private String nombreEmpresa;
    private String direccion;
    private String telefonoContacto;

    // Constructor por defecto
    public AdministradorDelSistema() {
        this.nombreEmpresa = "";
        this.direccion = "";
        this.telefonoContacto = "";
    }

    // Constructor con parámetros
    public AdministradorDelSistema(String nombreEmpresa, String direccion, String telefonoContacto) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
    }

    // Métodos getter y setter
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    // Métodos específicos
    public void enviarDatosCorte(CorteDeLuz corte) {
        System.out.println("Enviando información del corte: " + corte.getIdCorte());
    }

    public void consultarCortesProgramados() {
        System.out.println("Consultando cortes programados...");
    }

    public void enviarNotificacion() {
        System.out.println("Enviando notificación...");
    }

    public void actualizarNotificacion() {
        System.out.println("Actualizando notificación...");
    }
}
