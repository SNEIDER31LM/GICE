package Consola;

public class H4_2editarCorte {
    private int idCorte;
    private String detalleCorte;

    // Constructor vacío
    public H4_2editarCorte() {
    }

    // Constructor con parámetros
    public H4_2editarCorte(int idCorte, String detalleCorte) {
        this.idCorte = idCorte;
        this.detalleCorte = detalleCorte;
    }

    // Métodos Get y Set
    public int getIdCorte() {
        return idCorte;
    }

    public void setIdCorte(int idCorte) {
        this.idCorte = idCorte;
    }

    public String getDetalleCorte() {
        return detalleCorte;
    }

    public void setDetalleCorte(String detalleCorte) {
        this.detalleCorte = detalleCorte;
    }
}
