import java.util.Scanner;

public class CircleAreaPractice {


    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        int r = input.nextInt();
        System.out.print("Açıyı giriniz: ");
        double aci = (double)input.nextInt();
        double daireDilimAlani = pi * (double)(r * r) * aci;
        System.out.print("Daire dilimin alanı  " + daireDilimAlani);
    }
}