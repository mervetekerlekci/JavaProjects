import java.util.Scanner;
public class Kdv{
    public static void main(String[] args) {
        double tutar, kdvOran=0.18;
        Scanner input=new Scanner(System.in);
        System.out.print("ucret tutarini giriniz");
        tutar=input.nextDouble();
        double kdvTutar=tutar*kdvOran;
        //System.out.println(kdvTutar);
        double kdvToplam=tutar+kdvTutar;
        //System.out.println(kdvToplam);
        System.out.println("KDVsiz tutar"+tutar);
        System.out.println("KDV TUTARI"+kdvTutar);
        System.out.println( "KDV Toplam"+kdvToplam);


    }
}