package Strings;

import java.util.Scanner;

public class NearestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rob = new Scanner(System.in);
		   int t;
		   System.out.println("Enter test cases");
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			   int n;
			   n = rob.nextInt();
			   int rem = n%10;
			   if (rem<=5) {
				   System.out.println(n-rem);
			   }
			   else {
				   int left = 10-rem;
				   System.out.println(n+left);
			   }
		   }

	}

}
