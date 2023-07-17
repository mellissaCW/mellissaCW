package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = input.nextInt();
        if (yas>=0) {
            if (yas < 5) {
                System.out.println("bebek");
            } else {
                if (yas < 13) {
                    System.out.println("cocuk");
                } else {
                    if (yas < 20) {
                        System.out.println("genc");
                    } else {
                        if (yas < 30) {
                            System.out.println("yetişkin");
                        } else {
                            System.out.println("tanımlanmamıs evre");
                        }
                    }
                }
            }

        } else {
            System.out.println("yaş negatif olamaz");
        }


    }
}