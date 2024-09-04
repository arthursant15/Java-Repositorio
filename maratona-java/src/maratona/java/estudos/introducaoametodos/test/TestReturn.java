package maratona.java.estudos.introducaoametodos.test;

import maratona.java.estudos.introducaoametodos.dominio.DominioReturn;

public class TestReturn {
    public static void main(String[] args) {
        DominioReturn dividi = new DominioReturn();
        int resultado = dividi.dividir(2,2);
        System.out.println(resultado);
    }
}
