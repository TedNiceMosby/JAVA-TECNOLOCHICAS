package S4_R1;
/*
📝 Instrucciones
✈️ Tu nuevo desafío es simular un sistema donde un pasajero puede reservar un asiento en un vuelo, consultar su itinerario y cancelar la reserva si así lo desea.

🧱 1. Crear la clase Vuelo
🔐 Atributos:

final String codigoVuelo: código único del vuelo ✈️
String destino: ciudad destino del vuelo 🗺️
String horaSalida: hora de salida en formato 24h ⏰
Pasajero asientoReservado: referencia al pasajero que reservó el asiento (puede ser null)
🛠️ Métodos:

Vuelo(String codigo, String destino, String horaSalida): constructor del vuelo
boolean reservarAsiento(Pasajero p) → Asigna al pasajero si no hay reserva previa
boolean reservarAsiento(String nombre, String pasaporte) → Método sobrecargado
void cancelarReserva() → Elimina al pasajero asignado
String obtenerItinerario() → Muestra la información del vuelo y el pasajero
👤 2. Crear la clase Pasajero
📋 Atributos:

String nombre: nombre del pasajero 👤
String pasaporte: número de pasaporte ✈️
🛠️ Métodos:

Pasajero(String nombre, String pasaporte)
String getNombre()
String getPasaporte()
🚀 3. En la clase Principal
📌 Actividades:

Crear al menos un pasajero y un vuelo
Reservar el asiento en el vuelo
Mostrar el itinerario
Cancelar la reserva
Mostrar nuevamente el itinerario
Reservar un asiento en el vuelo usando un nombre y pasaporte
 */

public class Main {
    public static void main(String[] args) {

        // Creamos dos facturas con el mismo folio
        Factura f1 = new Factura("12345", "Evelyn B", 1122);
        Factura f2 = new Factura("56789", "Alexandra B", 1344);

        // Mostramos ambas facturas con toString()
        System.out.println(f1);
        System.out.println(f2);

        // Comparamos si son iguales usando equals()
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}
