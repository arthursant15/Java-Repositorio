import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        System.out.println("---Tabuada---");
        System.out.println("Digite algum numero que o resultado será a tabuada dele do 0 até 10");
        int numero = digitar.nextInt();
        if (numero <= 0){
            System.out.println("Digite um numero positivo");
        }else{
            for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + numero*i);
            }
        }
    }
}
