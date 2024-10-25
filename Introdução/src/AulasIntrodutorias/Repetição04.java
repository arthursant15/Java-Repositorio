package AulasIntrodutorias;

public class Repetição04 {
    public static void main(String[] args) {
        double valorDoCarro = 30000;
        for (int parcela = 1; parcela <= valorDoCarro; ++parcela) {
            double valorDaParcela = valorDoCarro/parcela;
            System.out.println("Parcela "+ parcela+ " valor da parcela " + valorDaParcela);
            if (valorDaParcela==1000){

                break;
            }


        }


    }
}
