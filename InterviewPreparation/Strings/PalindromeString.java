package Strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner rob = new Scanner(System.in);
		System.out.println("enter test cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
		String s,rev="";
	    System.out.println("Enter String");
        s = rob.next();
        int len = s.length();
        for (int i=len-1;i>=0;i--) {
        	rev = rev+s.charAt(i);
        }
        if (s.equals(rev)) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
       
		
		}
	}

}
