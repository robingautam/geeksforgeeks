package Strings;

import java.util.Scanner;

public class RepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner rob = new Scanner(System.in);
		System.out.println("enter string");
		s = rob.next();
		for (int i=0;i<s.length();i++) {
			char ch = 0;
			for (int j=i+1;j<s.length();j++) {
				if (s.charAt(i)== s.charAt(j)) {
					 ch = s.charAt(i);
					break;
				}
			}
			System.out.println(ch);
			break;
		}
		

	}

}
