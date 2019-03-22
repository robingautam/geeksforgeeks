package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rob = new Scanner(System.in);
		   int t;
		   System.out.println("Enter test cases");
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			   BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			   String str;
			   str = rob.next();
			   char ch[] = str.toCharArray();
			   Arrays.sort(ch);
			   for (int i=ch.length-1;i>=0;i--) {
				   System.out.println(ch[i]);
			   }
		   }
	}
}
