import java.security.SecureRandom;

public class CursoJava {
    public static void main(String[] args) {
        final int LINHAS = 3;
        final int COL    = 5;
        int lista[][]    = new int[LINHAS][COL];

        
        impDados(lista, LINHAS, COL);
        geraDados(lista, LINHAS, COL);
    }
    public static void impDados(int[][] mtz,int lin,int coluns){
        for(int l=0;l<lin;l++){
            for(int c=0;c<coluns;c++){
                System.out.printf("%d - ",mtz[l][c]);
            }
            System.out.printf("%n");
        }
    }
    public static void geraDados(int[][] mtz,int lin,int coluns){
        for(int l=0;l<lin;l++){
            for(int c=0;c<coluns;c++){
                mtz[l][c]=new SecureRandom().nextInt(100);
            }
        }
    }
}
