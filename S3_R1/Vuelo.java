package S3_R1;

public class Vuelo {
    final String codigoVuelo;         // Código del vuelo (no cambia)
    String destino;                   // Lugar al que va el vuelo
    String horaSalida;               // Hora de salida
    Pasajero asientoReservado;       // Pasajero que reservó, o null si no hay

    // Constructor para crear un nuevo vuelo
    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        // Validamos que los datos no estén vacíos
        if (codigoVuelo == null) codigoVuelo = "SIN_CODIGO";
        if (destino == null) destino = "SIN_DESTINO";
        if (horaSalida == null) horaSalida = "00:00";

        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null; // Al principio nadie ha reservado
    }

    // Reservar con un objeto Pasajero
    public boolean reservarAsiento(Pasajero p) {
        if (p == null) {
            return false; // No se puede reservar si no hay pasajero
        }

        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false; // Ya hay alguien en el asiento
        }
    }

    // Reservar con nombre y pasaporte (crea el pasajero adentro)
    public boolean reservarAsiento(String nombre, String pasaporte) {
        if (nombre == null || pasaporte == null) {
            return false; // No se puede reservar si faltan datos
        }

        Pasajero nuevo = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevo);
    }

    // Cancelar una reserva
    public void cancelarReserva() {
        asientoReservado = null;
    }

    // Mostrar información del vuelo
    public String obtenerItinerario() {
        String resultado = "Datos del vuelo:\n";
        resultado += "Código: " + codigoVuelo + "\n";
        resultado += "Destino: " + destino + "\n";
        resultado += "Salida: " + horaSalida + "\n";

        if (asientoReservado != null) {
            resultado += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            resultado += "Pasajero: [ninguno]\n";
        }

        return resultado;
    }
}
