import entities.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import utils.VueloUtils;

public class Main {
    public static void main(String[] args) {

        //Constantes de fechas para pasarle al método
        final LocalDate fechaInicio = LocalDate.of(2026, 5, 13);
        final LocalDate fechaFin = null;

        //Instanciar vuelos de la clase Vuelo
        Vuelo v1 = new Vuelo(5641, "MCD234", "Iberia", "Madrid", "París",
                LocalDate.of(2026, 1, 13), LocalDate.of(2026, 1, 13));
        Vuelo v2 = new Vuelo(234165, "89ElQP", "KLM", "Ámsterdam", "Málaga",
                LocalDate.of(2026, 2, 13), LocalDate.of(2026, 3, 1));
        Vuelo v3 = new Vuelo(5642, "PLM567", "Air France", "París", "Roma",
                LocalDate.of(2026, 3, 13), LocalDate.of(2026, 2, 10));
        Vuelo v4 = new Vuelo(5643, "JKL890", "Lufthansa", "Berlín", "Barcelona",
                LocalDate.of(2026, 4, 13), LocalDate.of(2026, 4, 5));
        Vuelo v5 = new Vuelo(5644, "QWE123", "Turkish Airlines", "Estambul", "Madrid",
                LocalDate.of(2026, 5, 13), LocalDate.of(2026, 1, 25));
        Vuelo v6 = new Vuelo(5645, "RTY456", "Iberia", "Madrid", "Nueva York",
                LocalDate.of(2026, 6, 13), LocalDate.of(2026, 5, 12));
        Vuelo v7 = new Vuelo(5646, "UIO789", "KLM", "Ámsterdam", "Lisboa",
                LocalDate.of(2026, 7, 13), LocalDate.of(2026, 2, 28));
        Vuelo v8 = new Vuelo(5647, "PAS321", "Air France", "París", "Londres",
                LocalDate.of(2026, 8, 13), LocalDate.of(2026, 3, 15));
        Vuelo v9 = new Vuelo(5648, "MNB654", "Lufthansa", "Berlín", "Tokio",
                LocalDate.of(2026, 9, 13), LocalDate.of(2026, 4, 20));
        Vuelo v10 = new Vuelo(5649, "VCX987", "Turkish Airlines", "Estambul", "Buenos Aires",
                LocalDate.of(2026, 10, 13), LocalDate.of(2026, 5, 8));

        //Crear una lista de tipo Vuelos y agregarle los 10 Vuelos, los meto desordenados porque están ordenados por fecha en las instancias
        List<Vuelo> listaVuelos = new ArrayList<>(Arrays.asList(v4, v9, v8, v6, v2, v1, v10, v3, v7, v5));

        //Recorrer la lista e imprimirla mediante la función creada en la otra clase
        System.out.println("LISTA COMPLETA DE VUELOS");
        for (Vuelo v : listaVuelos) {
            VueloUtils.imprimirVuelo(v);
        }

        //Creo un Optional con las variables LocalDate
        // con .map convierto el tipo a String y asi puedo imprimir un String en el orElse
        System.out.println("\nFILTRADO DE VUELOS DESDE " +
                Optional.ofNullable(fechaInicio).map(LocalDate::toString).orElse("EL PRINCIPIO DE LOS TIEMPOS") +
                " HASTA: " +
                Optional.ofNullable(fechaFin).map(LocalDate::toString).orElse("EL FINAL DE LOS TIEMPOS"));

        List<Vuelo> vuelosFiltrados = VueloUtils.filtrarVuelosPorFecha(fechaInicio, fechaFin, listaVuelos);

        for (Vuelo v : vuelosFiltrados) {
            VueloUtils.imprimirVuelo(v);
        }


    }
}
