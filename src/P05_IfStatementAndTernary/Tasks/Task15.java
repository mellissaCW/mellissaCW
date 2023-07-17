package P05_IfStatementAndTernary.Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise
          kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
            tecrubeyılı
            ehliyeti varmı?
            kmKullanım?
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ehliyetiniz var mı?(E/H) : ");
        char ehliyet = scanner.next().toUpperCase().charAt(0);
        if (ehliyet == 'E' ) {
            System.out.print("Sürücü ehliyetiniz kaç yıllık? : ");
            int tecrubeYil = scanner.nextInt();
            System.out.print("Kaç KM araç kullandınız? : ");
            int tecrubeKM = scanner.nextInt();
            if (tecrubeYil>=7) {
                if (tecrubeKM>=100000) {
                    System.out.println("Tebrikler işe alındınız");
                } else {
                    System.out.println("Tecrübeniz yetersiz eksik KM = "+ (100000-tecrubeKM));
                }
            } else {
                System.out.println();
                System.out.println("Tecrübeniz yetersiz eksik yıl = " + (7-tecrubeYil));
                if (tecrubeKM<100000) {
                    System.out.println("Eksik km = "+ (100000-tecrubeKM));
                }
            }
        } else {
            if (ehliyet=='H') {
                System.out.println("Bu iş için ehliyet ve tecrübe şarttır");
            } else {
                System.out.println("Hatalı giriş");
            }
        }



    }
}





















