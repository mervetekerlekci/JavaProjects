import java.util.Scanner;
public class PowerOfNumbersWithFor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;
        System.out.println("ussu alinacak sayiyi giriniz");
        n = input.nextInt();
        System.out.println("us olacak sayiyu giriniz:");
        k = input.nextInt();
        int total = 1;
        for (int i = 1; i <= k; i++) {
            total = total * n;
        }
        System.out.println("sonuc" + total);


    }
}