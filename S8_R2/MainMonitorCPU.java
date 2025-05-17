package S8_R2;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class MainMonitorCPU {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Set<Integer> historialConsumo = new HashSet<>();

        try {
            System.out.println("Introduce valores de uso de CPU (enteros del 0 al 100). Ingresa -1 para finalizar.");

            while (true) {
                System.out.print("Uso de CPU (%): ");

                int lectura;
                try {
                    lectura = entrada.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Debes ingresar un número entero.");
                    entrada.nextLine(); // limpiar entrada incorrecta
                    continue;
                }

                if (lectura == -1) {
                    break;
                }

                if (!esPorcentajeValido(lectura)) {
                    System.out.println("Valor fuera de rango. Solo se permiten valores entre 0 y 100.");
                    continue;
                }

                if (!historialConsumo.add(lectura)) {
                    System.out.println("Este valor ya fue registrado anteriormente: " + lectura + "%");
                    continue;
                }

                if (lectura > 95) {
                    throw new ConsumoCriticoException("Alerta: el consumo ha superado el 95% (" + lectura + "%).");
                }

                System.out.println("Valor registrado correctamente: " + lectura + "%");
            }

        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Se produjo un error inesperado: " + e.getMessage());

        } finally {
            entrada.close();
            System.out.println("Finalizando programa y liberando recursos.");
        }
    }

    private static boolean esPorcentajeValido(int valor) {
        return valor >= 0 && valor <= 100;
    }
}

