package S8_R1;

public class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String texto) {
        System.out.println("[Diálogo] " + texto);
    }
}
