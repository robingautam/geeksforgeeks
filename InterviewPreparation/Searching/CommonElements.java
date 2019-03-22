package Searching;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		System.out.println("enter test cases");
		int t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int flag = 0,counter=-1;
			int n1,n2,n3;
			n1 = rob.nextInt();
			n2 = rob.nextInt();
			n3 = rob.nextInt();
			int arr1[] = new int[n1];
			int arr2[] = new int[n2];
			int arr3[] = new int[n3];
			System.out.println("1 array");
			for (int i=0;i<n1;i++) {
				arr1[i] = rob.nextInt();
			}
			System.out.println("2 array");
			for (int i=0;i<n2;i++) {
				arr2[i] = rob.nextInt();
			}
			System.out.println("3 array");
			for (int i=0;i<n3;i++) {
				arr3[i] = rob.nextInt();
			}
			int largest;
			if (n1>=n2 && n1>=n3) {
				largest = n1;
			}
			else if (n2>=n1 && n2>=n3) {
				largest = n2;
			}
			else {
				largest = n3;
			}
			int temp[] = new int[largest];
			for (int i=0;i<n1;i++) {
				int element = arr1[i];
				for (int j=0;j<n2;j++) {
					if (element==arr2[j]) {
						for (int k=0;k<n3;k++) {
							if (element == arr3[k]) {
								flag = 1;
								counter++;
								temp[counter] = element;
								
								
							}
						}
						
						
					}
					
					
				}
			}
			if (flag==0) {
				System.out.println("-1");
			}
			else {
				for (int i=0;i<=counter;i++) {
					System.out.print(temp[i]+" ");
				}
			}
		}
	}

}
