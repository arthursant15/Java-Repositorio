package JavaCore.MetodosConstrutores.test;


import JavaCore.MetodosConstrutores.dominio.DomConstrutores;

public class TestConstrutores {
    public static void main(String[] args) {
        DomConstrutores anime = new DomConstrutores("Dragon ball", 1986, "Akira Toriyama", "Luta", "Goku", "Toei Animation");
        anime.imprimir();
    }
}
