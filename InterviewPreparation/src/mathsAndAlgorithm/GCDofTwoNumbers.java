package mathsAndAlgorithm;

import java.util.Scanner;

public class GCDofTwoNumbers {
	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
        int t,a,b;
        System.out.println("enter no of test cases");
        t = rob.nextInt();
        for (int l=0;l<t;l++) {
        	int min=0;
        	int result = 0;
        	a = rob.nextInt();
        	b = rob.nextInt();
        	 min = a>b?b:a;
        	 for (int i=1;i<=min;i++) {
        		 if (a%i==0 && b%i==0) {
        			 if (i>result) {
        				 result = i;
        			 }
        		 }
        	 }
        	 System.out.println(result);
        }
		
		
	}

}
