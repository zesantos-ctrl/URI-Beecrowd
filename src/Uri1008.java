
import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int func = teclado.nextInt();
        int horas = teclado.nextInt();
        double valorhoras = teclado.nextDouble();

       double conta = horas *  valorhoras;
       

        System.out.println("NUMBER = " + func);
        System.out.printf("SALARY = U$ %.2f%n", conta);
    }
}
