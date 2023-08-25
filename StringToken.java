package HackerRank;

import java.util.Scanner;

public class StringToken {

	public static void main(String[] args) {
		
		
		/*
		 GİRİLEN STRİNGİ NOKTALAMA İŞARETLERİ VB. ŞEYLERİ KALDIRIP KELİME SAYISINI BULMA
		 
		 ÖRNEK :
		 He is a very very good boy, isn't he? ---> GİRİLEN STRİNG
		 
		 ÇIKTI : 
		 10  ---> KELİME SAYISI
		 He is a very very good boy isn t he --> KELİMELER
		   
		  */
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("String girin : ");
		String s = input.nextLine();
		String str[] = null;
		String string;
		
		string =s.replaceAll("'", " ").replaceAll("[\\s|\\u00A0]+", " ").replaceAll("\\p{Punct}", "").replaceAll("'", " ").trim();
		
		str =string.split(" ");
		
		System.out.println(str.length);
		
		for (String a : str) {
			System.out.println(a);
		}
		
		
		
		
		
	}

}
