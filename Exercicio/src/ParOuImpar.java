import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in) ;

        System.out.println("Digite um numero ");

        int numero = digitar.nextInt();

        if(numero % 2 == 0 ){
            System.out.println("O numero é par!!!");
        }else{
            System.out.println("O numero é impar");
        }
    }
}
