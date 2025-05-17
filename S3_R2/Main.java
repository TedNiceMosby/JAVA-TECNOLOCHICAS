package S3_R2;

/*
🧾 Tu reto será modelar una factura sencilla, que contenga los datos básicos de una compra y, opcionalmente, el RFC del cliente.
Se deberá proteger el acceso a los atributos y permitir el uso seguro de null a
través de Optional.
 */

public class Main {
    public static void main(String[] argumentos) {
        // Crear factura con RFC
        Factura facturaCliente1 = new Factura(2500.0, "Consultoría técnica", "ABCC010101XYZ");

        // Crear factura sin RFC (se utiliza null)
        Factura facturaCliente2 = new Factura(1800.0, "Mantenimiento de hardware", null);

        // Mostrar detalles de ambas facturas
        System.out.println(facturaCliente1.getResumen());
        System.out.println(facturaCliente2.getResumen());
    }
}