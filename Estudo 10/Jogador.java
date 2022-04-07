public class Jogador {

    //private só pode ser utilizado dentro da classe, já o public pode ser acessado por fora da classe
    public int num2=5;
    private int n=0;

    public Jogador(int n){
        //ao utilizar o "this", ele refere a variável ao que foi criado pela classe anteriormente
        this.n=n;
        System.out.printf("%nJogador %d criado%n",n);
    }

}
