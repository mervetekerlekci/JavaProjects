import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz");
        n1 = input.nextInt();
        System.out.print("ikinci sayiyi giriniz");
        n2 = input.nextInt();
        // System.out.println(n1+ "-"+n2);
        System.out.println("1-toplama\n2-cikarma\n3-carpma\n4-bolme");
        System.out.println("seciminiz:");
        select = input.nextInt();
        //System.out.println(select);
        if (select == 1) {
            System.out.println("Toplam:" + (n1 + n2));
        } else if (select == 2) {
            System.out.println("cikarma:" + (n1 - n2));

        } else if (select == 3) {
            System.out.println("carpma:" + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println("bolme:" + (n1 / n2));
            } else {
                System.out.println("bir sayi sifira bolunemez");
            }
        }else{
            System.out.println("yanlis secim yaptiniz ");
        }
    }
}




