package ec.edu.uce;

import java.util.Date;

public class CorteDeLuz {
    private String idCorte;
    private Date fechaInicio;
    private Date fechaFin;
    private String motivo;
    private String estado;

    // Constructor por defecto
    public CorteDeLuz() {
        this.idCorte = "";
        this.fechaInicio = new Date();
        this.fechaFin = new Date();
        this.motivo = "";
        this.estado = "";
    }

    // Constructor con parámetros
    public CorteDeLuz(String idCorte, Date fechaInicio, Date fechaFin, String motivo, String estado) {
        this.idCorte = idCorte;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.motivo = motivo;
        this.estado = estado;
    }

    // Métodos getter y setter
    public String getIdCorte() {
        return idCorte;
    }

    public void setIdCorte(String idCorte) {
        this.idCorte = idCorte;
    }

    // Otros getters y setters

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
