/*
Question :
One programming language has the following keywords that cannot be used as
identifiers: break, case, continue, default, defer, else, for, func, goto, if, 
map, range, return, struct, type, var
Write a program to find if the given word is a keyword or not
*/

package javaPrep;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		if (checkKeyword(s))
			System.out.println(s + " : is a Keyword");
		else
			System.out.println(s + " : Not a keyword");

	}

	public static boolean checkKeyword(String s) {
		String str[] = { "break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map",
				"range", "return", "struct", "type", "var" };
		for (int i = 0; i < str.length; i++) {
			if (s.equals(str[i])) {
				return true;
			}
		}
		return false;

	}
}
