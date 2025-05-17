package S3_R2;
import java.util.Optional;

public class Factura {
    // Campos privados para almacenar la información de la factura
    private double total;
    private String detalle;
    private Optional<String> identificadorFiscal; // Uso de Optional para manejar posibles valores nulos

    // Constructor que convierte el identificador fiscal a un Optional
    public Factura(double total, String detalle, String identificadorFiscal) {
        this.total = total;
        this.detalle = detalle;
        this.identificadorFiscal = Optional.ofNullable(identificadorFiscal);
    }

    // Método que genera un resumen de la factura en forma de cadena
    public String getResumen() {
        String resumen = "Factura generada:\n";
        resumen += "Descripción: " + detalle + "\n";
        resumen += "Monto: $" + total + "\n";

        // Mostrar identificador fiscal si está presente, o mensaje por defecto si no lo está
        resumen += "RFC: " + identificadorFiscal.orElse("[No proporcionado]") + "\n";

        return resumen;
    }
}
