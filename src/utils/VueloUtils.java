package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class VueloUtils {

    public static void imprimirVuelo(Vuelo vuelo) {
        System.out.println(vuelo);
    }

    public static List<Vuelo> filtrarVuelosPorFecha(LocalDate fechaInicio, LocalDate fechaFin, List<Vuelo> listaParaFiltrar) {

        //convierto la lista en un stream para procesarla
        //si la fecha es null el elemento pasa el filtro y la otra condición no se evalúa, asi que pasarían todos los elementos
        //con '!' invierto la condicion para incluir la misma fecha exacta y que pase el filtro cuando la compare si es anterior o posterior
        //con el sorted ordeno la lista y con el Comparator le digo que me la ordene por FechaSalida
        //con toList convierto en nueva lista los elementos ya filtrados y ordenados anteriormente
        return listaParaFiltrar.stream()
                .filter(v -> (fechaInicio == null || !v.getFechaSalida().isBefore(fechaInicio)))
                .filter(v -> (fechaFin == null || !v.getFechaSalida().isAfter(fechaFin)))
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .toList();
    }
}
