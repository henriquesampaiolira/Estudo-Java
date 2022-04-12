import java.util.Scanner;

public class Calc{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Numeros n1 = new Numeros();
        Numeros n2 = new Numeros();
        Numeros res = new Numeros();
        String opc="S";

        while(opc.equals("s") || opc.equals("S")){
        System.out.printf("%nDigite um valor:");
        n1.setValor(scan.nextInt());
        System.out.printf("%nDigite outro valor:");
        n2.setValor(scan.nextInt());
        res.setValor(n1.getValor() + n2.getValor());
        System.out.printf("%nO resultado é: %d",res.getValor());
        System.out.printf("%nDigite 's' para continuar fazendo mais somas:");
        opc=scan.next();
        }
    }
}