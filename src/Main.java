import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int a = 0;
        int b = 0;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            // Base para el ejercicio: este switch debe ser trabajado en varias feature/*.
            // El conflicto intencional se genera cuando dos o mas features editan las
            // mismas lineas.
            switch (opcion) {
                case 1:
                    System.out.println("Suma: " + (a + b));
                    break;
                case 2:
                    System.out.println("Resta: " + (a - b));
                    break;
                case 3:
                    System.out.println("Multiplicación: " + (a * b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("División: " + (a / b));
                    } else {
                        System.out.println("Error: No se puede dividir por cero");
                    }
                    break;
                default:
                    System.out.println("TODO: implementar menu y validaciones");
                    break;
            }

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número (a): ");
                a = sc.nextInt();
                System.out.print("Ingresa el segundo número (b): ");
                b = sc.nextInt();
            }

        } while (opcion != 5);

        sc.close();
    }
}
