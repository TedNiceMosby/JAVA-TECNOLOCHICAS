package S5_R1;
/*
Estás diseñando un sistema que permite registrar y activar diferentes unidades de
respuesta a emergencias, como ambulancias, patrullas y camiones de bomberos. Aunque
todas comparten ciertas funciones (como responder a una emergencia), cada una puede
tener un comportamiento específico.

Además, todas las unidades están equipadas con tecnología como sistemas GPS, sirenas,
y son operadas por personal capacitado. Estos componentes serán modelados mediante
composición.
 */

public class MainCentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Pablo");
        Patrulla patrulla = new Patrulla("Patrulla", "Laura");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Marco");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}
