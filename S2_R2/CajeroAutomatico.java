package S2_R2;
import java.util.Scanner;

/*
 * Clase principal encargada de simular un cajero automático.
 * Permite al usuario consultar el saldo, realizar depósitos y retiros,
 * y salir del sistema.
 * El flujo del programa se controla mediante un bucle do-while y una estructura switch.
 */

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        var balance = 1000.0;
        int opcionSeleccionada;

        do {
            mostrarMenu();
            opcionSeleccionada = entradaUsuario.nextInt();

            switch (opcionSeleccionada) {
                case 1:
                    consultarBalance(balance);
                    break;

                case 2:
                    balance = realizarDeposito(entradaUsuario, balance);
                    break;

                case 3:
                    balance = realizarRetiro(entradaUsuario, balance);
                    break;

                case 4:
                    System.out.println("Sesión finalizada. Gracias por utilizar el cajero.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor ingrese un número entre 1 y 4.");
            }
        } while (opcionSeleccionada != 4);

        entradaUsuario.close();
    }

    // Muestra el menú principal al usuario
    private static void mostrarMenu() {
        System.out.println("\n--- Menú del Cajero Automático ---");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar fondos");
        System.out.println("3. Retirar fondos");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Imprime el saldo actual
    private static void consultarBalance(double saldoActual) {
        System.out.println("Saldo disponible: $" + saldoActual);
    }

    // Permite realizar un depósito y actualiza el saldo
    private static double realizarDeposito(Scanner entrada, double saldo) {
        System.out.print("Ingrese el monto a depositar: ");
        double monto = entrada.nextDouble();

        if (monto <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
            return saldo;
        }

        saldo += monto;
        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        return saldo;
    }

    // Permite retirar dinero si hay saldo suficiente
    private static double realizarRetiro(Scanner entrada, double saldo) {
        System.out.print("Ingrese el monto a retirar: ");
        double monto = entrada.nextDouble();

        if (monto <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
            return saldo;
        }

        if (monto > saldo) {
            System.out.println("Fondos insuficientes. Operación cancelada.");
        } else {
            saldo -= monto;
            System.out.println("Retiro realizado. Saldo restante: $" + saldo);
        }

        return saldo;
    }
}
