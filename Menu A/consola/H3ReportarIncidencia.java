package consola;

public class H3ReportarIncidencia {

    // Atributos //

    private String descripcion;
    private String fecha;
    private String estado;


    // Contstructor Vacio //
    public H3ReportarIncidencia() {

    }


    // MétodoConstructor //

    public H3ReportarIncidencia(String descripcion, String fecha, String estado) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }


    // Métodos get y set //

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
