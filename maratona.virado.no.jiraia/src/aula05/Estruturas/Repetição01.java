package aula05.Estruturas;

public class Repetição01 {
    public static void main(String[] args) {
        int c = 0;
        while (c < 10) {
            c = c + 1;
            System.out.println("While " + c);

        }
        c=0;
        do {
            c++;
            System.out.println("Do-While " + c);

        } while (c < 10);

        for (int co=0;co<=10;co=co+1){
            System.out.println("For " + co);
        }
    }
}
