package S1_R2;

public class Entrada {
    // Variables
    String evento;
    double precio;

    // Constructor
    public Entrada(String evento, double precio) {
        this.evento = evento;
        this.precio = precio;
    }
    // Método para mostrar los datos
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " Precio: $" + precio);
    }
}
