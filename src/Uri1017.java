import java.util.Scanner;

public class Uri1017 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int x, y;

        x = teclado.nextInt();
        y = teclado.nextInt();

        int multi = y * x;
        double resu = multi / 12.0;
        System.out.printf("%.3f%n ", resu);

    }
}
