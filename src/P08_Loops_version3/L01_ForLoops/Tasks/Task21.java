package P08_Loops_version3.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task21 {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("satir gir : ");
        int st = input.nextInt();

        for (int i = 1; i<= st; i++) {
            for (int j = 1 ; j <= (st-i); j++){
                System.out.print(" ");
            }

        }


    }

}
































