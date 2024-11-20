package ec.edu.uce;

import java.util.List;

public class Canton {
    private String nombreCanton;

    // Constructor por defecto
    public Canton() {
        this.nombreCanton = "";
    }

    // Constructor con parámetros
    public Canton(String nombreCanton) {
        this.nombreCanton = nombreCanton;
    }

    // Métodos getter y setter
    public String getNombreCanton() {
        return nombreCanton;
    }

    public void setNombreCanton(String nombreCanton) {
        this.nombreCanton = nombreCanton;
    }

    // Métodos específicos
    public List<String> obtenerCiudades() {
        System.out.println("Obteniendo ciudades del cantón: " + this.nombreCanton);
        return null;
    }
}
