package consola;

public class H2GestionarHorarios {

    // Atributos //

    private String dia;
    private String horaInicio;
    private String horaFin;


    // Constructor vacío //

    public H2GestionarHorarios() {
    }

    // MétodoConstructor //

    public H2GestionarHorarios(String dia, String horaInicio, String horaFin) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }


    // Métodos get y set //

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }


}
