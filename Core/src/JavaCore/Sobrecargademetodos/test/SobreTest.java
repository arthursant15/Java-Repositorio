package JavaCore.Sobrecargademetodos.test;

import JavaCore.Sobrecargademetodos.dominio.SobreDominio;

public class SobreTest {
    public static void main(String[] args) {
        SobreDominio dominio = new SobreDominio();

        dominio.init("Dragon ball", 1986,"Akira Toryama","Luta", "Goku");


        dominio.imprimir();
    }
}
