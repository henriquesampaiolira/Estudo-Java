abstract class Animal implements SerVivo {
    //classe abstract não pode ser instanciada, apenas herdada
    private Boolean vivo;
    private int     massa;
    private int     x;
    private int     y;
    private int     vel;
    private int     forca;

    public Animal(int massa,int vel,int forca){
        this.vivo=true;
        this.massa=massa;
        this.x=0;
        this.y=0;
        this.massa=massa;
        this.vel=vel;
        this.forca=forca;
    }

    public void setVivo(Boolean vivo){
        this.vivo=vivo;
    }
    public Boolean getVivo(){
        return this.vivo;
    }
    public void setForca(int forca){
        this.forca=forca;
    }
    public int getForca(){
        return this.forca;
    }
    public void setMassa(int massa){
        this.massa=massa;
    }
    public int getMassa(){
        return this.massa;
    }
    public int getVel(){
        return this.vel;
    }
    public void mover(){
        if(this.vivo){
            this.x+=this.vel;
            this.y+=this.vel;
        }else{
            System.out.println("-----------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode se mover.");
            System.out.println("-----------------------------");
        }
    };
    public void atacar(Animal a){
        if(this.vivo){
            System.out.printf("O animal da %s atacou o animal da %s%n",this.getClass(),a.getClass());
            if(this.forca > a.getForca()){
                this.forca+=a.getMassa();
                a.setVivo(false);
                System.out.printf("O animal atacou e matou.%n");
            }else{
                this.vivo=false;
                System.out.printf("O animal atacou e não resistiu.%n");
            }
        }else{
            System.out.println("-----------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode atacar.");
            System.out.println("-----------------------------");
        }
    }
    public void comer(int coisa){
        if(this.vivo){
            this.forca+=coisa;
        }else{
            System.out.println("-----------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode comer.");
            System.out.println("-----------------------------");
        }
    };
    public void info(){
        System.out.printf("%nTipo....:%s%n",getClass().toString());
        System.out.printf("Vivo....:%s%n",this.getVivo());
        System.out.printf("Massa...:%s%n",this.getMassa());
        System.out.printf("Força...:%s%n",this.getForca());
        System.out.printf("Vel.....:%s%n",this.getVel());
        System.out.printf("---------------------------------%n");
    };

}
