import ec.edu.uce.Sector;

public class TestSector {

    private static Sector sectorTest;

    public static void main(String[] args) {
        // Crear un sector de prueba
        sectorTest = new Sector("Sector Norte", 101);  // Usando el ID de sector 101

        // Mostrar detalles del sector creado
        System.out.println("Sector creado:");
        System.out.println("Nombre del Sector: " + sectorTest.getNombreSector());
        System.out.println("ID Sector: " + sectorTest.getIdSector());

        // Consultar información del sector
        sectorTest.consultarSector();

        // Mostrar información del sector
        sectorTest.mostrarInformacion();
    }
}