package mathsAndAlgorithm;

import java.util.Scanner;

public class PimeNumber {

		public static void main(String[] args)
		{
		int n,p;
		int t;
		Scanner s=new Scanner(System.in);
		//System.out.println(“Enter number : ”);
		System.out.println("enter test cases");
		t = s.nextInt();
		for (int l=0;l<t;l++) {
			int result=0;
		  n=s.nextInt();
		for(int i=2;i<=n;i++)
		{
		p=0;
		for(int j=2;j<i;j++)
		{
		if(i%j==0)
		p=1;
		}
		if(p==0){
		//System.out.println(i);
			result += i;
		}
		}
		System.out.println(result);
		}
		}
		
	}
