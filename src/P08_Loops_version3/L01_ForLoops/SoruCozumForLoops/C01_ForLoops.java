package P08_Loops_version3.L01_ForLoops.SoruCozumForLoops;

public class C01_ForLoops {
    public static void main(String[] args) {

        int toplam=0;
        int yaritoplam;
        for (int i = 0; i <10 ; i++) {
           toplam = toplam+i;
           yaritoplam = toplam/2;
            System.out.println("i="+i+"   Toplam = "+toplam);
        }

        System.out.println(toplam);



    }
}
