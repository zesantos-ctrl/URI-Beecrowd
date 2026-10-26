
import java.util.Scanner;

public class Uri1007 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b, c, d;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        int dif = (a * b - c * d);
        System.out.println("DIFERENCA = " + dif);
    }
}
