package consola;

public class H6GestionarSector {

    // Atributos //

    private String nombre;
    private String tipo;    // Urbano o Rural //


    // Constructor Vacio //

    public H6GestionarSector() {

    }

    // MétodoConstructor //

    public H6GestionarSector(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }


    // Métodos get y set //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
