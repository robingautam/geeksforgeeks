package Searching;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		int t;
		System.out.println("Enter test cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int n;
			n = rob.nextInt();
			int c[] = new int[n-1];
			for (int i=0;i<n-1;i++) {
				c[i] = rob.nextInt(); 
			}
			int number=0;
			for (int i=0;i<n-1;i++) {
				if (i+1!=c[i]) {
					number = i+1;
				}
			}
			System.out.println(number);
			
			
			
		}
		}

	}
