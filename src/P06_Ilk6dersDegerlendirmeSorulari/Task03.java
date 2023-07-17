package P06_Ilk6dersDegerlendirmeSorulari;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /* Klavyeden girilen 3 double sayının toplamını Math class yardımı ile yazdırınız.
        toplama '+' işareti kullanılmayacak.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter 3 double number : ");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        double number3 = scan.nextDouble();

        System.out.println(Math.addExact((Math.addExact((int) number1, (int) number2)), (int) number3));



    }
}
