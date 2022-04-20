public class CursoJava {
    public static void main(String[] args) {
        /*String nome = "Henrique";
        //método "toCharArray" converte o tipo String para char
        for(char c:nome.toCharArray()){
            System.out.printf("%c", c);
        }*/
        //passando um array como parâmetro de uma função
        int[] numeros = {5,19,222,549,30,2,10,985,23};
        parImpar(numeros);
    }
        //função que vai receber o parâmetro array
    public static void parImpar(int[] num){
        String res;
        for(int n:num){
            if(n%2==0){
                res="Par";
            }else{
                res="Impar";
            }
            System.out.printf("%d:%s",n,res);
        }
    }
}

