import java.util.Scanner;
public class Weather{
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.print("sicaklik giriniz");
        heat=input.nextInt();
        if(heat<5){
            System.out.println("kayak yapabilir");


        }else if(heat >=10 && heat<=25) {

            System.out.println("piknige gidebilir");

        }if (heat>=5 && heat<=15){
            System.out.println("sinemaya gidebilir");

        }else{
            System.out.println("yuzmeye gidebilir");
        }

    }
}