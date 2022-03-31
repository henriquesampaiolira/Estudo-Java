public class Array{
    public static void main(String[] args) {
        
        //Formas de declaração de array
        int[] num=new int[5];
        int[] numeros={10,20,30};

        //Inserindo valores no array
        num[0]=70;
        num[1]=50;
        num[3]=30;

        //Impressão de todos os valores dentro do array com "for"
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        //System.out.printf("%d\n\n",numeros[2]);
        //System.out.printf("%d",num[3]);




    }
}