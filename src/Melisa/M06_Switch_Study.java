package Melisa;

import java.util.Scanner;

public class M06_Switch_Study {
    public static void main(String[] args) {

        // switch statement da " long , double , float ve boolean " kullanılmaz !!!

        /*
           soru 1) kullanıcıya haftanın kaçıncı günü oldugunu sorun ve gun ismini yazdırın
           soru 2) Kullanıcıdan bir sayı girmesini isteyin.
                   girilen sayı
                   10 ise " iki basamakli en kucuk sayi "
                   100 ise " uc basamakli en kucuk sayi "
                   1000 ise " dort basamakli en kucuk sayi "
                   diğer durumlarda " girdiğin sayıyı degiştir " yazdırın
           soru 3) kullanıcıdan SDET kısaltmasındaki harflerden birini yazmasını isteyin.
                   kullanıcı ;
                   S girerse " SOFTWARE "
                   D girerse " DEVELOPER "
                   E girerse " ENGINEER "
                   T girerse " TESTING " yazdırın.
           soru 4) kullanıcıdan gün ismi alıp , hafta içi veya haftasonu oldugunu yazdıralım.
           soru 5) Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..
                   345 --> ucyuzkırkbes

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı girinz : ");
        int sayi = scan.nextInt();

        int yuzler = sayi/100;
        int onlar = (sayi%100)/10;
        int birler = sayi%10;

        switch (yuzler) {
            case 0 : break;
            case 1 :
                System.out.print("YÜZ"); break;
            case 2 :
                System.out.print("İKİYÜZ"); break;
            case 3 :
                System.out.print("UCTÜZ"); break;
            case 4 :
                System.out.print("DÖRTYÜZ"); break;
            case 5 :
                System.out.print("BESYÜZ"); break;
            case 6 :
                System.out.print("ALTIYÜZ"); break;
            case 7 :
                System.out.print("YEDİYÜZ"); break;
            case 8 :
                System.out.print("SEKİZYÜZ"); break;
            case 9 :
                System.out.print("DOKUZYUZ"); break;
            default :
                System.out.print(" hatalı sayi girişi ,");
        }

        switch (onlar) {
            case 0 : break;
            case 1 :
                System.out.print("ON"); break;
            case 2 :
                System.out.print("YİRMİ"); break;
            case 3 :
                System.out.print("OTUZ"); break;
            case 4 :
                System.out.print("KIRK"); break;
            case 5 :
                System.out.print("ELLİ"); break;
            case 6 :
                System.out.print("ALTMIŞ"); break;
            case 7 :
                System.out.print("YETMİŞ"); break;
            case 8 :
                System.out.print("SEKSEN"); break;
            case 9 :
                System.out.print("DOKSAN"); break;
            default :
                System.out.print(" hatalı sayi girişi ,");
        }

        switch (birler) {
            case 0 : break;
            case 1 :
                System.out.print("BİR"); break;
            case 2 :
                System.out.print("İKİ"); break;
            case 3 :
                System.out.print("ÜÇ"); break;
            case 4 :
                System.out.print("DÖRT"); break;
            case 5 :
                System.out.print("BEŞ"); break;
            case 6 :
                System.out.print("ALTI"); break;
            case 7 :
                System.out.print("YEDİ"); break;
            case 8 :
                System.out.print("SEKİZ"); break;
            case 9 :
                System.out.print("DOKUZ"); break;
            default :
                System.out.print(" hatalı sayi girişi ,");
        }

    }
}
