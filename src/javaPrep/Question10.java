/*
Question : String permutation
Given two Strings determine weather one is permutation of other.
(string consist of all small letters with no space)
*/

package javaPrep;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		boolean res = isPermutation(a, b);
		if (res)
			System.out.println(a + " is permutation of " + b);
		else
			System.out.println(a + " is NOT permutation of " + b);
	}

	public static boolean isPermutation(String a, String b) {
		boolean res = false;
		char[] s1 = a.toLowerCase().toCharArray();
		Arrays.sort(s1);
		System.out.println(s1);
		String first = s1.toString();

		char[] s2 = b.toLowerCase().toCharArray();
		Arrays.sort(s2);
		System.out.println(s2);
		String second = s1.toString();

		if (first.equals(second))
			res = true;
		else
			res = false;
		return res;
	}

}
