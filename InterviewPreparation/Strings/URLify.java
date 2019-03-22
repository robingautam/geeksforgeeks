package Strings;

import java.util.Scanner;

public class URLify {

	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		   int t;
		   System.out.println("Enter test cases");
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			   String s;
			   s = rob.nextLine();
			   int n = rob.nextInt();
			  s = s.trim();
			  s = s.replaceAll("\\s", "%20");
			  System.out.println(s);
			   
			   
		   }
		

	}

}
