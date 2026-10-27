
import java.util.Scanner;

public class Uri1015 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double x1, y1;
        double x2, y2;

        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();

        double subtracao = x1 - x2;
        double subtracao2 = y1 - y2;
        double resultado = Math.sqrt(Math.pow(subtracao, 2) + Math.pow(subtracao2, 2));
        System.out.printf("%.4f%n", resultado);

    }
}
