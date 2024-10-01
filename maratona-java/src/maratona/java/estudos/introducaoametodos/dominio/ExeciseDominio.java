package maratona.java.estudos.introducaoametodos.dominio;

import maratona.java.estudos.introducaoametodos.test.TestExecise;

public class ExeciseDominio {
    public String nome;
    public int idade;
    public double [] salario;

    public void imprimir(){
        System.out.println("----------------------------------");
        System.out.println("O nome do funcionário é: " + this.nome);
        System.out.println("A idade do funcionário "+ this.nome + " é: "+this.idade);
        for (double num : this.salario) {
            System.out.println(num);
        }
    }
    public void media() {
        double media= 0;
        for (double num : salario){
            media += num;
        }
        System.out.println("A soma de todos os salarios é: " + media);
        media = media / salario.length;
        System.out.println("A média dos salarios é: " + media);
    }

}
