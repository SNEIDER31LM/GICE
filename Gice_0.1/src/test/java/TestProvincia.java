import ec.edu.uce.Provincia;

public class TestProvincia {

    private static Provincia provinciaTest;

    public static void main(String[] args) {
        // Crear una provincia de prueba
        provinciaTest = new Provincia("Pichincha", 1);  // Usando el ID de provincia 1

        // Mostrar detalles de la provincia creada
        System.out.println("Provincia creada:");
        System.out.println("Nombre de la Provincia: " + provinciaTest.getNombreProvincia());
        System.out.println("ID Provincia: " + provinciaTest.getIdProvincia());

        // Llamar al método de obtener cantones
        provinciaTest.obtenerCantones();
    }
}