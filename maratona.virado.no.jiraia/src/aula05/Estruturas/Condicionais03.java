package aula05.Estruturas;

public class Condicionais03 {
    public static void main(String[] args) {
        int dia = 2;

        switch (dia){
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Número inválildo!");
                break;
        }
        if (dia==1 || dia==7){
            System.out.println("Final de semana");
        }else {
            System.out.println("Dia util");
        }
    }
}
