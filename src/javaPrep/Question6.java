/*
Question :
-------------- SNAKE PATTERN ------------------
Given a Matrix mat[][] of size N X N.
The Task is to print the elements of a matrix in Snake pattern.
Example :
10 -> 20 -> 30 -> 40
				  |
50 <- 60 <- 70 <- 80
|
27 -> 29 -> 47 -> 48
				   |
32 <- 33 <- 39 <- 50
*/

package javaPrep;
//import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Rows: ");
		int r = sc.nextInt();
		System.out.print("Enter the Column: ");
		int c = sc.nextInt();
		
		int mat[][] = new int[c][r];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		*/
		int mat[][]= {  {10,20,30,40},
						{50,60,70,80},
						{27,29,47,48},
						{32,33,39,50}
					};
		snakePattern(mat);
		
	}

	private static void snakePattern(int[][] mat) {
		// TODO Auto-generated method stub
		/*
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		*/
		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0)
				for (int j = 0; j < 4; j++)
					System.out.print(mat[i][j] + " ");
			else
				for (int j = (4 - 1); j >= 0; j--)
					System.out.print(mat[i][j] + " ");
		}
	}


}
