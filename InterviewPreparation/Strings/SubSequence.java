package Strings;

import java.util.Scanner;

public class SubSequence {
	static boolean isSubSequence(String str1,  
            String str2, int m, int n) 
{ 
int j = 0; 
  

for (int i = 0; i < n && j < m; i++) 
    if (str1.charAt(j) == str2.charAt(i)) 
        j++; 


return (j == m);  
} 
	
	
	public static void main(String[] args) {
		String a,b;
		int t;
		Scanner rob = new Scanner(System.in);
		System.out.println("Enter number of Test Cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
		System.out.println("enter string");
		a = rob.next();
		System.out.println("Enter sub string");
		b = rob.next();
		int m = a.length(); 
        int n = b.length(); 
        boolean res = isSubSequence(a, b, m, n);
        if(res) 
            System.out.println("1"); 
        else
            System.out.println("0"); 
		
		
	}
	}

}
