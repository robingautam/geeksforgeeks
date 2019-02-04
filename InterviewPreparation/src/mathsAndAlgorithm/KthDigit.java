package mathsAndAlgorithm;

import java.util.Scanner;

//Given two numbers A and B, find Kth digit from right of A^B.
public class KthDigit {

	public static void main(String[] args) {
		 int t;
		   int a,b,k;
		   System.out.println("Enter no of test cases");
		   Scanner rob = new Scanner(System.in);
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			   int result=0;
			   int rem=0;
			   a = rob.nextInt();
			   b = rob.nextInt();
			   k = rob.nextInt();
			   int pow = (int) Math.pow(a, b);
			   for (int i=0;i<k;i++) {
				    rem = pow%10;
				   pow /= 10;
			   }
			   System.out.println(rem);
		   }

	}

}
