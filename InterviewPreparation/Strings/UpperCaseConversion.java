package Strings;

import java.util.Scanner;

public class UpperCaseConversion {

	public static void main(String[] args) {
		int t;
		String s;
		Scanner rob = new Scanner(System.in);
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
		System.out.println("enter string");
		s = rob.nextLine();
		String[] words = s.split("\\s");
		for (String w: words) {
			System.out.print(w.substring(0,1).toUpperCase()+w.substring(1)+" ");
		}

	}
	}

}
