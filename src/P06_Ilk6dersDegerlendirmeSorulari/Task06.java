package P06_Ilk6dersDegerlendirmeSorulari;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /* klavyeden sıra ile  1.sayı, işlem( +, -, *, / ) ve 2. sayı giriliyor ,
        işlemi yapıp ekrana yazdırınız (switch - case kullanılacak
        input
        3
        +
        5
        output 8

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Sırasıyla 1.sayı , işlem ve 2.sayı griniz : ");
        int sayi1 = scan.nextInt();
        char islem = scan.next().charAt(0);
        int sayi2 = scan.nextInt();

        switch (islem){
            case '+' :
                System.out.println(sayi1 +"+"+sayi2+" = "+ (sayi1+sayi2));
                break;
            case '-' :
                System.out.println(sayi1 +"-"+sayi2+" = "+ (sayi1-sayi2));
                break;
            case 'x' :
                System.out.println(sayi1 +"x"+sayi2+" = "+ (sayi1*sayi2));
                break;
            case '/' :
                System.out.println(sayi1 +"/"+sayi2+" = "+ (sayi1/sayi2));
                break;
            default :
                System.out.println("Neler oluyor :) ");





        }


    }
}
