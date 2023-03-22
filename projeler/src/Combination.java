import java.util.Scanner;
public class Combination{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,r;
        int total=1;
        int product=1;
        //int sonuc;
        System.out.println("n sayisini giriniz");
        System.out.println("r sayisini giriniz:");
        n=input.nextInt();
        r=input.nextInt();
        for(int i=1;i<=n;i++){
            total=total*i;
        }
        System.out.println("n sayisinin faktoriyeli"+total);
        for(int i=1;i<=r;i++){
            product=product*i;
        }
        System.out.println("r sayisinin faktoriyeli"+product);
        int sonuc=n-r;
        int end=1;
        System.out.println("(n-r) islemini bulunuz"+sonuc);
        for(int i=1;i<=sonuc;i++){
            end=end*i;

        }
        System.out.println("sonucun faktoriyeli"+end);
        int komb=total/(product*end);
        System.out.println("kombinasyonun sonucu"+komb);






    }
}