package mathsAndAlgorithm;

import java.util.Scanner;

public class LastFibonacciDigit {
	public static void main(String[] args) {
		int t;
		long n;
		Scanner rob = new Scanner(System.in);
		System.out.println("Enter test cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			long rem1=0,t1=1,t2=1,rem=0;
			n = rob.nextLong();
			rem1 = n%300;
			if (rem1==1 || rem1==2) {
				System.out.println("1");
			}
			else {
				for (int i=3;i<=rem1;i++) {
					rem = (t1+t2)%100;
					t1 = t2;
					t2 = rem;
				}
				System.out.println(rem);
			}
		}
	}

}
