package S8_R1;

public class TransicionSimple implements TransicionHistoria {
    @Override
    public void cambiarEscena(String descripcion) {
        System.out.println(">>> Transición: " + descripcion);
    }
}
