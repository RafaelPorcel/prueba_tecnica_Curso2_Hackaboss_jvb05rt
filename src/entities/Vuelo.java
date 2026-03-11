package entities;

import java.time.LocalDate;

public class Vuelo {

    //Atributos de Vuelo
    private int id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLlegada;
    private LocalDate fechaSalida;
    private LocalDate fechaLlegada;

    //Constructor de Vuelo
    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida,
                 String lugarLlegada, LocalDate fechaSalida, LocalDate fechaLlegada) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    //Getters & Setters de Vuelo
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    @Override
    /*public String toString() {
        return "Vuelo: %14s" + nombreVuelo +
                " | Empresa: %27s" + empresa +
                " | Salida: %20s" + lugarSalida +
                " | Destino: %24s" + lugarLlegada +
                " | F.Salida: %21s" + fechaSalida +
                " | F.Llegada: %22s" + fechaLlegada;
    }*/
    public String toString() {
        return String.format(
                "Vuelo %-6s | Empresa %-16s | Salida %-10s | Destino %-12s | F.Salida %-10s | F.Llegada %-11s",
                nombreVuelo, empresa, lugarSalida, lugarLlegada, fechaSalida, fechaLlegada
        );
    }
}
