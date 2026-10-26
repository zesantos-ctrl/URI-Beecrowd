
import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String vendedor = teclado.nextLine();
        double salario = teclado.nextDouble();
        double vendas = teclado.nextDouble();

        double comissao = vendas * 0.15;
        double tudo = salario + comissao;
        System.out.printf("TOTAL = R$ %.2f%n", tudo);

    }
}
