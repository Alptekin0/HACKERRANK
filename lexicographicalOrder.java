package HackerRank;

import java.util.Scanner;

public class lexicographicalOrder {

	public static void main(String[] args) {
		
		
		/*
		 KLAVYEDEN GİRİLEN STRİNG BİR KELİME VE HECELEME SAYISINA 
		 GÖRE KELİMEYİ HECELERE AYIRIP ALFABETİK SIRAYA GÖRE EN ÖNDE OLAN HECE VE EN SONDA OLAN HECEYİ YAZDIRAN PROGRAM.
		 
		 ÖRNEK : 
		 
		  welcometojava  ---> GİRİLEN KELİME
		  3              ---> HECELEME SAYISI
		  
		  
		  ÇIKTI : 
		  
		  3 HARFLİ HECELERE AYIRDIKTAN SONRA ALFEBETİK SIRADA İLK GELEN HECE VE SON GELEN HECE
		  
		  ava  ---> ALFEBETİK SIRADA İLK GELEN HECE
		  wel  ---> ALFEBETİK SIRADA SON GELEN HECE
		  
		  */

		Scanner input = new Scanner(System.in);
		System.out.print("String giriniz : ");
		String s = input.nextLine();
		String bos = "";

		String smallest = "z";
		String largest = "A";

		int counter = 0;

		int heceleme = input.nextInt();

		while (heceleme <= s.length()) {

			bos = s.substring(counter, counter + heceleme);

			s = s.substring(1);

			if (bos.compareTo(smallest) < 0) {
				smallest = bos;
			}
			if (bos.compareTo(largest) > 0) {
				largest = bos;
			}

		}

		System.out.println(smallest);
		System.out.println(largest);

	}

}
