package S3_R1;

//✈️ Tu nuevo desafío es simular un sistema donde un pasajero puede reservar un asiento en un vuelo,
// consultar su itinerario y cancelar la reserva si así lo desea.

public class Main {
    public static void main(String[] args) {
        // Crear instancia del vuelo sin reservas aún
        Vuelo vueloInternacional = new Vuelo("UX123", "París", "14:30");

        // Mostrar información inicial del vuelo (sin pasajero)
        System.out.println("== Estado inicial del vuelo ==");
        System.out.println(vueloInternacional.obtenerItinerario());

        // Crear un pasajero con datos personales
        Pasajero cliente1 = new Pasajero("Evelyn Ramos", "A12233");

        // Intentar reservar asiento para el primer pasajero
        boolean exitoReserva = vueloInternacional.reservarAsiento(cliente1);
        if (exitoReserva) {
            System.out.println("Reserva confirmada para " + cliente1.nombre + ".\n");
        } else {
            System.out.println("Error: el asiento ya está ocupado.\n");
        }

        // Mostrar información actualizada con la reserva realizada
        System.out.println("== Después de la reserva ==");
        System.out.println(vueloInternacional.obtenerItinerario());

        // Cancelar la reserva actual
        System.out.println("Cancelando la reserva actual...\n");
        vueloInternacional.cancelarReserva();

        // Mostrar vuelo tras cancelar la reserva
        System.out.println("== Después de cancelar la reserva ==");
        System.out.println(vueloInternacional.obtenerItinerario());

        // Hacer una nueva reserva usando el método alternativo (con datos directos)
        System.out.println("Realizando nueva reserva...\n");
        vueloInternacional.reservarAsiento("Memo", "1112222");

        // Mostrar el itinerario final
        System.out.println("== Itinerario final ==");
        System.out.println(vueloInternacional.obtenerItinerario());
    }
}
