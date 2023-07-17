package P03_ScannerClassAndTypeCasting.Tasks;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    Bir String oluşturun.
          Konsol'a isminizi girin.
          İsminizi yazdırın.  */

        //Kodu aşağıya  yazınız.

        // Scanner  2 sekilde kullanabiliriz .
        // Scannerdaki işlemimiz  --->   scan.nextLine()

        String isim;  // 1.adım
        Scanner scan = new Scanner(System.in);
        System.out.println("adınızı girin");
        // 1. yol. direk aldıgımız degeri yazdırabiliriz
        System.out.println(scan.nextLine());

        // 2.yol : Aldıgımız degeri bir degişkene atayıp değişkeni yazdırabilriz
        System.out.println("yeni birşeyler oluyor");
        isim = scan.nextLine();
        System.out.println(isim);




    }
}
