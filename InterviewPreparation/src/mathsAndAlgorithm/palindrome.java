package mathsAndAlgorithm;

import java.util.Scanner;

//program to check if the sum of digits of a given number N is a palindrome number or not.
public class palindrome {

	public static void main(String[] args) {
		int result=0,t,sum=0,n;
		Scanner rob = new Scanner(System.in);
		System.out.println("enter number of test cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			System.out.println("enter the number");
			n = rob.nextInt();
			while(n!=0) {
			int remainder = n%10;
			sum += remainder;
			n /= 10;
			}
			int check = sum;
			while(sum!=0) {
				int rem = sum%10;
				result = (result*10)+rem;
				sum /= 10;
			}
			
			if (check == result) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
				
			}
			
		}

	}

}
