
import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double raio = teclado.nextDouble();
        double n = 3.14159;

        double area = n * raio * raio;
        System.out.printf("A=%.4f%n", area);
    }
}
