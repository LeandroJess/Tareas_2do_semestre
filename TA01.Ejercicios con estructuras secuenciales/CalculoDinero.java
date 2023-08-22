import java.util.Scanner;

public class CalculoDinero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de billetes de 10 bolivianos: ");
        int billetes10 = scanner.nextInt();
        System.out.print("Ingresa la cantidad de monedas de 5 bolivianos: ");
        int monedas5 = scanner.nextInt();
        System.out.print("Ingresa la cantidad de monedas de 2 bolivianos: ");
        int monedas2 = scanner.nextInt();
        System.out.print("Ingresa la cantidad de monedas de 1 boliviano: ");
        int monedas1 = scanner.nextInt();

        int totalDinero = (billetes10 * 10) + (monedas5 * 5) + (monedas2 * 2) + monedas1;

        System.out.println("La cantidad de dinero que tienes es: " + totalDinero + " bolivianos.");
    }
}
