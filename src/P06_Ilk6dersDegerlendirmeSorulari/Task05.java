package P06_Ilk6dersDegerlendirmeSorulari;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /*
        "Bir web sitesi alışveriş sepet toplamı 500TL den fazla olan siparişler için kargo bedeli almıyor ,
        500 tl nin altı için 50 Tl kargo bedeli alıyor ama  alış veriş 450-500 arası ise 500 e tamamlanıyor
        Alış veriş bedeli girildiğinde, kargo dahil toplam ödenecek tutarı ekrana yazdıran proğram"
        Önnek input : 540 , output 540
        input 480 , output 500
        input 420 , output 470
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Alışveriş miktarınızı giriniz : ");
        double miktar = scan.nextDouble();

        if (miktar>=500){
            System.out.println("Kargonuz ucretsiz\nOdenecek mktar :  "+miktar);
        } else if (miktar>=450 & miktar<500) {
            System.out.println("Kargo ucretiniz : "+ (500-miktar)+"\nödenecek miktar : 500" );
        } else if (miktar>0 & miktar<450){
            System.out.println("kargo ucretiniz : 50\nÖdenecek miktar : "+ (miktar+50));
        }


    }
}
