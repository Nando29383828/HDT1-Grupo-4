import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ILicuadora licuadora = new Licuadora();
        int opcionm = 0;

        while (opcionm != 7){
            System.out.println("\n-------------MENU--------------");
            System.out.println("1. Prender Licuadora");
            System.out.println("2. Llenar Licuadora");
            System.out.println("3. Incrementar velocidad");
            System.out.println("4. Consultar velocidad de Licuadora");
            System.out.println("5. Consultar si Licuadora esta llena");
            System.out.println("6. Vaciar Licuadora");
            System.out.println("7. Apagar Licuadora");

            int a = scanner.nextInt();

            switch(a) {
                case 1:
                    licuadora.endenderLicuadora();
                    break;   
                case 2:
                    licuadora.llenarLicuadora();
                    break;
                case 3:
                    int new_velocidad = licuadora.obtenerVelocidadActual();
                    licuadora.incrementarVelocidad(new_velocidad);
                    break;
                             
            }
        }

    }
}