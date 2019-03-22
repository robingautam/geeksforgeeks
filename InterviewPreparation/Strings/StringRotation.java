package Strings;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class StringRotation {

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
			   String str3 = str1+str2;
			   if (str3.contains(str2)) {
				   System.out.println("1");
			   }
			   else {
				   System.out.println("0");
			   }
			  
		   }

	}

}
