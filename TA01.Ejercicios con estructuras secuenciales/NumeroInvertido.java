import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número de 3 cifras: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 999) {
            int inverso = Integer.parseInt(new StringBuilder(String.valueOf(numero)).reverse().toString());
            System.out.println("El número invertido es: " + inverso);
        } else {
            System.out.println("Por favor, ingresa un número válido de 3 cifras.");
        }
    }
}
