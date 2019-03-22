package Strings;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c,m;
		System.out.println("Enter N");
		Scanner rob = new Scanner(System.in);	
		n = rob.nextInt();
		System.out.println("Enter C");
		c = rob.nextInt();
		System.out.println("Enter M");
		m = rob.nextInt();
		int totalChoc = n/c;
		int totalWrappers = totalChoc;
		int freeChoc = 0;
		while(m<=totalWrappers) {
			totalWrappers = totalWrappers-m;
			totalChoc++;
			totalWrappers++;
		}
		System.out.println(totalChoc);
		

	}

}
