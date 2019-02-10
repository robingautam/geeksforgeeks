package Arrays;

import java.util.Scanner;

/**To find the Minimum and Maximum Element in array
 * @author robin**/

public class MinAndMax {

	public static void main(String[] args) {
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
        	int min = arr[0];
        	int max = arr[0];
        	for (int i=0;i<n;i++) {
        		if (min>arr[i]) {
        			min = arr[i];
        		}
        	}
        	for (int i=0;i<n;i++) {
        		if (max<arr[i]) {
        			max = arr[i];
        		}
        	}
        	System.out.println(min+" "+max);
        	
        }

	}

}
