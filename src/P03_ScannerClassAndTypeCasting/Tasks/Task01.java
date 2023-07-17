package P03_ScannerClassAndTypeCasting.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your min-term grade  :  ");
        int minTerm = scan.nextInt();
        System.out.print("Enter your final grade  :  ");
        int fnl = scan.nextInt();
        System.out.print("Enter your min-term grade  :  ");
        int proje = scan.nextInt();

        double avarage = minTerm*0.3 + fnl*0.5 + proje*0.2;
        System.out.println(" Avarage = " + avarage);




    }
}
