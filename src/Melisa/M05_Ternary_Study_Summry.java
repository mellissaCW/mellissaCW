package Melisa;

import java.util.Scanner;

public class M05_Ternary_Study_Summry {
    public static void main(String[] args) {

        // Ternary -->  (condition) ? True : False ;
        // Ekranda ne görürüz ?

        Scanner scan = new Scanner(System.in);

        // Soru1) x = 11 olsun
        int x = scan.nextInt();
        String sonuc01 = x<5 ? "kucuk" : "değil";
        System.out.println("sonuc01 = " + sonuc01); // degil

        // Soru2) deger = false olsun
        boolean deger = scan.nextBoolean();
        String sonuc02 = !deger ? "Ahanda dogru" : "Ahhanda yanlış" ;
        System.out.println("sonuc02 : " + sonuc02); // ahanda dogru


        // Soru3) y = 2  olsun
        int y = scan.nextInt();
        int sonuc03 = (y>5) ? ( y>10 ? 2*y : 3*y ):( y>10 ? 2+y : 3+y );
        // sart ? (sart ? () : ();) : () ;
        System.out.println(" sonuc03 "+ sonuc03); // 5

        // Soru4) z = 12 olsun
        int z = scan.nextInt();
        int sonuc04 = (z>5) ? (z<10 ? 2*z : 3*z) : (z>10 ? 2+z : 3+z);
        System.out.println(" sonuc04 "+ sonuc04); // 36

        // Soru5) t = 5 olsun
        int t = scan.nextInt();
        int sonuc05 = (t>5) ? (t<10 ? 2*t : 3*t) : (t>10 ? 2+t : 3+t);
        System.out.println(" sonuc05 "+ sonuc05); // 8

        // Soru6) B A S İ C --> Kullanıcıdan dikdörtgenin uzunlugunu ve genişliğini alıp,
        // girilen degerlere göre dikdörtgenin kare olup olmadıgını yazdırın
        // sart ? () : () ;

        // Soru7) N E S T E D --> TASK 20 yapalım.


    }
}
