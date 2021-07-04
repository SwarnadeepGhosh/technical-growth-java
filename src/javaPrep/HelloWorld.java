package javaPrep;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter name: ");
		//String name = sc.next();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Harry");
		list.add("Suman");
		list.add("Deep");
		list.remove("Suman");
		
		for(String i:list) {
			System.out.println(i);
		}
		
		
	}

}
