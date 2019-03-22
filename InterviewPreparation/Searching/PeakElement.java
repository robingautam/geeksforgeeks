package Searching;

import java.util.Scanner;

public class PeakElement {
   public static void main(String[] args) {
	   Scanner rob = new Scanner(System.in);
		System.out.println("enter test cases");
		int t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int n;
			int index = 0,flag=0;
			n = rob.nextInt();
			int arr[] = new int[n];
			for (int i=0;i<n;i++) {
				arr[i] = rob.nextInt();
			}
			if (arr[0]>arr[1]) {
				//System.out.println("1");
				index = 1;
				flag= 1;
			}
			else if (arr[n-1]>arr[n-2]) {
				//System.out.println("1");
				index = 1;
				flag= 1;
			}
			else {
				for (int i=1;i<n;i++) {
					if (arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
						index = 1;
						flag= 1;
					}
				}
			}
			if (flag!=0) {
				System.out.println(index);
			}
			else {
				System.out.println("not ");
			}
		}
   }
}
