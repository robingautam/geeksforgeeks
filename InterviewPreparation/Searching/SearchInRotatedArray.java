package Searching;

import java.util.Scanner;

public class SearchInRotatedArray {
	
	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		int t;
		System.out.println("Enter test cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int flag=0,index=0;
			int n,k;
			n = rob.nextInt();
			int arr[] = new int[n];
			for (int i=0;i<n;i++) {
				arr[i] = rob.nextInt();
			}
			k = rob.nextInt();
			for (int i=0;i<n;i++) {
				if (arr[i]==k) {
					flag=1;
					index = i;
				}
			}
			if (flag!=0) {
				System.out.println(index);
			}
			else {
				System.out.println("-1");
			}
			
		}
	}

}
