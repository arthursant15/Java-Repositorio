package JavaCore.introducaoametodo.test;

import JavaCore.introducaoametodo.dominio.DominioParametroReference;
import JavaCore.introducaoametodo.dominio.ImprimeEstudante;

public class TestParametroReference {
    public static void main(String[] args) {
        DominioParametroReference estudante1 = new DominioParametroReference();
        DominioParametroReference estudante2 = new DominioParametroReference();
        ImprimeEstudante imprime = new ImprimeEstudante();

        estudante1.nome = "Arthur Santiago";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "Davi Santiago";
        estudante2.idade = 14;
        estudante2.sexo = 'M';

        //Antes do ponto = objeto de referencia
        //Depois do ponto = Metodo "DominioParametroReference"
        //Nos parenteses eu passei o parametro os objetos que referenciam para imprimir os valores
        imprime.imprime(estudante1);
        imprime.imprime(estudante2);
    }
}
