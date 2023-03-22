import java.util.Scanner;
public class Ticket{
    public static void main(String[] args) {
        int km,yas,yolculuktip;
        double normaltutar,yasindirimorani,indirimlitutar,yasindirimi,tipIndirimi,sonTutar,perkm=0.10;
        Scanner input=new Scanner(System.in);
        System.out.println("mesafeyi giriniz:");
        km= input.nextInt();;
        System.out.println("yasinizi giriniz:");
        yas=input.nextInt();
        System.out.println("tek yon ise 1 cift yon ise 2 yi tuslayiniz:");
        yolculuktip= input.nextInt();

        normaltutar=km*perkm;
        if(((yas>0)&&(km>0))&&((yolculuktip==1)||(yolculuktip==2))){
            if(yas<12) {
                yasindirimorani=0.50;
                yasindirimi = normaltutar * yasindirimorani;
                indirimlitutar = normaltutar - yasindirimi;
                if (yolculuktip == 2) {
                    tipIndirimi = indirimlitutar * 0.20;
                    sonTutar = indirimlitutar - tipIndirimi;
                    System.out.println("odemeniz gereken tutar" + sonTutar*2);

                }else{
                    System.out.println("indirimden yararlanamadiniz bilet fiyatiniz" +indirimlitutar);
                }
            }else if(yas>12&&yas<24){
                yasindirimorani=0.10;
                yasindirimi=normaltutar*yasindirimorani;
                indirimlitutar=normaltutar-yasindirimi;
                if(yolculuktip==2){
                    tipIndirimi=indirimlitutar*0.20;
                    sonTutar=indirimlitutar-tipIndirimi;
                    System.out.println("bilet ucretiniz"+sonTutar*2);
                }else{
                    System.out.println("indirimden yararlanamadiniz bilet fiyatiniz"+indirimlitutar);
                }
            }else if(yas>65){
                yasindirimorani=0.30;
                yasindirimi=normaltutar*yasindirimorani;
                indirimlitutar=normaltutar-yasindirimi;
                if (yolculuktip==2){
                    tipIndirimi=indirimlitutar*0.20;
                    sonTutar=indirimlitutar-tipIndirimi;
                    System.out.println("bilet ucretiniz"+sonTutar*2);

                }else{
                    tipIndirimi=indirimlitutar*0.20;
                    sonTutar=indirimlitutar-tipIndirimi;
                    System.out.println("indirimden yararlanamadiniz bilet fiyatiniz"+indirimlitutar);
                }
            }else if(yas>0){
                System.out.println("indirimden yararlanamadiniz bilet fiyatiniz"+normaltutar);
            }



        }else{
            System.out.println("hatali giris");
        }



    }
}