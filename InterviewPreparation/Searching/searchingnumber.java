package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class searchingnumber {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//Scanner rob = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter test cases");
		 int t = Integer.parseInt(br.readLine()); 
		for (int l=0;l<t;l++) {
			int n;
			 n = Integer.parseInt(br.readLine()); 
			int arr[] = new int[n];
			int k;
			int counter=0,index=0;
			 k = Integer.parseInt(br.readLine()); 
			for (int i=0;i<n;i++) {
				 arr[i] = Integer.parseInt(br.readLine()); 
			}
			for (int i=0;i<n;i++) {
				if (arr[i]==k) {
					counter++;
					index = i;
					break;
				}
			}
			if (counter!=0) {
				System.out.println(index+1);
			}
			else {
				System.out.println("-1");
			}
		}
				

	}

}
