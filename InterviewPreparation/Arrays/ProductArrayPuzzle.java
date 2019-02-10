package Arrays;

import java.util.Scanner;

public class ProductArrayPuzzle {

	public static void main(String[] args) {
		int t,n;
    	Scanner rob = new Scanner(System.in);
        System.out.println("Enter number of test cases");
        t = rob.nextInt();
        for (int l=0;l<t;l++) {
        	int flag=-1;
        	n = rob.nextInt();
        	int arr[] = new int[n];
        	int temp[] = new int[n];
        	System.out.println("Enter array elements");
        	for (int i=0;i<n;i++) {
        		arr[i] = rob.nextInt();
        	}
        }

	}

}
