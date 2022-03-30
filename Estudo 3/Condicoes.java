public class Condicoes{
    public static void main(String[] args) {
        
        /*
        //Operação ternária
        int nota=80;
        int notaMin=70;
        String res;

        res=(nota>=notaMin ? "Aprovado" : "Reprovado");
        System.out.printf("Resultado:%s",res);

        */

        /*
        //Estrutura de condição "com if" e "else"
        int nota=80;
        int notaMin=70;
        int faltas=3;
        int maxFaltas=3;

        if((nota >= notaMin) && (faltas<=maxFaltas)){
            System.out.print("Aprovado!");
        }else if((nota < notaMin) && (nota >= 50) && (faltas<=maxFaltas)){
            System.out.print("Recuperação");
        }else{
            System.out.print("Reprovado com louvor!");
        }
        */

        //Estudo com Switch
        int pos=5;
        switch(pos){
            case 1:
                System.out.print("Já era esperado.");
                break;
            case 2:
                System.out.print("Não estávamos esperando por isso.");
                break;
            case 3:
                System.out.print("Gênio!");
                break;
            case 4: case 5: case 6:
                System.out.print("Você está muito avançado para nossa tecnologia.");
                break;
            default:
                System.out.print("Tente novamente ontem, contém ironia.");
                break;
        }


    }
}