package P08_Loops_version2.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.
        örnek "1 ala 1"
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String str = sc.nextLine();
        String lastStr = "";

        for (int i = 0; i < str.length(); i++) {
            lastStr += str.charAt(str.length() - i);
            System.out.println(lastStr);

        }

        if (str.equals(lastStr)) {
            System.out.println("polindrome");
        } else {
            System.out.println("not polindrome");
        }
    }


}
