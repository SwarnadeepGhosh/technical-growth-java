/*
 * Question:
Find the nth term of the series.
1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243,64, 729, 128, 2187 ….
This series is a mixture of 2 series – all the odd terms in this series form a
geometric series and all the even terms form yet another geometric series. Write a
program to find the Nth term in the series.
The value N in a positive integer that should be read from STDIN.
The Nth term that is calculated by the program should be written to STDOUT.
Other than value of n th term,no other character / string or message should be
written to STDOUT.
For example , if N=16, the 16th term in the series is 2187, so only value 2187
should be printed to STDOUT.
You can assume that N will not exceed 30.
Test Case 1
Input- 16
Expected Output – 2187
Test Case 2
Input- 13
Expected Output – 64
*/

package javaPrep;

import java.lang.Math;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		sc.close();

		int value = checkValue(n);
		System.out.println("Nth term is : " + value);

	}

	private static int checkValue(int n) {
		// TODO Auto-generated method stub
		int value;
		if (n % 2 != 0) {
			n = (n + 1) / 2;
			value = (int) Math.pow(2, n - 1);
		} 
		else {
			n = n / 2;
			value = (int) Math.pow(3, n - 1);
		}

		return value;
	}

}
