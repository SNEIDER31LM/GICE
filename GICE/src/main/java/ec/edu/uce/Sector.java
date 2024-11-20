package ec.edu.uce;

public class Sector {
    private String nombreSector;

    // Constructor por defecto
    public Sector() {
        this.nombreSector = "";
    }

    // Constructor con parámetros
    public Sector(String nombreSector) {
        this.nombreSector = nombreSector;
    }

    // Métodos getter y setter
    public String getNombreSector() {
        return nombreSector;
    }

    public void setNombreSector(String nombreSector) {
        this.nombreSector = nombreSector;
    }

    // Métodos específicos
    public Sector consultarSector() {
        System.out.println("Consultando información del sector: " + this.nombreSector);
        return this;
    }
}
