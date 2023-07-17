package P06_Ilk6dersDegerlendirmeSorulari;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*  Klavyeden okutulan ondalıklı bir sayının , ondalık kısmını ekran yazdırınız
        Örnek : input : 3.435 , output : 0.435
        */

        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter a double number : ");
        double number = scan.nextDouble();

        double convertNumber = (int) number;
        number = number - convertNumber ;

        System.out.println(" number = " + number);




    }
}
