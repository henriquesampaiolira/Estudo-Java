import javax.print.event.PrintEvent;

public class metodos{
    public static void main(String[] args) {
        msg("Tururu");
        System.out.printf("%d",soma(5,10));
        System.out.printf("%n%d",soma2(10,20,12,3,5));
        System.out.printf("%n%.2f",soma2(11.2,15.5,5.8,20.7));
    }
    //método com o mesmo nome do de soma para números inteiros, o que vai definir qual será usado vai ser o tipo
    //de dado que vai ser passado ao chamar a função
    public static Double soma2(Double... n){
        Double res=0.0;
        for(Double num:n){
            res+=num;
        }
        return res;
    }
    //método que retorna qualquer quantidade de números passados
    public static int soma2(int... n){
        int res=0;
        for(int num:n){
            res+=num;
        }
        return res;
    }
    //o parâmetro só existe dentro do método. método para somar dois números
    public static int soma(int x,int y){
        int res=x+y;
        return res;
    }
    //método para imprimir uma frase
    public static void msg(String x){
        String y=x;
        System.out.printf(y);
        System.out.printf("%n");
    }
}