import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {
        double elma = 3.67;
        double armut = 2.14;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Elma kaç kilo ? ");
        double miktar = input.nextDouble();
        double elmaTutari = miktar * elma;
        System.out.print("Armut kaç kilo ? ");
        miktar = input.nextDouble();
        double armutTutari = miktar * armut;
        System.out.print("Domates kaç kilo ? ");
        miktar = input.nextDouble();
        double domatesTutari = miktar * domates;
        System.out.print("Muz kaç kilo ? ");
        miktar = input.nextDouble();
        double muzTutari = miktar * muz;
        System.out.print("Patlıcan kaç kilo ? ");
        miktar = input.nextDouble();
        double patlicanTutari = miktar * patlican;
        double toplamFiyat = elmaTutari + armutTutari + muzTutari + domatesTutari + patlicanTutari;
        System.out.print("Toplam borcunuz : " + toplamFiyat);
    }
}