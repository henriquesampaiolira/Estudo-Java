public class estudo{
    public static void main(String[] args) {

        int n=0;

        System.out.printf("%nAlerta:%s%n",Jogador.alerta ? "sim" : "não");

        Jogador.pontos();
        Jogador.pontos();

        Jogador j1 = new Jogador(++n);
        Jogador j2 = new Jogador(++n);
        Jogador j3 = new Jogador(++n);

        j1.info();
        j2.info();
        j3.info();
    }
}