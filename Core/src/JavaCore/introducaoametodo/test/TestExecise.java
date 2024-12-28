package JavaCore.introducaoametodo.test;

import JavaCore.introducaoametodo.dominio.ExeciseDominio;

public class TestExecise {
    public static void main(String[] args) {
        ExeciseDominio funcionario01 = new ExeciseDominio();

        ExeciseDominio media = new ExeciseDominio();

        funcionario01.setNome("Goku");
        funcionario01.setIdade(50);
        //Para um array não podemos colocar um valor direto, pois ele é um objeto de referência pedindo assim um objeto
        //ficando assim -> new double []{ numeros aqui}
        funcionario01.setSalario(new double[]{1000, 3000, 3000});

        funcionario01.imprimir();


        System.out.println("Média: " + funcionario01.getMedia());
    }
}
