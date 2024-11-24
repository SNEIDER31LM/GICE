package ec.edu.uce;

import java.util.Date;

public class Incidencia {
    private String idIncidencia;
    private Usuario usuario;
    private String zona;
    private Date fechaReporte;
    private String descripcion;
    private String estado;

    // Constructor por defecto
    public Incidencia() {
        this.idIncidencia = "";
        this.zona = "";
        this.fechaReporte = new Date();
        this.descripcion = "";
        this.estado = "";
    }

    // Constructor con parámetros
    public Incidencia(String idIncidencia, Usuario usuario, String zona, Date fechaReporte, String descripcion, String estado) {
        this.idIncidencia = idIncidencia;
        this.usuario = usuario;
        this.zona = zona;
        this.fechaReporte = fechaReporte;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Métodos getter y setter
    public String getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(String idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Date getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos específicos
    public void crearIncidencia() {
        System.out.println("Creando incidencia: " + this.idIncidencia);
    }

    public void consultarIncidencia(String idIncidencia) {
        System.out.println("Consultando incidencia con ID: " + idIncidencia);
    }

    public void actualizarEstadoIncidencia(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Estado de la incidencia actualizado a: " + nuevoEstado);
    }

    public void listarIncidencias() {
        System.out.println("Listando todas las incidencias...");
    }
}
