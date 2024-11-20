package ec.edu.uce;

import java.util.List;

public class Ciudad {
    private String nombreCiudad;

    // Constructor por defecto
    public Ciudad() {
        this.nombreCiudad = "";
    }

    // Constructor con parámetros
    public Ciudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    // Métodos getter y setter
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    // Métodos específicos
    public List<String> obtenerSectores() {
        System.out.println("Obteniendo sectores de la ciudad: " + this.nombreCiudad);
        return null;
    }
}
