package Searching;

import java.util.Scanner;

public class LastIndexOf1 {

	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		int t;
		System.out.println("Enter test cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int flag=0,index=0;
			String s;
			s = rob.next();
			char ch[] = s.toCharArray();
			for (int i=0;i<ch.length;i++) {
				if (ch[i]=='1') {
					flag=1;
					index = i;
				}
			}
			if (flag==1) {
				System.out.println(index);
			}
			else {
				System.out.println("-1");
			}
		}
		
	}

}
