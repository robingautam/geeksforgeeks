package mathsAndAlgorithm;

import java.util.Scanner;

/**Given an array of N positive integers. 
 * Your task is to find the GCD of all numbers of the array.
 * @author robin
 *
 */


public class GCDofArray {

	public static void main(String[] args) {
		int t,n;
		Scanner rob = new Scanner(System.in);
		System.out.println("enter test cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int result=1;
			n = rob.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter array elements");
			for (int i=0;i<n;i++) {
				arr[i] = rob.nextInt();
			}
			int smallest = arr[0];
			int j=1;
			while(j<n) {
				if (arr[j]%smallest==0) {
					j++;
				}
				else {
					smallest = arr[j]%smallest;
					j++;
				}
			}
			System.out.println(smallest);
			
			
		}
		

	}

}
