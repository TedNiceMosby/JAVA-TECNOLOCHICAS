/*package S4_R2;
import java.util.Objects;



// ✅ Clase tradicional con encapsulación y validación
public class CuentaFiscal {

    private final String rfc; // No se modifica después del constructor
    private double saldoDisponible;

    // Constructor con validación del saldo
    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser negativo. Se asigna 0.");
            this.saldoDisponible = 0;
        }
    }

    // Getters
    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Método que valida si el RFC de la declaración coincide con el RFC de la cuenta
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    // Método para mostrar información de la cuenta
    public void mostrarCuenta() {
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}
 */

package S4_R2;

import java.util.Objects;

public class CuentaFinanciera {

    // RFC del titular de la cuenta (no se puede cambiar)
    private final String identificadorRFC;

    // Monto disponible en la cuenta
    private double montoDisponible;

    // Constructor que inicializa el RFC y el saldo
    public CuentaFinanciera(String identificadorRFC, double montoInicial) {
        this.identificadorRFC = identificadorRFC;

        if (montoInicial >= 0) {
            this.montoDisponible = montoInicial;
        } else {
            System.out.println("El saldo inicial no puede ser negativo. Se establecerá en 0.");
            this.montoDisponible = 0;
        }
    }

    // Devuelve el RFC registrado en la cuenta
    public String obtenerRFC() {
        return identificadorRFC;
    }

    // Retorna el saldo disponible actual
    public double obtenerSaldo() {
        return montoDisponible;
    }

    // Compara el RFC de la cuenta con el de una declaración
    public boolean coincidenRFC(DeclaracionImpuestos declaracion) {
        return Objects.equals(this.identificadorRFC, declaracion.rfcContribuyente());
    }

    // Imprime los datos actuales de la cuenta
    public void mostrarResumen() {
        System.out.println("Cuenta registrada con RFC: " + identificadorRFC +
                ", saldo actual: $" + montoDisponible);
    }
}
