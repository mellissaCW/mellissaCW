package P04_JavaOperatorsAndMathClass.MathClass;

public class MathClass {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 15;


       // Math.abs ---> mutlak deger alır
        int mutlakDeger = Math.abs(-5);
        System.out.println("mutlakDeger = " + mutlakDeger);
        double md = Math.abs(-42.7);
        System.out.println("md = " + md);
        System.out.println();


        // Math.pow --> sayının kuvvetini alır
        double dd= Math.pow(2,5);
        System.out.println(dd);
        System.out.println();

        double db = Math.pow(3,2.5);
        System.out.println("db : "+ db);
        long ll = (long)db;   // değişkene atadım
        System.out.println(ll);
        System.out.println((long)db);  // değişkene atamadan

        System.out.println();
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(2,1.5));
        System.out.println();
        System.out.println(Math.floor(8.9)); // alta yuvarlama

        //  Math.random()*100 --> 0 ila 99 arasında sayı üretir
        int rondomSayi = (int) (Math.random()*100);
        System.out.println(rondomSayi);
        //  Math.random()*10 --> 0 ila 9 arasında sayı üretir
        int rondomSayi1 = (int) (Math.random()*10);
        System.out.println(rondomSayi1);
        //  Math.random()*1 --> 0 ila 1 arasında sayı üretir . Ama 1 dahil degil
        int rondomSayi2 = (int) (Math.random()*1);
        System.out.println(rondomSayi2);
        System.out.println();
        //  Math.random()*2 --> 0 ila 1 arasında sayı üretir . Ama 2 dahil degil
        double  rondomSayi3 = (Math.random()*2);
        System.out.println(rondomSayi3);
        System.out.println();


        for (int i = 0; i <50 ; i++) {
            double dou = Math.random();
            int s1  = (int) (dou*3); // 0 ile 2 arası üretir
            System.out.print( s1 + " ");
        }
        System.out.println();
        for (int i = 0; i <50 ; i++) {
            double ddd = Math.random();
            int s2  = (int) (ddd*4); // 0 ile 3 arası üretir
            System.out.print( s2 + " ");
        }
        System.out.println();
        for (int i = 0; i <50 ; i++) {
            double doub = Math.random();
            int s3  = (int) (doub *3+1); // 1 ile 3 arası üretir
            System.out.print( s3 + " ");
        }

        System.out.println(Math.round(3.5)); // yuvarlar 4
        System.out.println(Math.round(3.4)); // yuvarlar 3
        int ss= Math.round(3.5f);
        int sa= (int) Math.round(3.5);
        System.out.println(Math.ceil(7.1)); // üste yuvarlar floor un tersi, sonuc 8
        System.out.println(Math.sqrt(2));
        double ondalik=Math.pow(120,(1.0/3)); // küp kök alır
        System.out.println(ondalik);





    }
}
