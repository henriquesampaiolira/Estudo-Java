import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        Scanner     scan =  new Scanner(System.in);
        String[]    perg =  {"Em que ano estamos?","Que dia é hoje?","1+1?"};
        String[]    resp =  {"2020","2021","2022","18","Domingo","Segunda","1","2","3"};
        String[]    opc  =  {"a","b","c"};
        String[]    esc  =  new String[3];
        String[]    cert = {"c","c","b"};
        int         res  = 0;
        int         op;
        for(int i=0;i<perg.length;i++){
            op=0;
            if(i==0){
                System.out.printf("%n%n%s%n",perg[i]);
                for(int c=0;c<3;c++){
                    System.out.printf("%s) %s  ",opc[op],resp[c]);
                    op++;
                }
                esc[i]=scan.next();
            }
            if(i==1){
                System.out.printf("%n%n%s%n",perg[i]);
                for(int c=3;c<6;c++){
                    System.out.printf("%s) %s  ",opc[op],resp[c]);
                    op++;
                }
                esc[i]=scan.next();
            }
            if(i==2){
                System.out.printf("%n%n%s%n",perg[i]);
                for(int c=6;c<9;c++){
                    System.out.printf("%s) %s  ",opc[op],resp[c]);
                    op++;
                }
                esc[i]=scan.next();
            }
        }
        for(int i=0;i<esc.length;i++){
            if(esc[i].equals(cert[i])){
                res+=1;
            }
        }
        System.out.printf("%nSua pontuação foi de: %d",res);c
    }   
}