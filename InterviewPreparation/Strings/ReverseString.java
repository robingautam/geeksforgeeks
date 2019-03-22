package Strings;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		   int t;
		   System.out.println("Enter test cases");
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			   String str;
			   str = rob.next();
			   String s[]= str.split(".");
			   String ans="";
			   for (int i=s.length-1;i>=0;i--) {
				  // System.out.print(s[i]+".");
				   ans+=s[i]+".";
			   }
			   
		 

}
	}
}
