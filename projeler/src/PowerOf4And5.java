import java.util.Scanner;
public class PowerOf4And5 {
    public static void main(String[] args) {
        int n;
        System.out.println("enter a number:");
        Scanner inp= new Scanner(System.in);
        n=inp.nextInt();
        System.out.println("4 un kuvvetleri");
        for(int i=1;i<=n;i*=4){
            System.out.println(i);

        }System.out.println("5 in kuvvetleri");

        for(int i=1;i<=n;i*=5){
            System.out.println(i);
        }


    }
}