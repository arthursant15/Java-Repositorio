package maratona.java.estudos.javacore.introducaoaclasses.teste.carro;

import maratona.java.estudos.javacore.introducaoaclasses.dominio.dominiocarro.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fiat";
        carro2.nome = "Volkswagen";
        carro1.modelo = "Uno";
        carro2.modelo = "Gol";
        carro1.ano = 2005;
        carro2.ano = 2012;
        System.out.println("1° Carro: " );
        System.out.println("Nome: " + carro1.nome + ", Modelo: " + carro1.modelo + ", Ano: " + carro1.ano);
        System.out.println("----------------------------------------");
        System.out.println("Carro 2:");
        System.out.println("Nome: " + carro2.nome + ", Modelo: " + carro2.modelo + ", Ano: " + carro2.ano);

    }
}
