
import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();
        int resto = x;

        int valor = x / 100;
        resto = resto % 100;
        int valor1 = x / 50;
        resto = resto % 50;
        int valor2 = x / 20;
        resto = resto % 20;
        int valor3 = x / 10;
        resto = resto % 10;
        int valor4 = x / 5;
        resto = resto % 5;
        int valor5 = x / 2;
        resto = resto % 2;
        int notas = resto;

         System.out.println(x);
        System.out.println(valor + " nota(s) de R$ 100,00");
        System.out.println(valor1 + " nota(s) de R$ 50,00");
        System.out.println(valor2 + " nota(s) de R$ 20,00");
        System.out.println(valor3 + " nota(s) de R$ 10,00");
        System.out.println(valor4 + " nota(s) de R$ 5,00");
        System.out.println(valor5 + " nota(s) de R$ 2,00");
        System.out.println(notas + " nota(s) de R$ 1,00");
    }
}
