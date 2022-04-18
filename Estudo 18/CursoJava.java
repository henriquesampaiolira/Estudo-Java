public class CursoJava {
    public static void main(String[] args) {

        //Classe Animal não pode ser instanciada
        //Animal n1 = new Animal();
        Sapo    animal1 = new Sapo(10, 10, 10);
        Aranha  animal2 = new Aranha(5, 5, 5, 3);
        Formiga animal3 = new Formiga(2, 2, 2);
        Inseto  comida1  = new Inseto(1);
        Inseto  comida2  = new Inseto(5);
        Inseto  comida3  = new Inseto(10);
        animal1.info();
        animal2.info();
        animal3.info();
        System.out.printf("%nO animal da %s está %s%n",animal3.getClass(),animal3.getVivo() ? "vivo." : "morto.");
        System.out.printf("O animal da %s está %s%n",animal2.getClass(),animal2.getVivo() ? "vivo." : "morto.");
        animal2.atacar(animal3);
        System.out.printf("O animal da %s está %s%n",animal3.getClass(),animal3.getVivo() ? "vivo." : "morto.");
        System.out.printf("O animal da %s está %s%n",animal2.getClass(),animal2.getVivo() ? "vivo." : "morto.");
        animal1.comer(comida1.getMassa());
        animal1.info();
    }
}
