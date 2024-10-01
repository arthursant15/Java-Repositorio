package maratona.java.estudos.introducaoametodos.test;

import maratona.java.estudos.introducaoametodos.dominio.DominioThis;


public class TestThis {
    public static void main(String[] args) {
        DominioThis estudante1 = new DominioThis();
        DominioThis estudante2 = new DominioThis();

        estudante1.nome = "Arthur Santiago";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "Veronica Santiago";
        estudante2.idade = 49;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
