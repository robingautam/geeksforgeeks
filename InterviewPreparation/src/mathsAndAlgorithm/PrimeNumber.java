package mathsAndAlgorithm;

import java.util.Scanner;

//program to check prime number
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rob = new Scanner(System.in);
        int t,n;
        System.out.println("enter no of test cases");
        int flag=0;
        t = rob.nextInt();
        for (int l=0;l<t;l++) {
        	n = rob.nextInt();
        	for (int i=2;i<n/2;i++) {
        		if (n%i==0) {
        			flag = 1;
        			break;
        		}
        	}
        	if (flag == 0) {
        		System.out.println("YES");
        	}
        	else {
        		System.out.println("NO");
        	}
        	
        }

	}

}
