import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a, b, c;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;

        System.out.printf("MEDIA = %.1f%n", media);
    }
}
