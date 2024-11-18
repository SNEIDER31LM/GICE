package Consola;

public class H4_4buscarCorte {
    private String terminoBusqueda;
    private String fecha;
    private String zonaProtegida;
    private String zona;  // Nueva variable para zona

    // Constructor vacío
    public H4_4buscarCorte(String terminoBusqueda) {
    }

    // Constructor con parámetros
    public H4_4buscarCorte(String terminoBusqueda, String fecha, String zonaProtegida, String zona) {
        this.terminoBusqueda = terminoBusqueda;
        this.fecha = fecha;
        this.zonaProtegida = zonaProtegida;
        this.zona = zona;
    }

    // Métodos Get y Set
    public String getTerminoBusqueda() {
        return terminoBusqueda;
    }

    public void setTerminoBusqueda(String terminoBusqueda) {
        this.terminoBusqueda = terminoBusqueda;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getZonaProtegidaHospitales() {
        return zonaProtegida;
    }

    public void setZonaProtegidaHospitales(String zonaProtegida) {
        this.zonaProtegida = zonaProtegida;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}


