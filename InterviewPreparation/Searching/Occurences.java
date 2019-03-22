package Searching;

import java.util.Scanner;

public class Occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rob = new Scanner(System.in);
		int t;
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int n;
			n = rob.nextInt();
			int arr[] = new int[n];
			int k;
			int counter=0;
			k = rob.nextInt();
			for (int i=0;i<n;i++) {
				arr[i] = rob.nextInt();
			}
			for (int i=0;i<n;i++) {
				if (arr[i]==k) {
					counter++;
				}
			}
			if (counter!=0) {
			System.out.println(counter);
			}
			else {
				System.out.println("-1");
			}
		}
				

	}

}
