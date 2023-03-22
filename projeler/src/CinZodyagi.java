import java.util.Scanner;

public class CinZodyagi {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dogum yilinizi giriniz:");
        int dogumyili = input.nextInt();
        if (dogumyili % 12 == 0) {
            System.out.println("Maymun");
        } else if (dogumyili % 12 == 1) {
            System.out.println("HOROZ");
        } else if (dogumyili % 12 == 2) {
            System.out.println("KOPEK");
        } else if (dogumyili % 12 == 3) {
            System.out.println("DOMUZ");
        } else if (dogumyili % 12 == 4) {
            System.out.println("FARE");
        } else if (dogumyili % 12 == 5) {
            System.out.println("OKUZ");
        } else if (dogumyili % 12 == 6) {
            System.out.println("KAPLAN");
        } else if (dogumyili % 12 == 7) {
            System.out.println("TAVSAN");
        } else if (dogumyili % 12 == 8) {
            System.out.println("EJDERHA");
        } else if (dogumyili % 12 == 9) {
            System.out.println("YILAN");
        } else if (dogumyili % 12 == 10) {
            System.out.println("AT");
        } else if (dogumyili % 12 == 11) {
            System.out.println("KOYUN");
        }

    }
}
