package Melisa;

import java.util.Scanner;

public class While_loops {
    public static void main(String[] args) {
        // Task 01 ) 1 den 10 a kadar çift sayıları yazdır
        // Task 02 ) 1 den n e kadar olan çift sayıların toplamını yazdırınız
        // Task 03 ) Girilen sayıya kadar olan 2 nin kuvvetlerini yazdır
        // Task 04 ) Negatif bir değer girilene kadar kullanıcıdan alınan girişlerin toplamını yazdırın
        // Task 05 ) Verilen bir sayının faktoriyelini hesaplayınız

        Scanner scan = new Scanner(System.in);

        int toplam = 0;
        int sayi = 0;


        while (sayi >= 0) {
            System.out.println("sayi giriniz :");
            toplam += sayi;
            sayi = scan.nextInt();

        }
        System.out.println(toplam);



        do {
            toplam += sayi;
            sayi = scan.nextInt();

        } while(sayi>= 0);
        System.out.println(toplam);
    }
}
