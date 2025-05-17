package S2_R1;
import java.util.Scanner;

/*
1-💊 Crea una clase llamada SimuladorFarmacia.
2-Solicita al usuario que introduzca los siguientes datos:
    Nombre del medicamento (tipo String)
    Precio unitario (tipo double)
    Cantidad de piezas (tipo int)
3-Calcula el total sin descuento multiplicando el precio por la cantidad.
4-Supón que si el total supera los $500.00, la farmacia ofrece un 15% de descuento.
  Aplica el descuento usando el operador ternario (? :) sin estructuras if.
 */


public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        // Cálculo del total
        double totalSinDescuento = precioUnitario * cantidad;

        // Evaluar si aplica descuento usando operador ternario
        var aplicaDescuento = totalSinDescuento > 500; // Al menos una implementacion de var
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

        // Total a pagar
        double totalConDescuento = totalSinDescuento - descuento;

        // Mostrar resumen
        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

        scanner.close();
    }
}