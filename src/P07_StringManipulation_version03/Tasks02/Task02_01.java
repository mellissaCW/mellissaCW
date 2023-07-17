package P07_StringManipulation_version03.Tasks02;

import java.util.Scanner;

public class Task02_01 {
    public static void main(String[] args) {
        // verilen stringin 3. index  varsa silin
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String  word = scan.nextLine();

        // 1.yol
        if ((word.length()-1) >=3) {
            word = word.substring(0,3)+word.substring(4);
            System.out.println("New word --> " + word);
        } else System.out.println("Stringinizin uzunlugu yetersiz ");


    }
}
