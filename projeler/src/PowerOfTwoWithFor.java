import java.util.Scanner;
public class PowerOfTwoWithFor {
    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.println("enter a number:");
        n=inp.nextInt();
        for(int i=1;i<=n;i*=2){
            System.out.println(i);
        }


    }
}