import ec.edu.uce.EmpresaElectrica;
import ec.edu.uce.CorteDeLuz;
import java.util.Date;

public class TestEmpresaElectrica {
    private static EmpresaElectrica empresa;
    private static CorteDeLuz corte;

    public static void main(String[] args) {
        // Crear un corte de luz de prueba
        Date fechaInicio = new Date(); // Fecha actual para el inicio
        Date fechaFin = new Date(fechaInicio.getTime() + 86400000); // 1 día después
        corte = new CorteDeLuz("Corte-001", fechaInicio, fechaFin, "Mantenimiento", "Pendiente");

        // Crear la empresa eléctrica
        empresa = new EmpresaElectrica("ElectroEcuador", "Av. Amazonas y Shyris, Quito", "1800-123456");

        // Mostrar información de la empresa
        System.out.println("Empresa Eléctrica:");
        System.out.println("Nombre: " + empresa.getNombreEmpresa());
        System.out.println("Dirección: " + empresa.getDireccion());
        System.out.println("Teléfono de Contacto: " + empresa.getTelefonoContacto());

        // Enviar datos de corte
        empresa.enviarDatosCorte(corte);

        // Consultar cortes programados
        empresa.consultarCortesProgramados();

        // Enviar notificación
        empresa.enviarNotificacion();

        // Actualizar notificación
        empresa.actualizarNotificacion();
    }
}
