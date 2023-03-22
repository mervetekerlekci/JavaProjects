import java.util.Scanner;
public class AvgExample{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k, sum = 0, counter = 0;
        System.out.println("sayi giriniz");
        k = inp.nextInt();
        for (int i = 0; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                counter++;
                System.out.println(i);

            }
        }
        System.out.println("sumofnumbers" + sum);
        System.out.println("average of numbers" + sum / counter);
    }
}