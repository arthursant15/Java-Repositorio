package JavaCore.introducaoametodo.test;


import JavaCore.introducaoametodo.dominio.VarArgsDominio;

import java.util.Scanner;

public class VarArgsTest {
    public static void main(String[] args) {
        VarArgsDominio dominio = new VarArgsDominio();
        Scanner digitar = new Scanner(System.in);
        int [] numeros = {1,2,2,2,2,2,2,2,2,2,2,2,2,2} ;
        dominio.somarVarArgs(1,1,2,4,3,2,3,4,2);
        dominio.somarVarArgs(numeros);
    }
}
