package P07_StringManipulation_version03.Tasks02;

import java.util.Scanner;

public class Task02_06 {
    public static void main(String[] args) {
        /*
         Task-> Girilen string içindeki istenen index'deki karakterin
         yerine '*' koyup print ediniz
         */


        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();

        System.out.print("istenen karakterin index'ini giriniz : ");
        int index=sc.nextInt();

        if (str.length()-1>=index) {
            str = str.substring(0,index).concat("*").concat(str.substring(index+1));
            System.out.println("New str --> "+ str);
        } else System.out.println("istediğiniz index de bir karakter yok");
    }
}
