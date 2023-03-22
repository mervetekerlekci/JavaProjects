import java.util.Scanner;
public class UserLogInPractice {
    public static void main(String[] args) {
        String userName,password,answer,newPassword;
        Scanner inp=new Scanner(System.in);
        System.out.println("Kullanici adini giriniz:");
        userName=inp.nextLine();
        //answer=inp.nextLine();
        System.out.println("Sifrenizi giriniz:");
        password=inp.nextLine();

        if (userName.equals("patika")&& password.equals("java123")){
            System.out.println("Giris yaptiniz:");
        }else{
            System.out.println("Hatali giris yaptiniz sifre sifirlamak istermisiniz?:");
            answer=inp.nextLine();
            if(answer.equals("yes")){
                System.out.println("yeni sifrenizi giriniz:");
                newPassword=inp.nextLine();
                if(newPassword.equals("java123")){
                    System.out.println("sisfreniz eski sifreyle ayni islem basarisiz");
                }else{
                    System.out.println("sifreniz degistirildi");
                }

            }else{
                System.out.println("giris yapamadiniz");
            }
        }




    }
}