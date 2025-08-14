import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        System.out.println("Digite algum numero ");
        int numero = 5;
        int f = 1;
        for (int i = numero; i >= 1; i--) {
            f = f * i;
            System.out.println(i + ";;;" + f);
        }
    }
}
