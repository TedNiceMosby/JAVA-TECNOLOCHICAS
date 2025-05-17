package S5_R2;

/*
Estás construyendo un módulo para una tienda en línea. El sistema debe permitir procesar
pagos mediante diferentes medios: efectivo, tarjeta bancaria o transferencia.

Cada tipo de pago debe implementar su lógica de validación y confirmación, pero todos siguen
un contrato general. Además, se debe permitir que en el futuro puedan agregarse nuevos
métodos sin modificar los ya existentes (principio de extensión).


 */


public class MainCajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
                new PagoEfectivo(125643),
                new PagoTarjeta(3222, 50.0),
                new PagoTransferencia(2520.0, false) // esta fallará en autenticación
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}

