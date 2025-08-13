import java.util.Scanner;

public class Qualeomaior {
    public static void main(String[] args) {
        System.out.println("Quem é o maior?");
        Scanner digitar = new Scanner(System.in);
        System.out.println("Digite algum numero: ");
        int numero1 = digitar.nextInt();
        System.out.println("Digite algum outro numero: ");
        int numero2 = digitar.nextInt();
        if (numero1 == numero2 ){
            System.out.println("Os numeros " + numero1+ " e " + numero2 + " são inguais!");
        }if (numero1 < numero2){
            System.out.println("O numero " + numero1+ " é menor que  " + numero2);
        }if(numero1>numero2){
            System.out.println("O numero " + numero1+ " é maior que  " + numero2);
        }
    }
}
