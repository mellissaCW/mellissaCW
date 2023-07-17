package P03_ScannerClassAndTypeCasting.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Boyunuzu cm olarak giriniz : ");
        double boy = scan.nextInt();
        System.out.print("Kilonuzu kg olarak giriniz : ");
        double kilo = scan.nextDouble();

        // cm cinsinden verilen boy değişkenini m cinsine çevirmemiz gerekir
        boy = boy/100;
        System.out.println(" m cinsinden boy : "+ boy);

        double vked = kilo/(boy*boy);
        int vkei = (int)(kilo/(boy*boy));

        System.out.println(" Vucut kutle endeksiniz : " + vked);
        System.out.println(" Vucut kutle endeksiniz : " + vkei);

    }
}
