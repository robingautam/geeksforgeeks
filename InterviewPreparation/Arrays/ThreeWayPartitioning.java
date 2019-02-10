package Arrays;

import java.util.Scanner;

public class ThreeWayPartitioning {

	public static void main(String[] args) {
		int n,lowValue,highValue,lowIndex=0,highIndex=0,lowFlag=0,mediumFlag=0,highFlag=0;
		Scanner rob = new Scanner(System.in);
		System.out.println("enter number");
		n = rob.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for (int i=0;i<n;i++) {
			arr[i] = rob.nextInt();
		}
		System.out.println("Enter lowValue");
		lowValue = rob.nextInt();
		System.out.println("Enter HighValue");
		highValue = rob.nextInt();
		
		for (int i=0;i<n;i++) {
			if (arr[i] == lowValue) {
				lowIndex = i;
				break;
			}
		}
		for (int i=0;i<n;i++) {
			if (arr[i] == highValue) {
				highIndex = i;
			}
		}
		for (int i=0;i<=lowIndex;i++) {
			if (arr[i]<=lowValue) {
				lowFlag=1;
			}
			else {
				lowFlag = 0;
			}
		}
		for (int i=lowIndex+1;i<=highIndex;i++) {
			if (arr[i]>=lowValue && arr[i]<=highValue) {
				mediumFlag = 1;
			}
			else {
				mediumFlag = 0;
				
			}
		}
		for (int i=highIndex+1;i<n;i++) {
			if (arr[i]>=highValue) {
				highFlag = 1;
			}
			else {
				highFlag = 0;
			}
			
		}
		if (lowFlag ==1 && highFlag==1 && mediumFlag==1) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		

	}

}
