public class CursoJava {
    public static void main(String[] args) {
        final int numCarros=5;
        Carro[] carros=new Carro[numCarros];
        String[] nomes={"Camaro","Alelo","Foicinho","321","TRap"};

        for(int i=0;i<numCarros;i++){
            carros[i]=new Carro(nomes[i]);
        }
        for(Carro c:carros){
            c.info();
        }
    }
}
