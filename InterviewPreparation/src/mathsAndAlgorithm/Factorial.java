package mathsAndAlgorithm;

import java.util.Scanner;

//Factorial of a Number
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rob = new Scanner(System.in);
        int t,n;
        System.out.println("enter no of test cases");
        t = rob.nextInt();
        for (int l=0;l<t;l++) {
        	n = rob.nextInt();
        	int result=1;
        	for (int i=n;i>0;i--) {
        		result *= i;
        	}
        	System.out.println(result);
        }
	}

}
