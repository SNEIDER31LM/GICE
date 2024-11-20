package ec.edu.uce;

import java.util.List;

public class Provincia {
    private String nombreProvincia;

    // Constructor por defecto
    public Provincia() {
        this.nombreProvincia = "";
    }

    // Constructor con parámetros
    public Provincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    // Métodos getter y setter
    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    // Métodos específicos
    public List<String> obtenerCantones() {
        System.out.println("Obteniendo cantones de la provincia: " + this.nombreProvincia);
        return null;
    }
}
