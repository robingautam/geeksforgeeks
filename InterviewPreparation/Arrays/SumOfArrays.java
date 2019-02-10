package Arrays;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String [] args) {
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
        		sum += arr[i];
        	}
        	System.out.println(sum);
        	
        }
    }
}
