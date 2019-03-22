package Searching;

import java.util.Scanner;

public class FacingtheSun {

	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		int t;
		System.out.println("Enter test cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int flag=-1;
			int counter=0;
			int n;
			n = rob.nextInt();
			int c[] = new int[n];
			for (int i=0;i<n;i++) {
				c[i] = rob.nextInt();
			}
			int max = c[0];
			for (int i=1;i<n;i++) {
				if (max<c[i]) {
        			flag++;
        			max = c[i];
        			//System.out.print(max+" ");
        			//temp[flag] = max;
        			counter++;
        		}
				
			}
			System.out.println(counter+1);
		}
	}

}
