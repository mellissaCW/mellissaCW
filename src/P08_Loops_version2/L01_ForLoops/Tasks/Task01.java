package P08_Loops_version2.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/
        Scanner sc = new Scanner(System.in);
        System.out.println("bir pozitif tam sayi giriniz : ");
        int sayi = sc.nextInt();//63-> 1,2,3,  .. 63->
        // input : 21   output : "Java"1
        // input : 10   output : "Can'dır"
        // input : 15   output : "JavaCan"

        if(sayi<100){

            for(int i=1; i<=sayi;i++){
                if(i%3==0 && i%5==0){
                    System.out.println("Javacan");
                }else if(i%5==0){
                    System.out.println("Can'dir");
                }else if(i%3==0){
                    System.out.println("Java");
                }else {
                    System.out.println(i);
                }
            }

        }else{
            System.out.println("hatali giris yaptiniz");
        }


    }
}
