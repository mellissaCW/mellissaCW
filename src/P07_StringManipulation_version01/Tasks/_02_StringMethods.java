package P07_StringManipulation_version01.Tasks;

import java.util.Scanner;

public class _02_StringMethods {
    public static void main(String[] args) {
        // ekrandan bir string grişi yapın, içersinde "a" olupup olmadığını
        // kotrol edin varsa yazdırın ve
        // bir den fazla a varsa kaçıncı a yazdığını gözlemleyin

        Scanner scan = new Scanner(System.in);
        System.out.print("Cumle giriniz : ");
        String cumle = scan.nextLine();
        System.out.println("Aranacak harfi giriniz : ");
        String kelime = scan.nextLine();


        if (cumle.contains(kelime)) {
            System.out.println(true);
            System.out.println(cumle.indexOf(kelime));
        } else System.out.println("içermez");


    }
}
