package Arrays;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t,n;
    	Scanner rob = new Scanner(System.in);
        System.out.println("Enter number of test cases");
        t = rob.nextInt();
        for (int l=0;l<t;l++) {
        	int sum=0;
        	n = rob.nextInt();
        	int arr[] = new int[n];
        	System.out.println("Enter array elements");
        	for (int i=0;i<n;i++) {
        		arr[i] = rob.nextInt();
        	}
        	for (int i=0;i<n;i++) {
        		for (int j=i;j<n;j++) {
        			if (arr[i]!=arr[j]) {
        				
        			}
        		}
        	}
        }
		
	}

}
