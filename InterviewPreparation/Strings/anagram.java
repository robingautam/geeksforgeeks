package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		   int t;
		   System.out.println("Enter test cases");
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			   int flag=0;
			   String str1,str2;
			   str1 = rob.next();
			   str2 = rob.next();
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
				    	}
				    }
				    if (flag==1) {
				    	System.out.println("NO");
				    }
				    else {
				    	System.out.println("YEs");
				    }
			   }
			   
			   

	}

}
}