package P04_JavaOperatorsAndMathClass.ArithmeticOperators.TASKS;

import java.util.Scanner;

public class Task08 {
    /* Task->
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye

     */

    public static void main(String[] args) {

        // Cözüm için kullanicidan saat dakika ve saniye cınsınden tum vakti ayrı ayrı almamız gerekir.
        // önce aldıgımız saati saniyeye ceviririz.
        // sonra aldıgımız dakikayı sanıyeye ceviririz.
        // en son girilen sanıye için işlem yapmaya gerek yoktur. (Sonucu saniye cinsinden istediği için)
        // Sonra tum cevirdiğimiz saniyeleri toplarız ve toplam sanıyeyi buluruz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Saniyeye çevrilmesini istediğiniz saati giriniz : ");
        int saat = scan.nextInt();
        System.out.print("Saniyeye çevrilmesini istediğiniz dakikayı giriniz : ");
        int dakika = scan.nextInt();
        System.out.print("Saniyeye çevrilmesini istediğiniz saniyeyi giriniz : ");
        int saniye = scan.nextInt();

        // verilen saati saniyeye cevirdim (1 saat = 3600 saniye)
        int saatCevirme    = saat*3600;
        // verilen dakikayı saniyeye cevirdim (1 dakika = 60 saniye)
        int dakikaCevirme  = dakika*60;
        // En son toplam saniye toplanıp bir değişkene atılır
        int toplamSaniye   = saatCevirme + dakikaCevirme + saniye ;

        // sonucu yazdırma (1 saat 10 dakika 50 saniye --> 4250 saniyedir.)
        System.out.println(saat + " saat " + dakika + " dakika " + saniye + " saniye -->  " + toplamSaniye + " saniyedir.");






    }

}
