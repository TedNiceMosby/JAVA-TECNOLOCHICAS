package S7_R2;
/*
🧠 Aplicar el uso de BufferedReader, try-with-resources y manejo de excepciones para
analizar grandes archivos de logs generados por pruebas automatizadas. Este reto simula
una tarea del rol de Automated Testing Engineer (QA), enfocada en el procesamiento eficiente
de información y la trazabilidad de errores.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainAnalizadorDeLogs {

    public static void main(String[] args) {
        // Definir rutas de entrada y salida
        Path rutaEntrada = Paths.get("C:\\Users\\USUARIO\\Desktop\\Java\\Tecnolochicas JAVA\\Codigos\\S7_R2\\config");
        Path rutaSalida = Paths.get("C:\\Users\\USUARIO\\Desktop\\Java\\Tecnolochicas JAVA\\Codigos\\S7_R2\\config\\fallos.txt");

        int lineasProcesadas = 0;
        int erroresDetectados = 0;
        int advertenciasDetectadas = 0;

        // Leer el archivo línea por línea
        try (BufferedReader lector = Files.newBufferedReader(rutaEntrada)) {
            String lineaActual;

            while ((lineaActual = lector.readLine()) != null) {
                lineasProcesadas++;

                if (lineaActual.contains("ERROR")) {
                    erroresDetectados++;
                }

                if (lineaActual.contains("WARNING")) {
                    advertenciasDetectadas++;
                }
            }

            // Mostrar resumen del análisis
            System.out.println("Análisis finalizado.");
            System.out.println("Líneas leídas: " + lineasProcesadas);
            System.out.println("Errores encontrados: " + erroresDetectados);
            System.out.println("Advertencias encontradas: " + advertenciasDetectadas);

            double porcentajeError = (lineasProcesadas > 0)
                    ? (erroresDetectados * 100.0) / lineasProcesadas : 0;
            double porcentajeWarning = (lineasProcesadas > 0)
                    ? (advertenciasDetectadas * 100.0) / lineasProcesadas : 0;

            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeError);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarning);

        } catch (IOException ex) {
            System.out.println("No se pudo leer el archivo de logs: " + ex.getMessage());

            // Si hay error, registrar mensaje en archivo alternativo
            try (BufferedWriter escritor = Files.newBufferedWriter(rutaSalida)) {
                escritor.write("Fallo al procesar archivo 'errores.log': " + ex.getMessage());
            } catch (IOException ex2) {
                System.out.println("No se pudo registrar el error en el archivo de respaldo.");
            }
        }
    }
}

