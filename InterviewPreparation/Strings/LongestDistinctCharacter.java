package Strings;

import java.util.Scanner;

public class LongestDistinctCharacter {
       
	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		   int t;
		   System.out.println("Enter test cases");
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			   int max=0;
			   String str;
			   str = rob.next();
			  // char ch[] = str.toCharArray();
			   for (int i=0;i<str.length();i++) {
				   int counter=0;
				   for (int j=i+1;j<str.length();j++) {
					   if (str.charAt(i)!=str.charAt(j)) {
						   counter++;
						  // break;
					   }
					   
				   }
				   if (counter>	max) {
					max = counter;   
				   }
			   }
			   System.out.println(max);
			   
	
}   
	}
}