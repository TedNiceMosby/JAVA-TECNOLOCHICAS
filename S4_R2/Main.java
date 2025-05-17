package S4_R2;

/*
🧾 Tu reto será modelar una factura sencilla, que contenga los datos básicos de una compra y, opcionalmente, el RFC del cliente.
Se deberá proteger el acceso a los atributos y permitir el uso seguro de null a través de Optional.
 */



public class Main {
    public static void main(String[] args) {

        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("jeje", 8700.0);
        CuentaFinanciera cuenta = new CuentaFinanciera("jaja", 9500.0);

        // Mostramos la información
        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                           " por $" + declaracion.montoDeclarado());
        cuenta.mostrarResumen();

        boolean rfcValido = cuenta.coincidenRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta?: " + rfcValido);
    }
}
