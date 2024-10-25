package AulasIntrodutorias;

public class Repetição05 {
    public static void main(String[] args) {
        double valorDoCarro = 30000;
        for (int parcela = (int) valorDoCarro;parcela >= 1; --parcela) {
            double valorDaParcela = valorDoCarro/parcela;

            if (valorDaParcela<=1000){
            continue;

            }
            System.out.println("Parcela "+ parcela+ " valor da parcela " + valorDaParcela);
            }


        }
    }
