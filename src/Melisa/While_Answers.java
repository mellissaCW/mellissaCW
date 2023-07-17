package Melisa;

import java.util.Scanner;

public class While_Answers {
    public static void main(String[] args) {
        // Task 04 ) Verilen bir sayının faktoriyelini hesaplayınız

        Scanner scan = new Scanner(System.in);
        System.out.println(" fatoriyelini hesaplayacagnız sayıyı giriniz : ");
        int sayi = scan.nextInt();
        int sonuc = 1;

        while (sayi>=1) {
           sonuc*=sayi;
           sayi--;
        }
        System.out.println("faktoriyel : " + sonuc);
    }
}
