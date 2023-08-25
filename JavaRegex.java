package HackerRank;

import java.util.Scanner;

public class JavaRegex {

	public static void main(String[] args) {
		System.out.println();

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String s = input.next();
			System.out.println(MyRegex(s));
		}

	}

	private static boolean MyRegex(String s) {

		boolean durum = true;

		int BasamakDurumu = 0;

		String[] bStrings = s.split("\\.");

		int sayilar = 0;

		if (bStrings.length == 0) {
			durum = false;
		}

		for (int counter = 0; counter < bStrings.length; counter++) {

			String a = bStrings[counter];

			if (bStrings[counter].length() > 3) {
				durum = false;
			}

			try {
				sayilar = Integer.valueOf(a);
			} catch (Exception e) {
				durum = false;
			}

			if (bStrings.length != 4) {
				durum = false;
			}

			if (sayilar > 255) {
				durum = false;
			}

			while (sayilar != 0) {

				int basamak = sayilar % 10;
				sayilar = sayilar / 10;
				BasamakDurumu++;

			}

			if (BasamakDurumu > 3) {
				durum = false;
			}

			BasamakDurumu = 0;

		}

		if (durum == false) {
			return false;
		} else {
			return true;
		}

	}

}