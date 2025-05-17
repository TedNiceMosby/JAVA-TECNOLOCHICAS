package S1_R2;
// Desarrollar un programa en Java que permita registrar la información básica de entradas para eventos, aplicando los fundamentos de clases,
// objetos, atributos, métodos y el uso de constructores.

/*
    PASOS A SEGUIR
🎫Crea una clase llamada Entrada.
🧱Declara los siguientes atributos:
    Nombre del evento (String)
    Precio de la entrada (double)
🛠️ Crea un constructor que reciba ambos valores al momento de crear el objeto.
📢 Agrega un método público llamado mostrarInformacion() que imprima el siguiente formato:
*/

// Clase principal para probar el sistema de entradas
public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Obra de teatro", 450);
        entrada1.mostrarInformacion();

        //Reto adicional
        /*
        🎁 Como reto extra, convierte la clase Entrada en un record para ver una forma más compacta de declarar estructuras de datos en Java moderno,
        genera un nuevo archivo Entrada_Record y crea un registro extra.
         */

        Entrada_Record entrada2= new Entrada_Record("Obra de teatro", 450.00);
        entrada2.mostrarInformacion();
    }
}

