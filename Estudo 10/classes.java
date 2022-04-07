public class classes{
    public static void main(String[] args) {

        int n=0;
        
        //instanciando novo objeto de uma classe e usando pré incremento
        Jogador j1 = new Jogador(++n);
        Jogador j2 = new Jogador(++n);
        Jogador j3 = new Jogador(++n);

        //é observado que dependendo de se a variável foi criada com public ou private não dá para acessar ela
        System.out.println(j1.num);
        System.out.println(j1.num2);

        //utilizando incremento
        n=0;
        Jogador j4 = new Jogador(n++);
        Jogador j5 = new Jogador(n++);
        Jogador j6 = new Jogador(n++);
    }
}