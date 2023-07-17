package P07_StringManipulation_version03.Tasks02;

import java.util.Scanner;

public class Task02_04 {
    public static void main(String[] args) {
        // "ad soyad" şeklinde string veriliyor,  soy ad içierisinde ki ilk
        // "e" harfinin indexini bulun

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name and surname : ");
        String  nameSurname = scan.nextLine();

        int spaceIndex = nameSurname.indexOf(" ");
        int eIndex = nameSurname.indexOf("e",spaceIndex);

        System.out.println("e nin index --> "+ eIndex);

    }
}
