package consola;

public class H4GestionarProvincia {

    // Atributos //

    private String nombre;
    private String codigo;


    // Constructor Vacio //

    public H4GestionarProvincia() {

    }


    // MétodoConstructor //

    public H4GestionarProvincia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }


    // Métodos get y set //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


}
