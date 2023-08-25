package HackerRank;

import java.util.Scanner;

public class powerOfTwo {

	public static void main(String[] args) {

		/*
		 * 
		 * GİRİLEN SAYİ 2'NİN KUVVETİ İSE TRUE DEĞİL İSE FALSE
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("n sayisinin giriniz : ");
		double n = input.nextDouble();
		double sayi = 0;
		double counter = 0;

		while (sayi < n) {

			sayi = Math.pow(2, counter);
			counter++;
		}

		if (sayi == n && n != 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
