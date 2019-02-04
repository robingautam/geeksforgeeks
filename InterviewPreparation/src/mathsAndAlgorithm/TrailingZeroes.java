package mathsAndAlgorithm;

import java.util.Scanner;

public class TrailingZeroes {
	
	public static int trailingZero(int n) {
		int trailingzero = 0;
		int a=5;
		if (n<4) {
			return 0;
		}
		else {
			while(a<=n) {
				trailingzero = trailingzero+n/a;
				a = a*5;
			}
				
		}
		return trailingzero;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,t;
		Scanner rob = new Scanner(System.in);
		System.out.println("Enter number of test cases");
        t = rob.nextInt();
        for (int l=0;l<t;l++) {
        	n = rob.nextInt();
        	System.out.println(trailingZero(n));
        }
	}

}
