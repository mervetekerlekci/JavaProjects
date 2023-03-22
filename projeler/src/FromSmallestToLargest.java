import java.util.Scanner;
public class FromSmallestToLargest{
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("sayi 1:");
        a=input.nextInt();

        System.out.println("sayi 2:");
        b=input.nextInt();

        System.out.println("sayi 3:");
        c=input.nextInt();

        if((a<b)&&(a<c)){
            if(b<c){
                System.out.println("a<b<C");
            }else{
                System.out.println("a<c<b");

            }
        }else if((b<a)&&(b<c)){
            if(a<c){
                System.out.println("b<a<c");
            }else{
                System.out.println("b<c<A");
            }
        }else{
            if(a<b){
                System.out.println("c<A<b");
            }else{
                System.out.println("c<B<A");
            }
        }


    }
}