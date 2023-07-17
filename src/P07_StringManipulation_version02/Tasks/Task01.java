package P07_StringManipulation_version02.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();

        // first way
        System.out.println(text.contains(" "));
        // second way
        int firstLenght = text.length();
        int lastLenght = text.replace(" ","").length();

        String sonuc = (firstLenght == lastLenght ) ?  "Boslıuk içermez" : "Bosluk içerir";
        System.out.println("sonuc = "+ sonuc);


    }
}

