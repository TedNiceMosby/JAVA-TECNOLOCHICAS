package S1_R1;
import java.util.Scanner;

//⚒️ Desarrollar un programa en Java que registre los datos de un
// paciente, aplicando los fundamentos de clases, objetos,atributos,
// métodos y la entrada de datos por consola.

/*
    PASOS
1-🩺 Crea una clase llamada Paciente.
2-📥 Utiliza la clase Scanner para solicitar los siguientes datos desde la consola:
    Nombre del paciente (String)
    Edad del paciente (int)
    Número de expediente (String)
3-🧱 Declara atributos en la clase Paciente para almacenar esta información.
4-📢 Agrega un método público llamado mostrarInformacion() que imprima el siguiente formato:
    Paciente: Lena Marie
    Edad: 25
    Expediente: EXP202409
5-🧪 Crea un archivo llamado Principal y dentro del método main():
    Crea un objeto de tipo Paciente
    Asigna los valores ingresados por el usuario
    Llama al método mostrarInformacion() para mostrar los datos en consola
 */


public class Main {

    // Método main donde se solicita la información al usuario
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto de tipo Paciente
        Paciente paciente1 = new Paciente();

        // Solicitar y asignar los datos ingresados por el usuario
        System.out.print("Ingresa el nombre del paciente: ");
        paciente1.nombre = scanner.nextLine();

        System.out.print("Ingresa la edad: ");
        paciente1.edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingresa el número de expediente: ");
        paciente1.numExpediente = scanner.nextLine();

        // Mostrar los datos ingresados
        paciente1.mostrarInformacion();

        // Cerrar el scanner
        scanner.close();
    }

}
