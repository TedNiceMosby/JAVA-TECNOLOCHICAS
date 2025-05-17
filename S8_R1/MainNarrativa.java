package S8_R1;

public class MainNarrativa {
    public static void main(String[] args) {
        GestorDialogo dialogo = new DialogoTexto();
        TransicionHistoria transicion = new TransicionSimple();
        LogicaDecision decision = new DecisionBinaria();

        // Simulación de narrativa
        dialogo.mostrarDialogo("Estás frente a una cueva oscura.");
        String eleccion = decision.obtenerDecision("¿Deseas entrar a la cueva? (si/no)");

        if ("si".equalsIgnoreCase(eleccion)) {
            transicion.cambiarEscena("Has entrado en la cueva. Es húmeda y silenciosa...");
        } else {
            transicion.cambiarEscena("Decides no entrar. Regresas por donde viniste.");
        }
    }
}

