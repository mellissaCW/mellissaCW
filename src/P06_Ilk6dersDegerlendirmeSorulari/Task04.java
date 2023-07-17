package P06_Ilk6dersDegerlendirmeSorulari;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1 = 29;
        int s2 = 20;
        int s3 = 34;
        int s4 = 44;

        // Klavyeden girilen 4 sayının en büyüğünü
        // Task 04.1 : if kullanarak bulunuz (ternary, wrapper,Math kullanılmayacak)sout
        // Task 04.2 : ternary kullanarak bulunuz (if, wrapper,Math kullanılmayacak)
        // Task 04.3 : Matt class kullanarak bulunuz (if, ternary, wrapper,kullanılmayacak)
        // Task 04.4 : Wrapper class kullanarak bulunuz (if, ternary, math,kullanılmayacak)
        // Task 04.5 : Math class içinde ternary kullanarak bulunuz (if,wrapper,kullanılmayacak)
        // Task 04.6 : Ternary içinde Math class kullanarak bulunuz (if,wrapper,kullanılmayacak)

        int maax = (s1 > s2) ? (Math.max(s1,(Math.max(s3,s4)))): (Math.max(s2,(Math.max(s3,s4))));
        System.out.println("En büyük sayı " + maax);
        System.out.println("********");


        System.out.print("Birinci sayıyı giriniz: ");
         s1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        s2 = scan.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
         s3 = scan.nextInt();
        System.out.print("Döndüncü sayıyı giriniz: ");
         s4 = scan.nextInt();


        // Task 04.1
        int eB = s1;

        if (s2 > eB) {
            eB = s2;
        }
        if (s3 > eB) {
            eB = s3;
        }
        if (s4 > eB) {
            eB = s4;
        }

        System.out.println("En büyük sayı " + eB);
        System.out.println("**********");

        // Task 04.2

        String result = (s1 > s2 && s1 > s3 && s1 > s4) ? "En büyük sayı " + s1 : (s2 > s1 && s2 > s3 && s2 > s4) ? "En büyük sayı " + s2 : (s3 > s1 && s3 > s2 && s3 > s4 ) ? "En büyük sayı " + s3 : "En büyük sayı " + s4;
        System.out.println(result);
        System.out.println("********");



        // Task 04.3

        System.out.println("En büyük sayı " + (Math.max(s1, Math.max(s2, Math.max(s3, s4)))));
        System.out.println("En büyük sayı " + (Math.max(Math.max(s1, s2), Math.max(s3, s4))));
        System.out.println("*******");

        // Task 04.4

        int max = Integer.max(s1, Integer.max(s2, Integer.max(s3, s4)));
        int mmax = Integer.max(Integer.max(s1, s2), Integer.max(s3, s4));
        System.out.println("En büyük sayı " + mmax);
        System.out.println("En büyük sayı " + max);
        System.out.println("*******");

        // Task 04.5
        int mAx = Math.max(s1 > s2 ? s1:s2, s3 > s4 ? s3:s4);
        System.out.println("En büyük sayı " + mAx);
        System.out.println("******");

        // Task 04.6
        int maaax = (s1 > s2) ? (Math.max(s1,(Math.max(s3,s4)))): (Math.max(s2,(Math.max(s3,s4))));
        System.out.println("En büyük sayı " + maaax);
        System.out.println("********");


            }
        }
