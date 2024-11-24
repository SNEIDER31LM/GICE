import ec.edu.uce.Ciudad;

public class TestCiudad {

    private static Ciudad ciudadTest;

    public static void main(String[] args) {
        // Crear una ciudad de prueba
        ciudadTest = new Ciudad("Quito", 1);  // Usando el ID de cantón 1

        // Mostrar detalles de la ciudad creada
        System.out.println("Ciudad creada:");
        System.out.println("Nombre de la Ciudad: " + ciudadTest.getNombreCiudad());
        System.out.println("ID Canton: " + ciudadTest.getIdCanton());

        // Llamar al método de obtener sectores
        ciudadTest.obtenerSectores();
    }
}