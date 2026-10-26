
import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b, c;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        int maiorab = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorab + c + Math.abs(maiorab - c)) / 2;

        System.out.println(maior + " eh o maior");
    }
}
