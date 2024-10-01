package maratona.java.estudos.introducaoametodos.dominio;

public class DominioThis {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
