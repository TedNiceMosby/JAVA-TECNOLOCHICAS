package S7_R1;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
public class MainRegSimulacion {

    public static void main(String[] args) {
        Path directorioConfig = Paths.get("C:\\Users\\USUARIO\\Desktop\\Java\\Tecnolochicas JAVA\\Codigos\\S7_R1\\config");
        Path archivoParametros = directorioConfig.resolve("Config.txt");
        String datosSimulacion = "duración de ciclo: 55.8 s\n" + "Vel. de línea: 1.2 metros/segundo\n" +"cant. de estaciones: 8\n";

        try {if (!Files.exists(directorioConfig)) {
            Files.createDirectory(directorioConfig);
            System.out.println("Directorio 'config' generado exitosamente.");
        }
            Files.write(archivoParametros, datosSimulacion.getBytes());
            System.out.println("Archivo de configuración guardado correctamente.");

            // Verificar existencia del archivo
            if (Files.exists(archivoParametros)) {
                System.out.println("Archivo creado en la ubicación: " + archivoParametros.toAbsolutePath());

                // Leer contenido del archivo
                String contenido = Files.readString(archivoParametros);
                System.out.println("Contenido actual del archivo:");
                System.out.println(contenido);
            } else {
                System.out.println("No se pudo generar el archivo.");
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un problema al acceder al archivo: " + e.getMessage());
        }
    }
}