// Main.java
import java.util.Scanner;


/* Clase principal que tiene toda la interacción del usuario  */
public class Main {


/* Menú principal que incluye todas las funciones del programa */

    public static void main(String[] args) {
        Licuadora licuadora = new LicuadoraSimple();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú de la Licuadora ---");
            System.out.println("1. Encender la licuadora");
            System.out.println("2. Llenar la licuadora");
            System.out.println("3. Aumentar la velocidad");
            System.out.println("4. Verificar velocidad");
            System.out.println("5. Verificar si está llena");
            System.out.println("6. Vaciar la licuadora");
            System.out.println("7. Apagar la licuadora");
            System.out.println("8. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> licuadora.encender();
                case 2 -> {
                    System.out.print("Ingrese el ingrediente para llenar: ");
                    String ingrediente = scanner.nextLine();
                    licuadora.llenar(ingrediente);
                }
                case 3 -> licuadora.aumentarVelocidad();
                case 4 -> System.out.println("Velocidad actual: " + licuadora.obtenerVelocidadActual());
                case 5 -> System.out.println("Licuadora llena: " + (licuadora.estaLlena() ? "Sí" : "No"));
                case 6 -> licuadora.vaciar();
                case 7 -> licuadora.apagar();
                case 8 -> {
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        }
    }
}
