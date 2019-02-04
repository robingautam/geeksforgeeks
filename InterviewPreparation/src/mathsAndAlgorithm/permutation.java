package mathsAndAlgorithm;

import java.util.Scanner;

//program to calculate nPr. nPr represents n permutation r and value of nPr is (n!) / (n-r)!.
public class permutation {

	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		int t,n,r;
		System.out.println("Enter number of test Cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int result=1;
			System.out.println("enter n");
			n = rob.nextInt();
			System.out.println("Enter r");
			r = rob.nextInt();
			for (int i=n;i>(n-r);i--) {
				result *= i;
				
			}
			System.out.println(result);
		}

		

	}

}
