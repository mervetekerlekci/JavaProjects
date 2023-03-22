import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        double pi=3.14,alan,cevre;
        System.out.print("dairenin yaricapini giriniz:");
        Scanner inp=new Scanner(System.in);
        int r = inp.nextInt();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.print("dairenin alani:"+alan);
        System.out.print("dairenin cevresi:"+cevre);


    }
}