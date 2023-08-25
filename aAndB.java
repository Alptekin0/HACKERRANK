package HackerRank;

import java.util.Scanner;
import java.util.Stack;

public class aAndB {

	public static void main(String[] args) {
		
		/*
		  VERİLEN İKİ STRİNGİN UZUNLUK TOPLAMI VE STRİNGLERİN BİRBİRİNİN AYNISI OLUP
		  OLMADIĞINI KONTROLEDEN PROGRAM. 
		 */
		
		Scanner input = new Scanner(System.in);
		String aString = input.nextLine();
		String bString = input.nextLine();
		
		int kelimlerToplami;
		
		kelimlerToplami = aString.length() + bString.length();
		
		System.out.println(kelimlerToplami);
		
		if (aString.compareTo(bString) > 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		System.out.println(aString.substring(0, 1).toUpperCase()+aString.substring(1)+" "+bString.substring(0, 1).toUpperCase()+bString.substring(1));		
		
	}

}
