****Lista de vuelos****
Se requiere desarrollar una programa en Java que permita filtrar una lista de vuelos según distintos 
criterios de búsqueda basados en fechas y que se puedan ver en la terminal.

    -Requisitos-

    1.-Definir constantes de fecha en Main:
Se deben definir dos constantes de fecha en la Clase Main. Te servirán para declarar la fecha de inicio y la fecha fin (fechaInicio, fechaFin ), ten en cuenta que podrian ser nulas tambien.

    2.-Estructura del objeto Vuelo:
Id (int) - No importa el orden de la secuencia
nombreVuelo (String) - Nombres que tú quieras. Ej. (H001-V)
empresa (String) - Aerolíneas Reales que tú quieras. Ej. (Iberia, Turkish)
lugarSalida (String) - Ciudades más importantes Ej. (Madrid, Barcelona)
lugarLlegada (String) - Ciudades más importantes Ej. (Buenos Aires, New York)
fechaSalida (LocalDate) - Año-Mes-Día. : 2025-05-20 Ej. LocalDate.of(2025, 5, 20)
fechaLlegada (LocalDate) - Año-Mes-Día. : 2025-05-20 Ej. LocalDate.of(2025, 5, 20)

    3.-Función de filtrado (comprobar solo la fechaSalida del vuelo):
Si no se envía la fechaInicio, el filtro debe devolver todos los vuelos hasta la fecha fechaFin.
Si no se envía la fechaFin, el filtro debe devolver todos los vuelos desde la fecha fechaInicio en adelante.
Si se envían ambas fechas, debe devolver los vuelos que se encuentren dentro de ese rango de fechas.
Si no se envía ninguna fecha, debe devolver todos los vuelos.
Devolver siempre los vuelos ordenados por fechaSalida.

    4.-Crear en Main una lista de 10 vuelos de prueba.
    5.-Imprimir los vuelos en Main.
    
    6.-Recomendaciones:
Crear un package llamado entities para que crees tu entidad Vuelo.
Crear un package llamado utils para que crees tu clase utilitaria para la función de filtro.



