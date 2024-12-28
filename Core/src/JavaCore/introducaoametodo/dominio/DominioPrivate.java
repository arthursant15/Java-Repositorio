package JavaCore.introducaoametodo.dominio;

public class DominioPrivate {
    private String nome;
    private int idade;

    public void imprimir() {
        System.out.println("------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Aqui o get é usado para imprimir

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}


