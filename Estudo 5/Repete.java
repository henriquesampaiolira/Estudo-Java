import java.util.Scanner;

public class Repete{
    public static void main(String[] args){

        // "do while" é executado antes de verificar a condição
        int cont=0;
        do{
            System.out.println(cont);
            cont++;
        }while(cont<=1);


        /* While
        Scanner scan=new Scanner(System.in);
        int max=scan.nextInt();
        int cont=0;
        while(cont<max){
            cont++;
            System.out.println(cont);
        }
        
        */
        
        /* FOR
        for(int cont=1;cont<=5;cont++){
            System.out.println(cont);
        }
        */
    }
}