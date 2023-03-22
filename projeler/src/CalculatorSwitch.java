import java.util.Scanner;
public class CalculatorSwitch{
    public static void main(String[] args) {
        int n1,n2 ,select=3;
        Scanner input=new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz:");
        n1=input.nextInt();
        System.out.println("ikinci sayiyi giriniz:");
        n2=input.nextInt();


        ;        switch(select){
            case 1:
                System.out.println("islem toplama islemi"+(n1+n2));
                break;
            case 2:
                System.out.println("islem cikarma islemi"+(n1-n2));
                break;
            case 3:
                if(n2!=0) {
                    System.out.println("islem bolme islemi" + (n1 / n2));
                }else{
                    System.out.println("sayi sifira bolunmez:");
                }
                break;
            case 4:
                System.out.println("islem carpma islemi"+(n1*n2));
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
        }

    }
}