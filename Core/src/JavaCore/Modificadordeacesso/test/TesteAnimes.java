package JavaCore.Modificadordeacesso.test;

import JavaCore.Modificadordeacesso.dominio.Animes;

public class TesteAnimes {
    public static void main(String[] args) {
        Animes animes = new Animes();



        animes.setNome("Dragon ball Daima");
        animes.setTipo("Anime");
        animes.setEpisodios(2);

        animes.imprime();
    }
}
