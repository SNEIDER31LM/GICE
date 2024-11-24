package ec.edu.uce;

public class Sector {
    private String nombreSector;
    private int idSector;  // Atributo idSector

    // Constructor por defecto
    public Sector() {
        this.nombreSector = "";
        this.idSector = 0;  // Inicialización por defecto
    }

    // Constructor con parámetros
    public Sector(String nombreSector, int idSector) {
        this.nombreSector = nombreSector;
        this.idSector = idSector;
    }

    // Métodos getter y setter
    public String getNombreSector() {
        return nombreSector;
    }

    public void setNombreSector(String nombreSector) {
        this.nombreSector = nombreSector;
    }

    public int getIdSector() {
        return idSector;
    }

    public void setIdSector(int idSector) {
        this.idSector = idSector;
    }

    // Métodos específicos
    public Sector consultarSector() {
        System.out.println("Consultando información del sector: " + this.nombreSector);
        return this;
    }

    public void mostrarInformacion() {
        System.out.println("Información del sector: " + this.nombreSector + " (ID: " + this.idSector + ")");
    }

    @Override
    public String toString() {
        return nombreSector + " (ID: " + idSector + ")";
    }
}
