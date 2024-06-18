import java.io.*;
import java.util.*;

public class PasswordGenerator {

    private static final String FILE_PATH = "passwords.txt"; // Ruta del archivo de contraseñas

    public static void main(String[] args) {
        List<String> passwords = generateUniquePasswords(10); // Generar 10 contraseñas únicas
        savePasswordsToFile(passwords, FILE_PATH); // Guardar las contraseñas en el archivo
        System.out.println("Contraseñas generadas y guardadas en el archivo: " + FILE_PATH);
    }
    // Método para generar una lista de contraseñas de 2 números sin repetición
    private static List<String> generateUniquePasswords(int count) {
        List<String> passwords = new ArrayList<>();
        Random random = new Random();

        while (passwords.size() < count) {
            int num1 = random.nextInt(10); // Generar primer número entre 0 y 9
            int num2 = random.nextInt(10); // Generar segundo número entre 0 y 9

            if (num1 == num2) {
                continue; // Si los números son iguales, continuar con la próxima iteración
            }

            String password = num1 + "" + num2; // Concatenar números como cadena

            if (!passwords.contains(password)) {
                passwords.add(password); // Agregar la contraseña a la lista si no está presente
            }
        }

        return passwords;
    }
    // Método para guardar las contraseñas en un archivo de texto
    private static void savePasswordsToFile(List<String> passwords, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String password : passwords) {
                writer.write(password); // Escribir cada contraseña
                writer.newLine(); // Nueva línea después de cada contraseña
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de errores de IO
        }
    }
}
