package coreJava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to my Calculator");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		float result = a;
		char operator = ' ';
		
		while(operator != '=') {
			System.out.println("Choose an operator: +, -, *, / or, =");
			operator = sc.next().charAt(0); 
			result = calculate(operator, result);
		}
		if (operator == '=') {
			System.out.println("Result is :" +result);
		}
		 	
	}


	public static float calculate(char operator, float result) {
		if (operator == '=') {
			return result;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter next number");
		int b = 0;
		try {
			b = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		switch (operator) {
		case '+':
			result = result + b;
			break;
		case '-':
			result = result - b;
			break;
		case '*':
			result = result * b;
			break;
		case '/':
			result = result / b;
			break;
		default:
			System.out.println("Please choose proper operator");
			break;
		}
		return result;

	}

}
