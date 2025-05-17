
package S4_R1;

public class Factura {

    // Datos privados de la factura
    private String numeroFactura;
    private String nombreCliente;
    private double montoTotal;

    /**
     * Constructor principal de la clase Factura.
     * @param numeroFactura  Identificador único de la factura.
     * @param nombreCliente  Nombre del cliente asociado a la factura.
     * @param montoTotal     Monto total a pagar.
     */
    public Factura(String numeroFactura, String nombreCliente, double montoTotal) {
        this.numeroFactura = numeroFactura;
        this.nombreCliente = nombreCliente;
        this.montoTotal = montoTotal;
    }

    //Devuelve una representación en cadena del objeto Factura.
    @Override
    public String toString() {
        return "Factura [Número=" + numeroFactura + ", Cliente=" + nombreCliente + ", Total=$" + montoTotal + "]";
    }

    //Compara si dos facturas son equivalentes según su número de factura.

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otraFactura = (Factura) obj;
        return this.numeroFactura.equals(otraFactura.numeroFactura);
    }


    //Devuelve un código hash consistente con el método equals().

    @Override
    public int hashCode() {
        return numeroFactura.hashCode();
    }
}