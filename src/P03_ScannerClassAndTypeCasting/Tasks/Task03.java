package P03_ScannerClassAndTypeCasting.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Günde kaç saat uyuyorsunuz ?  : ");
        int gunlukUykuSaati = scan.nextInt();

        int aylikUykuSaati = gunlukUykuSaati*30;
        int yillikUykuSaati = aylikUykuSaati*12;
        int kirkYildaUykuSaati = yillikUykuSaati*40;

        System.out.println("Ayda "+aylikUykuSaati + ", yılda "+ yillikUykuSaati + ", 40 yilda " + kirkYildaUykuSaati + " saatiniz uykuda geciyor" );
        System.out.println("Ayda "+aylikUykuSaati/24 + ", yılda "+ yillikUykuSaati/24 + ", 40 yilda " + kirkYildaUykuSaati/24 + " gününüz uykuda geciyor");
    }
}
