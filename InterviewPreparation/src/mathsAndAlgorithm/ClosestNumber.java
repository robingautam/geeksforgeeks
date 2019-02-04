package mathsAndAlgorithm;

import java.util.Scanner;

/**   
Given non-zero two integers N and M.
The problem is to find the number closest to N and divisible by M   **/

public class ClosestNumber {

	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		int t;
		int n,m;
		System.out.println("Enter number of test cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int result=0;
			n = rob.nextInt();
			m = rob.nextInt();
			if (n>0) {
			for (int i=n;i>0;i--) {
				if (i%m==0) {
					if (i>result) {
						result = i;
					}
					
				}
			}
			System.out.println(result);
			}
			else {
				for (int i=n;i<=n-6;i--) {
					if (i%m==0) {
						/*if (i<result) {
							result = i;
						}*/
						result = i;
						
					}
				}
				System.out.println(result);

				
				
			}
			
		}
		
	}

}
