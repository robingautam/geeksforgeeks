package Strings;

import java.util.Scanner;

public class MergeTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rob = new Scanner(System.in);
		   int t;
		   System.out.println("Enter test cases");
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			   int vow =0,cons=0;
			   String str1,str2;
			   str1 = rob.next();
			   str2 = rob.next();
			   char[] ch1 = str1.toCharArray();
			   char[] ch2 = str2.toCharArray();
			   char[] ch3 = new char[str1.length()+str2.length()];
			   int i=0,j=0,k=0;
			   while(i<str1.length() && j<str2.length()) {
				   ch3[k++] = ch1[i++];
				   ch3[k++] = ch2[j++];
			   }
			   while(i<str1.length()) {
				   ch3[k++] = ch1[i++];
			   }
			   while(j<str2.length()) {
				   ch3[k++] = ch2[j++];
			   }
			   for (int m=0;m<ch3.length;m++) {
				   System.out.println(ch3[i]);
			   }

	}

}
}
