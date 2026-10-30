import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int total = teclado.nextInt();

        int horas = total / 3600;
        int resto = total % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
