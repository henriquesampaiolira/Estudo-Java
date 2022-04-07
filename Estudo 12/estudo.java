public class estudo{
    public static void main(String[] args) {

        int n=0;
        Jogador j1 = new Jogador(n++);
        Jogador j2 = new Jogador(n++);
        Jogador j3 = new Jogador(n++);

        j1.addVidas();

        System.out.printf("O número de vidas do Jogador 1 é : %d%n",j1.getVidas());
        System.out.printf("O número de vidas do Jogador 1 é : %d%n",j2.getVidas());
        System.out.printf("O número de vidas do Jogador 1 é : %d",j3.getVidas());

    }
}