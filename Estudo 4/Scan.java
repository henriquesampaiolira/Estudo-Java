import java.util.Scanner;

public class Scan{
    public static void main(String[] args) {

        Scanner scand = new Scanner(System.in);

        String nomeAluno="",res="";
        int nota1=0,nota2=0,notaFinal=0;
        final int MEDIA=7;

        System.out.println("Digite o nome do aluno: ");
        nomeAluno=scand.nextLine();
        System.out.println("Digite a primeira nota:");
        nota1=scand.nextInt();
        System.out.println("Digite a segunda nota: ");
        nota2=scand.nextInt();
        notaFinal=(nota1+nota2)/2;
        if(notaFinal>=MEDIA){
            res="Aprovado!";
        }else{ 
            res="Reprovado!";
        }

        System.out.printf("O aluno %s obteve uma nota final de %d, sendo que a media eh %d.\n Logo, ele foi: %s",nomeAluno,notaFinal,MEDIA,res);
    
    }
}