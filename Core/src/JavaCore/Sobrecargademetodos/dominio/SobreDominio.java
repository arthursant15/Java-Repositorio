package JavaCore.Sobrecargademetodos.dominio;

public class SobreDominio {
    String nome;
    int ano_de_publicacao;
    String autor;
    String genero;
    String personagem;

    public void init(String nome, int ano_de_publicacao, String autor, String genero){
        this.nome = nome;
        this.ano_de_publicacao = ano_de_publicacao;
        this.autor = autor;
        this.genero = genero;
    }
    public void init(String nome, int ano_de_publicacao, String autor, String genero, String personagem){
        init(nome,ano_de_publicacao,autor,genero);
        this.personagem = personagem;
    }

    public String getNome(){
        return nome;
    }
    public int getAno_de_publicacao(){
        return ano_de_publicacao;
    }
    public String getAutor(){
        return autor;
    }
    public String getGenero(){
        return genero;
    }
    public String getPersonagem(){
        return personagem;
    }
    public void imprimir(){
        System.out.println("Nome do Anime: " + this.nome);
        System.out.println("Ano de publicação: " + this.ano_de_publicacao);
        System.out.println("Nome do Autor: " + this.autor);
        System.out.println("Genero do Anime: " + this.genero);
        System.out.println("Personagem de " + this.nome + ": " + this.personagem);
    }
}
