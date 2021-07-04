/*
Question: Prime Numbers with a Twist
Write a code to check whether number is prime or not.
Condition use function check() to find whether entered number is positive or
negative, if negative then,enter the number and If yes pass number as a parameter to
prime() and check whether Number is prime or not?
* Whether the number is positive or not, If it is negative then print the message
"Please Enter the positive Number"
* It is positive then call the function prime and check whether the task positive
number is prime or not.
*/

package javaPrep;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		sc.close();
		if(checkNegetive(n)) {
			System.out.println("Please Enter the positive Number");
		}
		else {
			if(checkPrime(n)) {
				System.out.println("Prime, positive number");
			}
			else {
				System.out.println("Not a Prime, positive number");
			}
		}
	}

	private static boolean checkPrime(int n) {
		// TODO Auto-generated method stub
		if(n == 1) {
			return false;
		}
		else {
			for (int i = 2; i < n; i++) {
				if(n % i == 0) {
					return false;
				}
				else
					return true;
			}
		}
		return false;
	}

	private static boolean checkNegetive(int n) {
		// TODO Auto-generated method stub
		if(n <= 0)
			return true;
		else
			return false;
	}

}
