package mathsAndAlgorithm;

import java.util.Scanner;
import java.util.Stack;

public class practice {
	/*static long evenFib(int n) 
	{ 
	    if (n < 1) 
	    return n; 
	  
	    if (n == 1)  
	    return 2; 
	  
	    // calculation of  
	    // Fn = 4*(Fn-1) + Fn-2 
	    return ((4 * evenFib(n-1)) +  
	                 evenFib(n-2));  
	} 

	public static void main(String[] args) {
		//int n = 5; 
		int t,n;
		Scanner rob = new Scanner(System.in);
		System.out.println("Enter Test Case:");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			n = rob.nextInt();
			System.out.println(evenFib(n)); 
		}*/
	/*public static void main(String[] args) {
		int t,n;
		Scanner rob = new Scanner(System.in);
		System.out.println("Enter Test Case:");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int fact=1;
			n = rob.nextInt();
			for (int i=n;i>1;i--) {
				fact *= i;
			}
			System.out.println(fact%10);
		}
	}*/
	public static void main(String[] args) {
		int t,n;
		Scanner rob = new Scanner(System.in);
		System.out.println("Enter Test Case:");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			int mult=1;
			n = rob.nextInt();
			if (n>=1 && n<=9) {
				System.out.println(n);
			}
			else {
				Stack<Integer> stack = new Stack<>();
				for (int i=9;i>=2 && n>1;i--) {
					while(n%i==0) {
						stack.push(i);
						n /= i;
						
					}
				}
				long k=0;
				while(!stack.empty()) {
					k = k*10+stack.peek();
					stack.pop();
				}
				System.out.println(k);
				
			}
		}
	
	
	   
	} 
	
}

