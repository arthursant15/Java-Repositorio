package JavaCore.introducaoametodos.test;

import JavaCore.introducaoametodos.dominio.DominioReturnPrt02;

public class TestReturnPart02 {
    public static void main(String[] args) {
        DominioReturnPrt02 mudarNumero = new DominioReturnPrt02();
        int num1 = 1;
        int num2 = 2;
        mudarNumero.alterandoDoisNumeros(num1,num2);
        System.out.println("-----------------");
        System.out.println("TestReturnPart02");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

    }
}
