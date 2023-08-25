package HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;


public class patternSyntaxChecker {

	public static void main(String[] args){
		
		
		/*
		 KLAVYEDEN GİRİLEN STİRİNGİN PATTERN KURALINA UYGUN OLDUP OLMADIĞINI GÖSTEREN KOD.
		  
		  */
		
		
		Scanner input = new Scanner(System.in);
		int NumberOfEnter = input.nextInt();
		
		
		
		input.nextLine();
		
		for (int counter = 0; counter < NumberOfEnter; counter++) {
			
			String s = input.nextLine();
			
			try {
				Pattern.compile(s);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
			
			
		}
		
		
		
		
		
		
		
	
	}

}
