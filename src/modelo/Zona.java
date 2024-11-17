package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zona {
    private String nombre;
    private LocalDateTime fechaCorte;

    // Constructor
    public Zona(String nombre, LocalDateTime fechaCorte) {
        this.nombre = nombre;
        this.fechaCorte = fechaCorte;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(LocalDateTime fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    // Método para formatear la fecha y hora
    public String getFechaCorteFormateada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return fechaCorte.format(formatter);
    }

    @Override
    public String toString() {
        return "Zona{" +
                "nombre='" + nombre + '\'' +
                ", fechaCorte=" + getFechaCorteFormateada() +
                '}';
    }
}
