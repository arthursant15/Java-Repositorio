package maratona.java.estudos.introducaoametodos.test;

import maratona.java.estudos.introducaoametodos.dominio.ExeciseDominio;

public class TestExecise {
    public static void main(String[] args) {
        ExeciseDominio funcionario01 = new ExeciseDominio();

        ExeciseDominio media = new ExeciseDominio();

        funcionario01.nome = "Goku";
        funcionario01.idade = 50;
        //Para um array não podemos colocar um valor direto, pois ele é um objeto de referência pedindo assim um objeto
        //ficando assim -> new double []{ numeros aqui}
        funcionario01.salario =new double[]{1000,3000,3000};

        funcionario01.imprimir();
        funcionario01.media();




    }
}
