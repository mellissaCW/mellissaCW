package P03_ScannerClassAndTypeCasting.Tasks;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        // toplamı 2 sekilde yaparım

        // 1. yol : direk yazdırma
        System.out.println(a+b);

        // 2. yol : bir değişkene atayıp yazdırır
        int toplam = a+b;
        System.out.println(toplam);

        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextLine());


    }
}
