package Strings;

import java.util.Scanner;

public class GoodOrBad {
   public static void main(String[] args) {
	   Scanner rob = new Scanner(System.in);
	   int t;
	   System.out.println("Enter test cases");
	   t = rob.nextInt();
	   for (int l=0;l<t;l++) {
		   int vow =0,cons=0;
		   String str;
		   str = rob.next();
		   for (int i=0;i<str.length();i++) {
			   if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				   vow++;
				   cons=0;
				   
			   }
			   else if (str.charAt(i) == '?') {
				   vow++;
				   cons++;
			   }
			   else {
				   cons++;
				   vow=0;
			   }
			   
		   }
		   if (vow>5 || cons>3) {
			   System.out.println("BAD");
		   }
		   else {
			   System.out.println("Good");
		   }
	   }
	  
	   
   }
}
