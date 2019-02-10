package Arrays;

import java.util.Scanner;

public class LeaderInArray {

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
        	int max = arr[n-1];
        	int max1 = arr[n-1];
        	//System.out.print(max+" ");
        	for (int i=n-2;i>=0;i--) {
        		if (max<arr[i]) {
        			flag++;
        			max = arr[i];
        			//System.out.print(max+" ");
        			temp[flag] = max;
        		}
        	}
        	for (int i=flag;i>=0;i--) {
        		System.out.print(temp[i]+" ");
        	}
        	System.out.print(max1);
        	
        	
        }

	}

}
