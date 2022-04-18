public class Aranha extends Animal {
    private int veneno;
    public Aranha(int massa,int vel,int forca,int veneno){
        super(massa, vel, forca);
        this.veneno=veneno;
    }
    //@Override para sobreescrever o método de atacar para esta classe
    @Override
    public void atacar(Animal a){
        if(this.getVivo()){
            System.out.printf("O animal da %s atacou o animal da %s%n",this.getClass(),a.getClass());
            if((this.getForca() + this.veneno) <= a.getForca()){
                this.setVivo(false);
                System.out.printf("O animal atacou e não resistiu.%n");
            }
            if((this.getForca() + this.veneno) > a.getForca()){
                this.setForca(getForca()+a.getForca());
                a.setVivo(false);
                System.out.printf("O animal atacou e matou.%n");
        }else{
            System.out.println("-----------------------------");
            System.out.println("O animal está morto, não pode atacar.");
            System.out.println("-----------------------------");
        }
        }
    }
}

