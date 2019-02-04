package mathsAndAlgorithm;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		int t,n;
		Scanner rob = new Scanner(System.in);
		System.out.println("Enter Test Case:");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
									
			n = rob.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter array elements");
			for (int k=0;k<n;k++) {
				arr[k] = rob.nextInt();
			}
			for (int i=0;i<arr.length;i++) {
				int counter=0;
				int element = arr[i];
				for (int j=1;j<=element;j++) {
					if (element%j==0) {
						counter++;
					}
					/*if (counter==3) {
						System.out.println(element);
					}*/
					
				}
				//System.out.println(counter);
				if (counter==3) {
					//System.out.println(element);
				}
			}
		}
	}

}
