package HackerRank;

import java.util.Scanner;

public class JavaSubstring {

	public static void main(String[] args) {
		
		/*
		 VERİLEN STRİNGİN BAŞLANGIC VE BİTİŞ NOKTASINI VERDİKTEN
		  SONRA STRİNGİN O DEĞERLER ARASINDAKİ HARFLERİNİ DÖNDÜRÜR.
		  */
		
		Scanner input = new Scanner(System.in);
		System.out.println("string giriniz : ");
		String s = input.nextLine();
		
		int start = input.nextInt();
		int end = input.nextInt();
		
		
		System.out.println(s.substring(start, end));
		
		
		
	}

}
