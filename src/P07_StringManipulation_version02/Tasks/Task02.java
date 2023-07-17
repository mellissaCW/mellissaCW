package P07_StringManipulation_version02.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("password girişi yapınız : ");
        String password = sc.nextLine();

        // 1. yol
        if (password.length() >= 6) {
            if (password.charAt(0) >= 'A' && password.charAt(password.length()-1) <= 'Z') {
                if ((password.charAt(password.length()-1)) >= 0 && password.charAt(password.length()-1) <= 9) {
                    System.out.println("Tebrikler, güçlü bir şifre oluşturdunuz.");

                }else {
                    System.out.println("Şifrenizin son hanesi rakam olmalı.");
                }
            }else {
                System.out.println("İlk karakter büyük harf olmalıdır.");
            }
        }
        else {
            System.out.println("Şifre en az 6 karakter olmalı.");
        }


        // 2.yol
        // if (!Character.isUpperCase(password.charAt(0))) {
        //     System.out.println("ilk harf buyuk olsun");
        // }
        // if (!Character.isDigit(password.charAt(password.length() - 1))) {
        //     System.out.println("son harf sayı olsun");
        // }
        // if (password.length() < 6) {
        //     System.out.println(" 6 dan buyuk olsun");
        // }
//

    }
}
