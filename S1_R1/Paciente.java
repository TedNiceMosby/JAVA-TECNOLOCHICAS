package S1_R1;
public class Paciente {
    // Atributos
    String nombre;
    int edad;
    String numExpediente; //Considera que tal vez tanga -
    // Método -> muestra los datos del paciente

    void mostrarInformacion() {
        System.out.println("\nInformación del paciente:");
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numExpediente);
    }
}