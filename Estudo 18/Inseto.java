public class Inseto {
    private Boolean vivo;
    private int     massa;
    public Inseto(int massa){
        this.massa=massa;
    }
    public int getMassa(){
        return this.massa;
    }
    public Boolean getVivo(){
        return this.vivo;
    }
    public void setVivo(Boolean vivo){
        this.vivo=vivo;
    }
    public void info(){
        System.out.printf("Tipo....:%s%n",getClass().toString());
        System.out.printf("Vivo....:%s%n",this.vivo);
        System.out.printf("Massa...:%s%n",this.getMassa());
        System.out.printf("---------------------------------");
    };
}
