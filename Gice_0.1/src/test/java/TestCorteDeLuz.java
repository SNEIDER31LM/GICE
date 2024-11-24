import ec.edu.uce.CorteDeLuz;
import java.util.Date;

public class TestCorteDeLuz {
    private static CorteDeLuz corteTest;

    public static void main(String[] args) {
        // Crear un corte de luz de prueba
        Date fechaInicio = new Date(); // Fecha actual para el inicio
        Date fechaFin = new Date(fechaInicio.getTime() + 3600000); // 1 hora después
        corteTest = new CorteDeLuz("Corte-001", fechaInicio, fechaFin, "Mantenimiento", "Activo");

        // Mostrar detalles del corte de luz creado
        System.out.println("Corte de luz creado:");
        System.out.println("ID Corte: " + corteTest.getIdCorte());
        System.out.println("Fecha de Inicio: " + corteTest.getFechaInicio());
        System.out.println("Fecha de Fin: " + corteTest.getFechaFin());
        System.out.println("Motivo: " + corteTest.getMotivo());
        System.out.println("Estado: " + corteTest.getEstado());

        // Mostrar información completa del corte
        System.out.println("Información del Corte de Luz:");
        System.out.println(corteTest.toString());
    }
}