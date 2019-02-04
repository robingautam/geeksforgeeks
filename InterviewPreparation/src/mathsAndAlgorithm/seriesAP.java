package mathsAndAlgorithm;

import java.util.Scanner;

public class seriesAP {
	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		int first,second,t,n;
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			first = rob.nextInt();
			second = rob.nextInt();
			n = rob.nextInt();
			int diff = second-first;
			int number = first+(n-1)*diff;
			System.out.println(number);
		}
	}

}
