package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;


public class romanToInteger {

	public static void main(String[] args) {
		
		
		/*
		   
		   ROMA RAKAMLARINI İNTEGER SAYİLARA ÇEVİRME PROGRAMI
		   
		   */
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Roma rakamini giriniz : ");
		String romaRakami = input.nextLine();
		
		int ilkSayi = 0, ikinciSayi = 1;
		int ilkSembol = 0;
		char tekliRoma;
		int normalSayi = 0;
		
		ArrayList<Character> rakamlar = new ArrayList<>();
		
		StringBuilder romaRakamiBuilder = new StringBuilder(romaRakami);
		
		
		while (!romaRakamiBuilder.isEmpty()) {
			tekliRoma = romaRakamiBuilder.charAt(ilkSembol);
			romaRakamiBuilder.deleteCharAt(ilkSembol);
			if (tekliRoma != 'I' && tekliRoma != 'V' && tekliRoma != 'X' && tekliRoma != 'L' && tekliRoma != 'C' & tekliRoma != 'D' & tekliRoma != 'M') {
				System.out.println("ROMA RAKAMLARINDA KULLANILMAYAN RAKAM GIRISI YAPILDIGI ICIN HESAPLAMANIZ YAPILMADI.");
				break;
			}
			rakamlar.add(tekliRoma);
			
		}
		
		
		
		if (rakamlar.size() > 1) {
			
			while (ikinciSayi != rakamlar.size()) {
				
				if (ikinciSayi > rakamlar.size()) {
					break;
				}
				
				if (rakamlar.get(ilkSayi) == 'I' && rakamlar.get(ikinciSayi)== 'V') {
					normalSayi += 4;
					rakamlar.remove(ikinciSayi);
					rakamlar.remove(ilkSayi);
				}
				else if (rakamlar.get(ilkSayi) == 'I' && rakamlar.get(ikinciSayi)== 'X') {
					normalSayi += 9;
					rakamlar.remove(ikinciSayi);
					rakamlar.remove(ilkSayi);
				}
				else if (rakamlar.get(ilkSayi) == 'X' && rakamlar.get(ikinciSayi)== 'L') {
					normalSayi += 40;
					rakamlar.remove(ikinciSayi);
					rakamlar.remove(ilkSayi);
				}
				
				else if (rakamlar.get(ilkSayi) == 'X' && rakamlar.get(ikinciSayi)== 'C') {
					normalSayi += 90;
					rakamlar.remove(ikinciSayi);
					rakamlar.remove(ilkSayi);
				}
				else if (rakamlar.get(ilkSayi) == 'C' && rakamlar.get(ikinciSayi)== 'D') {
					normalSayi += 400;
					rakamlar.remove(ikinciSayi);
					rakamlar.remove(ilkSayi);
				}
				
				else if (rakamlar.get(ilkSayi) == 'C' && rakamlar.get(ikinciSayi)== 'M') {
					normalSayi += 900;
					rakamlar.remove(ikinciSayi);
					rakamlar.remove(ilkSayi);
				}
				else {
					ilkSayi = ikinciSayi;
					ikinciSayi ++;	
				}
				
			}	
			
		}
		
		System.out.println();
				
		ilkSayi = 0;
		
		while (!rakamlar.isEmpty()) {

			if (!rakamlar.isEmpty()) {
				
				if (rakamlar.get(ilkSayi) == 'I') {
					normalSayi += 1;
					rakamlar.remove(ilkSayi);
				}
				else if (rakamlar.get(ilkSayi) == 'V') {
					normalSayi +=5;
					rakamlar.remove(ilkSayi);
				}
				else if (rakamlar.get(ilkSayi) == 'X') {
					normalSayi +=10;
					rakamlar.remove(ilkSayi);
				}
				else if (rakamlar.get(ilkSayi) == 'L') {
					normalSayi +=50;
					rakamlar.remove(ilkSayi);
				}
				else if (rakamlar.get(ilkSayi) == 'C') {
					normalSayi +=100;
					rakamlar.remove(ilkSayi);
				}
				else if (rakamlar.get(ilkSayi) == 'D') {
					normalSayi +=500;
					rakamlar.remove(ilkSayi);
				}
				else if (rakamlar.get(ilkSayi) == 'M') {
					normalSayi +=1000;
					rakamlar.remove(ilkSayi);
				}
				
			}	
		}
		
		
		System.out.println("SAYI = "+normalSayi);
		
		
		
		
		
		
		
	}

}
