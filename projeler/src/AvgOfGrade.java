import java.util.Scanner;
public class AvgOfGrade {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik,toplamNot=0;

        Scanner inp=new Scanner(System.in);
        System.out.println("matematik notunuz;");

        mat=inp.nextInt();



        System.out.println("Turkce notunuz:");
        turkce=inp.nextInt();

        System.out.println("kimya notunuz:");
        kimya=inp.nextInt();





        System.out.println("muzik notunuz:");
        muzik=inp.nextInt();

        System.out.println("fizik notunuz:");
        fizik=inp.nextInt();
        if(mat>=0 && mat<=100) {
            toplamNot += mat;
        }




        if (kimya >= 0 && kimya <= 100) {

            toplamNot += muzik;
        }
        if (muzik >= 0 && muzik <= 100) {

            toplamNot += muzik;
        }
        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
        }
        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
        }
















        double average=toplamNot/5;
        if(average<=55){
            System.out.println("sinifta kaldiniz");



        }else{
            System.out.println("sinifi gectiniz!!");






        }
        System.out.println("ortalamaniz"+average);





    }
}