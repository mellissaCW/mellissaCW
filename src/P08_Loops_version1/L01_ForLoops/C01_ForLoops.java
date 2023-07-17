package P08_Loops_version1.L01_ForLoops;

public class C01_ForLoops {
    public static void main(String[] args) {
        int sum = 0;
        int i = 100;

        for (i = 100; i > 13; i--) {

            if (i % 13 == 0) {
                System.out.print(i + " > ");
                sum += i;
            }


        }
        System.out.println(i);
        System.out.println();
        System.out.println("Sayıların toplamı " + sum);
    }
}