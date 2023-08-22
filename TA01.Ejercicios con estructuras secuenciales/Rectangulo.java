import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double perimetro = 2 * (base + altura);
        double area = base * altura;

        System.out.println("El perímetro es: " + perimetro);
        System.out.println("El área es: " + area);
    }
}
