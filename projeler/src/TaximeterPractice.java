import java.util.Scanner;

public class TaximeterPractice{


    public static void main(String[] args) {

        double perKm = 2.2;
        double startPrice = 10.0;
        Scanner input = new Scanner(System.in);
        System.out.print("KM i GİRİNİZ: ");
        int km = input.nextInt();
        double totalPrice = (double)km * perKm + startPrice;
        if (totalPrice < 20.0) {
            totalPrice = 20.0;
            System.out.print(20.0);
        } else {
            System.out.print(totalPrice);
        }

    }
}