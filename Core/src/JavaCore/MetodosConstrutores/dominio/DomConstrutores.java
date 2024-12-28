package JavaCore.MetodosConstrutores.dominio;

import JavaCore.Modificadordeacesso.dominio.Animes;

public class DomConstrutores {
    String nome;
    int ano_de_publicacao;
    String autor;
    String genero;
    String personagem;
    String empresa;

    public DomConstrutores(String nome, int ano_de_publicacao, String autor, String genero, String personagem){
        this();
        this.nome = nome;
        this.ano_de_publicacao = ano_de_publicacao;
        this.autor = autor;
        this.genero = genero;
        this.personagem = personagem;
    }

    public DomConstrutores(String nome, int ano_de_publicacao, String autor, String genero, String personagem, String  empresa){
        this(nome, ano_de_publicacao,autor,genero,personagem);
        this.empresa = empresa;
    }

    public DomConstrutores(){
        System.out.println("Construtor sem argumento.");
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
        System.out.println("Empresa do anime " +this.nome + ": " + this.empresa);

    }
}

