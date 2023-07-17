package P02_DataTypes.TASKS;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class TaskWapper {
    // Tüm sorular Wapper Class kullanılarak çözülmelidir.
    // if, ternary , + , ifadeleri kullanılamyacak
    // Task01 : float, double, byte, short ve int'in maximum ve minimum degerlerini print eden code create ediniz.
    // Task02 : verilen 3 sayıdan en buyuk olanını , wapper class yöntemi ile bulan bir code yazınız
    // Task03 : verilen 3 sayıdan ortanca olanı bulnuz wapper class yöntemi ile bulan bir code yazınız
    // Task04 : Verilen 3 sayıdan, en küçüğü ile en büyüyünün toplamını bulan program yazınız
    // Task05 : verilen 2 sayının farkını bulun sonuç 0 dan büyük olsun

    public static void main(String[] args) {

        // Task01 : float, double, byte, short ve int'in maximum ve minimum degerlerini print eden code create ediniz.
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        // Task03 : verilen 3 sayıdan ortanca olanı bulnuz wapper class yöntemi ile bulan bir code yazınız

        int sayi01 = 24;
        int sayi02 = 29;
        int sayi03 = 56;
        int toplam = Integer.sum(sayi01 ,sayi02);
        int fark = Integer.signum(sayi01);














    }
}
