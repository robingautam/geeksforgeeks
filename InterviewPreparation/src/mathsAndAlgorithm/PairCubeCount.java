package mathsAndAlgorithm;

import java.util.Scanner;

//Given N, count all ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a^3 + b^3 = N.
public class PairCubeCount {

	public static void main(String[] args) {
		int t,n;
		Scanner rob = new Scanner(System.in);
		System.out.println("Enter number of test cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int counter=0;
			n = rob.nextInt();
			for (int i=1;i<=n;i++) {
				for (int j=0;j<=n;j++) {
					if (Math.pow(i, 3)+Math.pow(j, 3)==n) {
						counter++;
					}
				}
			}
			System.out.println(counter);
		}

	}

}
