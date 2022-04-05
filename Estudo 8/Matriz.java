import java.security.SecureRandom;

public class Matriz{
    public static void main(String[] args) {
        
        //quantidade de linhas e colunas como constante
        final int LIN=5, COL=4;
        int[][] numeros= new int[LIN][COL];

        /*

        Diferentes formas de imprimir uma matriz
        for(int l=0;l<LIN;l++){
            for(int c=0;c<COL;c++){
                numeros[l][c]=new SecureRandom().nextInt(99);
                System.out.printf(" %3d |",numeros[l][c]);
            }
            System.out.printf("%n");
        }
        
        -------------------------------------------------------
        for(int[] num:numeros){
            for(int num2:num){
                num2=new SecureRandom().nextInt(99);
                System.out.printf(" %2d |",num2);
            }
            System.out.printf("%n");
        }
        
        */

    }
}