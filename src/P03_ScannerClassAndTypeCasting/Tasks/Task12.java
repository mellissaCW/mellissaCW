package P03_ScannerClassAndTypeCasting.Tasks;

public class Task12 {
    /*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
     */

    public static void main(String[] args) {

       // ilk atamada String degerler eşitse
        String s1 = "Ayse";
        String s2 = "Ayse";

        System.out.println(s1==s2);

        String s11 = "ayse";
        String s12 = "ay";
        s12 = s12 + "se";
        System.out.println("s11 = "+ s11 );
        System.out.println("s12 = "+ s12 );
        System.out.println(s1.equals(s2));



    }


}
