import java.util.Scanner;

public class sumaPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextDouble();

        double suma = num1 + num2 + num3;
        double promedio = suma / 3;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}
