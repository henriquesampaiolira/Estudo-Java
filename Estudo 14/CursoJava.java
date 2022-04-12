public class CursoJava{
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Holando");
        CarroCombate c2 = new CarroCombate("Irineide", 70);
        CarroCombate c3 = new CarroCombate("Irinelson", 0);

        c1.setLigado(true);
        c2.setLigado(true);
        c3.setLigado(true);
        c3.atirar();
        c3.atirar();
        c3.atirar();
        //c3.sofrerDano(5);
        //c3.sofrerDano(7);


        c1.info();
        c2.info();
        c3.info();



    }
}