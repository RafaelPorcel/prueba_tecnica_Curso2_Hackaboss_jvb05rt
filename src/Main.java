import entities.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import utils.VueloUtils;

public class Main {
    public static void main(String[] args) {

        //Constantes de fechas
        final LocalDate fechaDesde;
        final LocalDate fechaHasta;

        fechaDesde = LocalDate.of(2026,1,12);
        //fechaDesde = null;

        fechaHasta = LocalDate.of(2026,5,14);
        //fechaHasta = LocalDate.of(2026,5,14);

        /*final Optional<LocalDate> fechaInicio = Optional.ofNullable(null);
        final Optional<LocalDate> fechaFin = Optional.ofNullable(null);*/

        //Instanciar vuelos de la clase Vuelo
        Vuelo v1 = new Vuelo(5641, "MCD234", "Iberia", "Madrid", "París",
                LocalDate.of(2026, 1, 13), LocalDate.of(2026, 1, 13));
        Vuelo v2 = new Vuelo(234165, "89ElQ", "KLM", "Ámsterdam", "Málaga",
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

        //Crear una lista de tipo Vuelos y agregarle los 10 Vuelos
        List<Vuelo> listaVuelos = new ArrayList<>(Arrays.asList(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10));

        //Recorrer la lista e imprimirla mediante la función creada en la otra clase
        for (Vuelo v : listaVuelos){
            VueloUtils.imprimirVuelo(v);
        }

        System.out.println("**************** FILTRO ****************");
        List<Vuelo> vuelosFiltrados = new ArrayList<>(VueloUtils.filtrarVuelosPorFecha(fechaDesde, fechaHasta, listaVuelos));
        System.out.println("Los vuelos de esta lista van desde : " + fechaDesde + " hasta: " + fechaHasta);
        for (Vuelo v :vuelosFiltrados){
            VueloUtils.imprimirVuelo(v);
        }

        //VueloUtils.filtrarVuelosPorFecha(fechaDesde, fechaHasta, listaVuelos);


    }
}
