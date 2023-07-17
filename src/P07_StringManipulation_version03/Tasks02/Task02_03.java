package P07_StringManipulation_version03.Tasks02;

import java.util.Scanner;

public class Task02_03 {
    public static void main(String[] args) {
        // Verilen stringin , son karekterini '*' ile değiştirin
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String  word = scan.nextLine();

        // 1.yol
        word = word.substring(0,word.length()-1).concat("*");
        System.out.println("New Word --> : " + word);
        // 2.yol

    }
}
