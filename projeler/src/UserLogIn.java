import java.util.Scanner;
public class UserLogIn {
    public static void main(String[] args) {
        int password;
        boolean isPasswordSuccess=false;
        Scanner input=new Scanner(System.in);
        while(!isPasswordSuccess){
            System.out.println("sifre giriniz:");
            password= input.nextInt();;
            if(password==123){
                System.out.println("dogru");
                isPasswordSuccess=true;
            }else{
                System.out.println("yanlis");
            }

        }



    }
}