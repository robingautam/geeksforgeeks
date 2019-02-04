package mathsAndAlgorithm;

import java.util.Scanner;

public class TriangularProblem {

	public static void main(String[] args) {
		int n,t;
		Scanner rob = new Scanner(System.in);
		System.out.println("Enter number of test cases");
        t = rob.nextInt();
        for (int l=0;l<t;l++) {
        	int sum = 0;
        	n = rob.nextInt();
        	for (int i=1;sum<n;i++) {
        		sum = sum+i;
        	}
        	System.out.println(sum);
          if (sum==n) {
        	  System.out.println("1");
          }
          else {
        	  System.out.println("0");
          }
        }

	}

}
