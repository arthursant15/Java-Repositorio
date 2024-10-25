package JavaCore.introducaoametodos.test;

import JavaCore.introducaoametodos.dominio.DominioReturn;

public class TestReturn {
    public static void main(String[] args) {
        DominioReturn dividi = new DominioReturn();
        int resultado = dividi.dividir(2,2);
        System.out.println(resultado);
    }
}
