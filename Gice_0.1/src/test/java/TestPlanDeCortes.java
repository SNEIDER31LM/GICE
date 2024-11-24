import ec.edu.uce.PlanDeCortes;
import java.util.Date;

public class TestPlanDeCortes {
    private static PlanDeCortes planTest;

    public static void main(String[] args) {
        // Crear un plan de cortes de prueba
        Date fechaInicio = new Date(); // Fecha actual para el inicio
        Date fechaFin = new Date(fechaInicio.getTime() + 86400000); // 1 día después
        planTest = new PlanDeCortes("Plan-001", "Corte de luz programado para mantenimiento", fechaInicio, fechaFin, "Activo");

        // Mostrar detalles del plan de cortes creado
        System.out.println("Plan de cortes creado:");
        System.out.println("ID Plan: " + planTest.getIdPlan());
        System.out.println("Descripción: " + planTest.getDescripcion());
        System.out.println("Fecha de Inicio: " + planTest.getFechaInicio());
        System.out.println("Fecha de Fin: " + planTest.getFechaFin());
        System.out.println("Estado: " + planTest.getEstado());

        // Consultar el plan
        planTest.consultarPlan();

        // Actualizar descripción del plan
        planTest.actualizarPlan("Corte de luz programado para mantenimiento urgente");
        System.out.println("Descripción actualizada: " + planTest.getDescripcion());

        // Listar todos los planes
        planTest.listarPlanes();

        // Mostrar información completa del plan
        System.out.println("Información del Plan de Cortes:");
        System.out.println(planTest.toString());
    }
}
