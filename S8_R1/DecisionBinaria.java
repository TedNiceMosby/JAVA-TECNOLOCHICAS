package S8_R1;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String obtenerDecision(String pregunta) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(pregunta + " ");
        String respuesta = scanner.nextLine();
        return respuesta.trim();
    }
}
