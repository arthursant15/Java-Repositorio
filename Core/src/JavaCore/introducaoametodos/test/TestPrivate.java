package JavaCore.introducaoametodos.test;

import JavaCore.introducaoametodos.dominio.DominioPrivate;

public class TestPrivate {
    public static void main(String[] args) {
        DominioPrivate individuo = new DominioPrivate();
        individuo.setNome("Arthur");
        individuo.setIdade(19);
        //individuo.imprimir();
        System.out.println(individuo.getNome());
        System.out.println(individuo.getIdade());
    }
}
