package P07_StringManipulation_version03.Tasks02;

import java.util.Scanner;

public class Task02_02 {
    public static void main(String[] args) {
        // Verilen stringin , ilk karekterini silin
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String  word = scan.nextLine();

        // 1.yol
        word = word.substring(1);
        System.out.println("New Word --> : " + word);
    }
}
