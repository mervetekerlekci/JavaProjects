import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args){
        int i=1,n;
        Scanner inp=new Scanner(System.in);
        System.out.println("enter a number");
        n= inp.nextInt();
        while(i<=n){
            System.out.println(i);
            i*=2;
        }
    }
}