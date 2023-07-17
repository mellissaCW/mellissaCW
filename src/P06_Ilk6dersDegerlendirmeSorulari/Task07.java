package P06_Ilk6dersDegerlendirmeSorulari;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /* 1 ila 10 arasında (1 ve 10 dahil) rastgele bir tam sayı üretip, ekrana yazdırınız
         */

        for (int i =1 ; i<=20 ; i++) {
        int sayi = (int)(Math.random()*10+1);
        System.out.println(sayi);
        }


    }
}
