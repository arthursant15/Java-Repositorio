package maratona.java.estudos.introducaoametodos.dominio;

public class ImprimeEstudante{
    public void imprime (DominioParametroReference estudante){
        System.out.println("-------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
