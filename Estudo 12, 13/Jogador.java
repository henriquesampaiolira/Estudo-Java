public class Jogador {
    private final int MAXVIDAS=3;
    private int x=0;
    private int vidas=0;
    static boolean alerta=false;
    static int qtdJogadores=0;
    static int pontosGlobais=0;

    public Jogador(int n){
        this.x=n;
        this.vidas=1;
        System.out.printf("%nJogador %d criado%n",n);
        qtdJogadores++;
    }
    public int getVidas(){
        return this.vidas;
    }
    public void addVidas(){
        if(vidas < this.MAXVIDAS){
            this.vidas+=1;
        }
    }
    static void pontos(){
        pontosGlobais+=10;
    }
    public void info(){
        System.out.printf("%nJogador:%d",this.x);
        System.out.printf("%nVidas:%d",this.vidas);
        System.out.printf("%nAlerta:%s",alerta ? "Sim" : "Não");
        System.out.printf("%nJogadores:%d%n",qtdJogadores);
        System.out.printf("%nPontos Iniciais:%d%n",pontosGlobais);
        System.out.printf("------------------------------------");
    }
}