package mathsAndAlgorithm;

import java.util.Scanner;

public class ReverseDigit {
	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		int t,n;
		System.out.println("Enter Test Cases:");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int result=0;
			n = rob.nextInt();
			while(n!=0) {
				int rem = n%10;
				result = (result*10)+rem;
				n /= 10;
			}
			System.out.println(result);
		}

	}

}
