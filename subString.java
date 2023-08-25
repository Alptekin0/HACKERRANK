package HackerRank;

import java.util.Scanner;

public class subString {

	public static void main(String[] args) {
		
		/*
		 PALİNDROM STRİNG KONTROL
		  */

		Scanner input = new Scanner(System.in);
		System.out.print("string gir : ");
		String string = input.nextLine();

		StringBuilder stringBuilder = new StringBuilder(string);

		stringBuilder.reverse();

		if (string.equals(stringBuilder.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
