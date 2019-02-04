package mathsAndAlgorithm;

import java.util.Scanner;

public class CountSquares {
	public static void main(String[] args) {
		
		
		int t;
		double n;
		 System.out.println("Enter no of test cases");
		   Scanner rob = new Scanner(System.in);
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			  n = rob.nextDouble();
			   n--;
			   double count = Math.floor(Math.sqrt(n));
			   System.out.println((int)count);
		   }
		
	}

}
