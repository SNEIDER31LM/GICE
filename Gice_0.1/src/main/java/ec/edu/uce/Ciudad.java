package ec.edu.uce;

import java.util.List;

public class Ciudad {
    private String nombreCiudad;
    private int idCanton; // Nuevo atributo

    // Constructor por defecto
    public Ciudad() {
        this.nombreCiudad = "";
        this.idCanton = 0; // Inicialización por defecto
    }

    // Constructor con parámetros
    public Ciudad(String nombreCiudad, int idCanton) {
        this.nombreCiudad = nombreCiudad;
        this.idCanton = idCanton;
    }

    // Métodos getter y setter
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(int idCanton) {
        this.idCanton = idCanton;
    }

    // Métodos específicos
    public List<String> obtenerSectores() {
        System.out.println("Obteniendo sectores de la ciudad: " + this.nombreCiudad);
        return null;
    }

    @Override
    public String toString() {
        return nombreCiudad + " (Canton ID: " + idCanton + ")";
    }
}
