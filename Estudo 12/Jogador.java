public class Jogador {
    private final int MAXVIDAS=3;
    private int n=0;
    private int vidas=0;
    public Jogador(int n){
        this.n=n;
        this.vidas=1;
        System.out.printf("%nJogador %d criado%n",n);
    }
    public int getVidas(){
        return this.vidas;
    }
    public void addVidas(){
        if(vidas < this.MAXVIDAS){
            this.vidas+=1;
        }
    }
}