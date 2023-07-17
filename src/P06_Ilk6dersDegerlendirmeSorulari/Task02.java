package P06_Ilk6dersDegerlendirmeSorulari;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* Klavyeden girilen ve 3 harften oluşan bir string i, her satıra bir harf gelecek şekilde yazdırınız
        Örnek input : ali,  (ipucu : String str="";  str.charAt)
         output
         a
         l
         i
          */

        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter a String which has 3 letters : ");
        String mtn = scan.nextLine();
        System.out.println(mtn.charAt(0) + "\n" + mtn.charAt(1) + "\n" + mtn.charAt(2));
    }
}
