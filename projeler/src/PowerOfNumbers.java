import java.util.Scanner;
public class PowerOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;
        System.out.println("ussu alinacak sayiyi giriniz:");
        n = input.nextInt();
        System.out.println("us olacak sayiyi giriniz:");
        k = input.nextInt();
        int total = 1, i = 1;
        while (i <= k) {
            total *= n;
            i++;
        }
        System.out.println("cevap" + total);

    }
}