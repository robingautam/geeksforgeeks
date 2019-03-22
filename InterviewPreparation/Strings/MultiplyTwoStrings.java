package Strings;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyTwoStrings {

	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		   int t;
		   System.out.println("Enter test cases");
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			   BigInteger ans;
			   String str1,str2;
			   str1 = rob.next();
			   str2 = rob.next();
			   BigInteger num1 = new BigInteger(str1);
			   BigInteger num2 = new BigInteger(str2);
			   //System.out.println(num1.multiply(num2));
			    ans = num1.multiply(num2);
			   String str = ans.toString();
			   System.out.println(str);
			  
	}
	}
}
