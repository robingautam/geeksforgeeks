package mathsAndAlgorithm;

import java.util.Scanner;


//Convert Binary Number to Decimal Number

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		int t;
		long n;
		System.out.println("Enter number of test cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int result=0,counter=0;
			System.out.println("Enter the Binary Number");
			//n = rob.nextInt();
			n = rob.nextLong();
			while(n!=0) {
			long rem = n%10;
			result += rem*Math.pow(2, counter);
			counter++;
			n /= 10;
			}
			System.out.println(result);
		}
		

	}

}
