package S5_R2;

public class PagoTransferencia extends MetodoPago {

    // Indica si la transferencia fue validada por un servicio externo
    private boolean validacionExterna;

    // Constructor que recibe el monto y el estado de validación
    public PagoTransferencia(double monto, boolean validacionExterna) {
        super(monto);
        this.validacionExterna = validacionExterna;
    }

    // Retorna si la transferencia está validada o no
    @Override
    public boolean autenticar() {
        return validacionExterna;
    }

    // Imprime el mensaje al procesar la transferencia
    @Override
    public void procesarPago() {
        System.out.println("Transferencia electrónica realizada por $" + monto);
    }
}