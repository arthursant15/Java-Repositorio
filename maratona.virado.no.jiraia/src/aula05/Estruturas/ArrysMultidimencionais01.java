package aula05.Estruturas;

public class ArrysMultidimencionais01 {
    public static void main(String[] args) {
        //Matriz
        int [][] data = new int [3][3];
        data[0][0]=10 ;
        data[0][1] =20 ;
        data[0][2] =30 ;
        data[1][0] =40 ;
        data[1][1] =50 ;
        data[1][2] =60 ;
        data[2][0] =70 ;
        data[2][1] =80 ;
        data[2][2] =90 ;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]);
            }

        }

    }
}
