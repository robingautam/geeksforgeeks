package Arrays;

import java.util.Scanner;

public class countSmallerElements {

	public static void main(String[] args) {
		int t,n;
    	Scanner rob = new Scanner(System.in);
        System.out.println("Enter number of test cases");
        t = rob.nextInt();
        for (int l=0;l<t;l++) {
        	n = rob.nextInt();
        	int arr[] = new int[n];
        	System.out.println("Enter array elements");
        	for (int i=0;i<n;i++) {
        		arr[i] = rob.nextInt();
        	}
        	for (int i=0;i<n;i++) {
        		int counter=0;
        		for (int j=i+1;j<n;j++) {
        			if (arr[i]>arr[j]) {
        				counter++;
        			}
        		}
        		System.out.print(counter+" ");
        	}
        	
        }
	}

}
