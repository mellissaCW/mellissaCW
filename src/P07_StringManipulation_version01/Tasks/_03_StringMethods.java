package P07_StringManipulation_version01.Tasks;

import java.util.Scanner;

public class _03_StringMethods {
    public static void main(String[] args) {
        // ekrandan isim ve soy ismi tek boşluk ile okutunuz,
        // ve büyük harf kısaltma olarak yazınız
        // input "can taman"
        // output "C.T."

        Scanner scan = new Scanner(System.in);
        System.out.println("isim soyisim giriniz : ");
        String isimSoyisim = scan.nextLine();
        char ilkHarf = isimSoyisim.toUpperCase().charAt(0);
        char soyBasHarf = isimSoyisim.toUpperCase().charAt(isimSoyisim.indexOf(" ")+1);

        System.out.println(ilkHarf+"."+soyBasHarf+".");

    }
}
