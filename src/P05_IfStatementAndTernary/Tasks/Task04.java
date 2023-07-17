package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir character giriniz : ");

		char ch = scan.next().charAt(0);
		if (ch>='A' && ch<='Z') {
			System.out.println("Büyük harftir");
		} else {
			if (ch>='a' && ch<='z') {
				System.out.println("kucuk harftir");
			} else {
				System.out.println("harf değildir");
			}
		}

		// cozum 2 ***
	//	System.out.println("Compare = "+Character.compare('d','a'));
		if (Character.isUpperCase(ch)) {
			System.out.println("Büyük harftir");
		} else if (Character.isLowerCase(ch)) {
			System.out.println("kucuk harftir");
		} else {
			System.out.println("harf değildir");
		}
		/* Character metotları */
		if (!Character.isAlphabetic(ch)); // alfabetik olmayanlar demektir
		if (Character.isDigit(ch)); // bu rakammıdır

		// compare ile çözelim
		// Character.compare(ch,'a') = ch - 'a'
		if (Character.compare(ch,'a') >=0 && Character.compare(ch,'z')<=0) {
			System.out.println("kucuk harftir");
		} else {
			if (Character.compare(ch,'A') >=0 && Character.compare(ch,'Z')<=0) {
				System.out.println("Büyük harftir");
			} else {
				System.out.println("harf değildir");
			}
		}










} 

}
