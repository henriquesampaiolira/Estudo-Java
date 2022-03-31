import java.util.Scanner;
public class Questoes {
    public static void main(String[] args) {
        //A ideia desse programa seria receber perguntas e respostas, gerar um questionário com as perguntas recebidas
        //e contabilizar a pontuação de acordo com os acertos das respostas.
        Scanner scan = new Scanner(System.in);
        String[] perg=new String[3];
        String[] resp=new String[9];
        int[] resp_certa=new int[3];
        int[] resp_usuario=new int[3];
        int cont1=1,cont2=1,pontuacao=0,cont_resp=0;
        //as perguntas e respostas só recebem valores em string
        for(int i=0;i<perg.length;i++){
            System.out.printf("Digite a %d° pergunta das questões: ",i+1);
            perg[i]=scan.nextLine();
        }
        for(int i=0;i<resp.length;i++){
            int x=0;
            if(i<3){
                x=1;
                System.out.printf("Digite a %d° resposta da %d° pergunta: ",i+1,x);
                resp[i]=scan.nextLine();
            }
            if(i>2 && i<6){
                x=2;
                System.out.printf("Digite a %d° resposta da %d° pergunta: ",cont1,x);
                resp[i]=scan.nextLine();
                cont1++;
            }
            if(i>5){
                x=3;
                System.out.printf("Digite a %d° resposta da %d° pergunta: ",cont2,x);
                resp[i]=scan.nextLine();
                cont2++;
            }
        }
        //Até o momento, o código apenas recebe as perguntas e possíveis respostas.
        for(int i=0;i<resp_certa.length;i++){
            System.out.printf("Digite o número referente a resposta certa da %d pergunta. Ex: 1, 2 ou 3",i+1);
            resp_certa[i]=scan.nextInt();
        }
        System.out.print("Para responder as perguntas, digite 1, 2 ou 3 para relacionar à sua resposta.");
        System.out.printf(perg[0],"\n");
        System.out.printf(resp[0],"\n");
        System.out.printf(resp[1],"\n");
        System.out.printf(resp[2],"\n");
        System.out.print("Sua resposta é 1, 2 ou 3?");
        resp_usuario[0]=scan.nextInt();
        System.out.printf(perg[1],"\n");
        System.out.printf(resp[3],"\n");
        System.out.printf(resp[4],"\n");
        System.out.printf(resp[5],"\n");
        System.out.print("Sua resposta é 1, 2 ou 3?");
        resp_usuario[1]=scan.nextInt();
        System.out.printf(perg[2],"\n");
        System.out.printf(resp[6],"\n");
        System.out.printf(resp[7],"\n");
        System.out.printf(resp[8],"\n");
        System.out.print("Sua resposta é 1, 2 ou 3?");
        resp_usuario[2]=scan.nextInt();
        if(resp_usuario[0]==resp_certa[0]){
            pontuacao++;
        }
        if(resp_usuario[1]==resp_certa[1]){
            pontuacao++;
        }
        if(resp_usuario[2]==resp_certa[2]){
            pontuacao++;
        }
        System.out.printf("A pontuação foi de: %d",pontuacao);
        //Sistema funcional, porém falta algumas modificações para ficar mais completo.
    }
}