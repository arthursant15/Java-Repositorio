package JavaCore.introducaoametodo.test;

import JavaCore.introducaoametodo.dominio.DominioReturn;

public class TestReturn {
    public static void main(String[] args) {
        DominioReturn dividi = new DominioReturn();
        int resultado = dividi.dividir(2,2);
        System.out.println(resultado);
    }
}
