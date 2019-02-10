package Arrays;

import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		int t;
		int n;
		Scanner rob = new Scanner(System.in);
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
		System.out.println("enter number");
		n = rob.nextInt();
		int max=0;
		int min=0;
		int arr[] = new int[n];
		for (int i=0;i<n;i++) {
			arr[i] = rob.nextInt();
		}
		for (int i=1;i<n-1;i++) {
			if (arr[i]>arr[i+1] && arr[i]>arr[i-1]) {
				max++;
			}
			if (arr[i]<arr[i+1] && arr[i]<arr[i-1]) {
				min++;
			}
		}
		System.out.print(max+" "+min);
	}
	}

}
