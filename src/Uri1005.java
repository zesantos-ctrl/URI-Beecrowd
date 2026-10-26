
import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a, b;

        a = teclado.nextDouble();
        b = teclado.nextDouble();

        double media = (3.5 * a + b * 7.5) / 11;

        System.out.printf("MEDIA = %.5f%n", media);
    }
}
