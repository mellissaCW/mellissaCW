package Melisa;

import java.util.Scanner;

public class Methods_Return_NoParametr {
    public static void main(String[] args) {
        // 4. return / parametre yok
        // Kullanıcıdan alınan 2 sayının çarpımını bize dönduren methodu



        int crp = sayilariCarp();
        System.out.println(crp);
        menu();


    }

    public static int  sayilariCarp() {
        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayi gir : ");
        int sayi01 = scan.nextInt();
        int sayi02 = scan.nextInt();

        int carpim = sayi01*sayi02;
        return  carpim;
    }

    public static void menu() {
        System.out.println("Hoşgeldiniz");
        System.out.println("para yatırmak için 1 e basın");
        System.out.println("para cekmek için 2 ye basın");
        System.out.println("cıkmak için 3 e basın");
        sayilariCarp();
    }





}
