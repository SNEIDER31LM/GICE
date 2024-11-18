package consola;

public class H5GestionarCiudad {

    // Atributos //

    private String nombre;
    private String poblacion;


    // Constructor Vacío //

    public H5GestionarCiudad() {

    }


    // MétodoConstructor //

    public H5GestionarCiudad(String nombre, String poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }


    // Métodos get y set //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }


}
