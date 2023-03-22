import java.util.Scanner;
public class EvenNumbers{
    public static void main(String[] args) {
        int k,i=1;
        Scanner inp=new Scanner(System.in);
        System.out.println("sayi giriniz;");
        k=inp.nextInt();
        while(i<=k){
            i++;
            if(i%2==0){
                System.out.println(i+"girilen sayi cift sayidir");
            }

        }
        k=inp.nextInt();
        /*for(int i=1;i<=k;i++){
            if(i%2==0)
            System.out.println(i+ "cift sayidir");
        }*/

    }
}