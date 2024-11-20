package ec.edu.uce;

import java.util.Date;

public class PlanDeCortes {
    private String idPlan;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;

    // Constructor por defecto
    public PlanDeCortes() {
        this.idPlan = "";
        this.descripcion = "";
        this.fechaInicio = new Date();
        this.fechaFin = new Date();
        this.estado = "";
    }

    // Constructor con parámetros
    public PlanDeCortes(String idPlan, String descripcion, Date fechaInicio, Date fechaFin, String estado) {
        this.idPlan = idPlan;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    // Métodos getter y setter
    public String getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(String idPlan) {
        this.idPlan = idPlan;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos específicos
    public void consultarPlan() {
        System.out.println("Consultando plan: " + this.idPlan);
    }

    public void actualizarPlan(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
        System.out.println("Plan actualizado: " + nuevaDescripcion);
    }

    public void listarPlanes() {
        System.out.println("Listando todos los planes de cortes...");
    }
}
