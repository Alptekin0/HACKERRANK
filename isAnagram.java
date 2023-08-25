package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class isAnagram {

	public static void main(String[] args) {
		
		System.out.println();
		
		/*
		  VERİLEN İKİ STRİNGİN ANAGRAM OLU OLMADIĞINI KONTROL EDEN KOD.
		  
		  ANAGRAM : bir kelimenin her bir harfini bir kez kullanarak, farklı kelime veya kelimeler oluşturmaktır.
		  
		  ÖRNEK : 
		  
		    HEART ---> EARTH
		  
		  */
		
		
		Scanner input = new Scanner(System.in);
		
				
		String a = input.nextLine();
		String b = input.nextLine();
		
		ArrayList<Character> aList = new ArrayList<>();
		ArrayList<Character> bList = new ArrayList<>();
		
		
		for (int counter = 0; counter < a.length(); counter++) {
			aList.add(a.toLowerCase().charAt(counter));
		}
		
		Collections.sort(aList);
		
		for (int counter = 0; counter < b.length(); counter++) {
			bList.add(b.toLowerCase().charAt(counter));
		}
		
		Collections.sort(bList);
	
		if (aList.equals(bList)) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
		
	}

}
