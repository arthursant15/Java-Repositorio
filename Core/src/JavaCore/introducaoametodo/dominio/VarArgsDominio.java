package JavaCore.introducaoametodo.dominio;


public class VarArgsDominio {
    public void somarVarArgs(int...numeros){
        int soma= 0;
        for (int num: numeros ){
            soma+=num;
        }
            System.out.println("A soma total é: " + soma);
    }
}
