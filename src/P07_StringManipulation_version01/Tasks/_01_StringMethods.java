package P07_StringManipulation_version01.Tasks;

import java.util.Scanner;

public class _01_StringMethods {
    public static void main(String[] args) {
        // ekrandan bir cümle giriş yapın,
        // içerisinde bir  kelimenin olup olmadığını kotrol edin
        // ornek input : cumle="Merhaba nasılsın ali" , kelime="ali"

        Scanner scan = new Scanner(System.in);
        System.out.println("cumle giriniz : ");
        String cumle = scan.nextLine();
        System.out.println("aranacak kelime girinz : ");
        String aranacakKelime = scan.nextLine();

        System.out.println(cumle.contains(aranacakKelime));





    }
}
