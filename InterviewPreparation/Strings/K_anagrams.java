package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class K_anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rob = new Scanner(System.in);
		   int t;
		   System.out.println("Enter test cases");
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			   int flag=0,counter=0;
			   int k;
			   String str1,str2;
			   str1 = rob.next();
			   str2 = rob.next();
			   k = rob.nextInt();
			   if (str1.length()!=str2.length()) {
				   System.out.println("NO");
			   }
			   else {
				   char[] ch1 = str1.toCharArray();
				   char[] ch2 = str2.toCharArray();
				    Arrays.sort(ch1);
				    Arrays.sort(ch2);
				    for (int i=0;i<str1.length();i++) {
				    	if (ch1[i]!=ch2[i]) {
				    		flag=1;
				    		counter++;
				    	}
				    }
				    if (flag==0 || counter==k ) {
				    	System.out.println("1");
				    }
				    else {
				    	System.out.println("0");
				    }
				   
			   }

	}

}
}
