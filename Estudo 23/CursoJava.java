public class CursoJava {
    public static void main(String[] args) {
        
        int soma=0;

        if(args.length<=0){
            System.out.printf("%s%n","Sem valores.");
            return;
        }
        // a entrada dos dados seriam passados na compilação do programa
        // ex: java CursoJava.java 5 8 7 2 10
        for(String n:args){
            int v=Integer.valueOf(n);
            soma+=v;
        }
        System.out.printf("A soma dos valores é: %d%n",soma);

    }
}
