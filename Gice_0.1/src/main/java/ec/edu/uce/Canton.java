package ec.edu.uce;

import java.util.ArrayList;
import java.util.List;

public class Canton {
    private String nombreCanton;
    private List<String> ciudades;
    private int idProvincia;  // Nuevo atributo

    // Constructor por defecto
    public Canton() {
        this.nombreCanton = "";
        this.ciudades = new ArrayList<>();
        this.idProvincia = 0;  // Inicialización por defecto
    }

    // Constructor con parámetros
    public Canton(String nombreCanton, int idProvincia) {
        this.nombreCanton = nombreCanton;
        this.ciudades = new ArrayList<>();
        this.idProvincia = idProvincia;
    }

    // Métodos getter y setter
    public String getNombreCanton() {
        return nombreCanton;
    }

    public void setNombreCanton(String nombreCanton) {
        this.nombreCanton = nombreCanton;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    // Métodos específicos
    public void agregarCiudad(String ciudad) {
        this.ciudades.add(ciudad);
    }

    public List<String> obtenerCiudades() {
        return this.ciudades;
    }

    @Override
    public String toString() {
        return nombreCanton + " (Provincia ID: " + idProvincia + ")";
    }
}