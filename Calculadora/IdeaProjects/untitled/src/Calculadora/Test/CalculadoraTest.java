package Calculadora.Test;

import Calculadora.Dominio.CalculadoraDominio;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculadoraTest {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        CalculadoraDominio calculadora = new CalculadoraDominio();

        System.out.println("||-----------------------------------||");
        System.out.println("||-----C A L C U L A D O R A---------||");
        System.out.println("||--------------------||");

        System.out.println("Digite um numero: ");
        double num1 = digitar.nextDouble();
        System.out.println("Digite um numero: ");
        double num2 = digitar.nextDouble();


    }
}