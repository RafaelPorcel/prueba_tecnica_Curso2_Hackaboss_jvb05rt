package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.List;

public class VueloUtils {

    public static void imprimirVuelo(Vuelo vuelo) {
        System.out.println(vuelo);
    }

    public static List<Vuelo> filtrarVuelosPorFecha(LocalDate fechaDesde, LocalDate fechaHasta, List<Vuelo> listaParaFiltrar) {
         return listaParaFiltrar.stream()
                .filter(v -> v.getFechaSalida().isAfter(fechaDesde) && v.getFechaSalida().isBefore(fechaHasta))
                .toList();
    }
}
