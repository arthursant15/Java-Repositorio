package maratona.java.estudos.javacore.introducaoaclasses.teste.estudante;

import maratona.java.estudos.javacore.introducaoaclasses.dominio.dominioestudante.Dominio;

public class EstudanteTeste {
    public static void main(String[] args) {
        Dominio estudante = new Dominio();
        estudante.nome = "Davi";
        System.out.println(estudante.nome);
    }
}
