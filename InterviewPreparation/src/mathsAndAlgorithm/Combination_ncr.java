package mathsAndAlgorithm;

import java.math.BigInteger;
import java.util.Scanner;

public class Combination_ncr {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r;
		int t;
		Scanner s=new Scanner(System.in);
		//System.out.println(“Enter number : ”);
		System.out.println("enter test cases");
		t = s.nextInt();
		for (int l=0;l<t;l++) {
			//int numeratorFact=1,denFact=1;
			//BigInteger numeratorFact,denFact;
			BigInteger numeratorFact = BigInteger.ONE;
			BigInteger denFact = BigInteger.ONE;
			n = s.nextInt();
			r = s.nextInt();
			int diff = (n-r);
			int max = diff>r?diff:r;
			int min = diff>r?r:diff;
			
			for (int i=n;i>max;i--) {
				numeratorFact *= i;
			}
			for (int j=min;j>1;j--) {
				denFact *= j;
			}
			lo result = numeratorFact/denFact;
			System.out.println(result);
			
		}

	}*/

}
