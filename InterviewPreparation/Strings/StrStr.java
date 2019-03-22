package Strings;

import java.util.Scanner;

public class StrStr {

	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		   int t;
		   System.out.println("Enter test cases");
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			   String str,text;
			   str = rob.next();
			   text = rob.next();
			   int i=0,j=0,counter=0;
			   while(i<str.length() && j<text.length()) {
				   if (str.charAt(i) == text.charAt(j)) {
					   i++;
					   j++;
					   counter++;
				   }
				   else {
					   i++;
					   counter=0;
					   j=0;
				   }
				   if (counter == text.length()) {
					   System.out.println(i-text.length());
					   break;
				   }
			   }
			   if (counter!=text.length()) {
				   System.out.println("-1");
			   }
			   
			   
		   }

	}

}
