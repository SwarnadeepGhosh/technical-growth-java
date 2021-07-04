/*
Question :
The program will receive 3 English words input from STDIN
These three word will be read one at a time, in three separate line
The first word should be changed like all vowels should be replaced by %
The second word should be changed like all consonants should be replaced by #
The third word should be changed like all char should be converted to upper case
Then concatenate the three words and print them
for example if you print how are you then output should be h%wa#eYOU.
*/

package javaPrep;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input 1 : ");
		String x = sc.nextLine();
		System.out.print("Input 2 : ");
		String y = sc.nextLine();
		System.out.print("Input 3 : ");
		String z = sc.nextLine().toUpperCase();
		// System.out.println(x + y + z);

		String output = programLogic(x, y, z);
		System.out.println("Output : " + output);
		sc.close();

	}

	public static String programLogic(String x, String y, String z) {
		String output = "";

		for (int i = 0; i < x.length(); i++) {
			if (checkVowel(x.charAt(i))) {
				output = output + '%';
			} 
			else
				output = output + x.charAt(i);
		}

		for (int i = 0; i < y.length(); i++) {
			if (checkVowel(y.charAt(i))) {
				output = output + '#';
			} 
			else
				output = output + y.charAt(i);
		}

		output = output + z;

		return output;

	}

	public static boolean checkVowel(char ch) {
		switch (ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		}

		return false;

	}

}
