
import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double raio = teclado.nextDouble();

        double PI = 3.14159;

        double resultado = (4.0/3) * PI * raio * raio * raio;

        System.out.printf("VOLUME = %.3f%n", resultado);
    }
}
