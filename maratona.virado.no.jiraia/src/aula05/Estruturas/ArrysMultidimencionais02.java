package aula05.Estruturas;

public class ArrysMultidimencionais02 {
    public static void main(String[] args) {
        int [][] nomes =new int[3][];
//        nomes [0] = new int[]{1,2,3};
//        nomes [1] = new int[]{1,2,3};
//        nomes [2] = new int[]{1,1,2};

//        for (int i = 0; i < nomes.length; i++) {
//            System.out.println(" ");
//            for (int j = 0; j < nomes[i].length; j++) {
//                System.out.print(nomes[i][j] + " ");
//            }
           String[] [] nome = new String[] [] {{"    3"},{"  4 5"},{"7 8 9"}};
           for (String[] arrayBase : nome){

               System.out.println(" ");
               for (String num : arrayBase){
                   System.out.print(num + " ");
               }
           }


    }
}
