import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Debes poner el archivo en la carpeta raíz del proyecto o en out/production/ejercicio2
        String nombreArchivo = "datos.txt";

        try {
            File archivo = new File(nombreArchivo);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo '" + nombreArchivo + "' no fue encontrado.");
        }
    }
}
