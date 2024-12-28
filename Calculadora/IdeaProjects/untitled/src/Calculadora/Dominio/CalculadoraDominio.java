package Calculadora.Dominio;

public class CalculadoraDominio {
    public double num1;
    public double num2;

    public double soma(CalculadoraDominio soma){
        return num1 + num2;
    }
    public double subtrai(CalculadoraDominio subtrai){
        return num1 - num2;
    }
    public double multiplica(CalculadoraDominio multiplica){
        return num1 * num2;
    }
    public double divide(CalculadoraDominio divide){
        return num1 / num2;
    }

    public void imprimeSoma(){
        System.out.println("A soma de " +num1+ " + " +num2+ " é igual a: " + soma(new CalculadoraDominio()));
    }
    public void imprimeSubtrai(){
        System.out.println("A subtração entre " +num1+ " - " +num2+ " é igual a: " + subtrai(new CalculadoraDominio()));
    }
    public void imprimeMultiplica(){
        System.out.println("A multiplicação entre " +num1+ " x " +num2 + " é igual a: " + multiplica(new CalculadoraDominio()));
    }
    public void imprimeDivide(){
        System.out.println("A divisão entre " +num1+ " / " +num2 + " é igual a: " + divide(new CalculadoraDominio()));
    }
}
