package ec.edu.uce;

import java.util.List;

public class Provincia {
    private String nombreProvincia;
    private int idProvincia;  // Atributo idProvincia

    // Constructor por defecto
    public Provincia() {
        this.nombreProvincia = "";
        this.idProvincia = 0;  // Inicialización por defecto
    }

    // Constructor con parámetros
    public Provincia(String nombreProvincia, int idProvincia) {
        this.nombreProvincia = nombreProvincia;
        this.idProvincia = idProvincia;
    }

    // Métodos getter y setter
    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    // Método que podría usarse para obtener la lista de cantones de la provincia (suponiendo que tienes esta funcionalidad)
    public List<String> obtenerCantones() {
        System.out.println("Obteniendo cantones de la provincia: " + this.nombreProvincia);
        return null;
    }

    @Override
    public String toString() {
        return nombreProvincia + " (ID: " + idProvincia + ")";
    }
}