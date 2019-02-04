package mathsAndAlgorithm;

import java.util.Scanner;

public class AllPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rob = new Scanner(System.in);
        int t,n;
        System.out.println("enter no of test cases");
        t = rob.nextInt();
        for (int l=0;l<t;l++) {
        	int flag=0,digit=0,innerflag=0;
        	n = rob.nextInt();
        	for (int i=2;i<=n/2;i++) {
        		if (n%i==0) {
        			flag=1;
        			break;
        		}
        	}
        		if (flag==0) {
        			while(n!=0) {
        				digit++;
        				int rem = n%10;
        				for (int j=2;j<=rem/2;j++) {
        					if (rem%j==0) {
        						innerflag = 1;
        						break;
        					}
        					
        				}
        				n /= 10;
        				
        			}
        			if (innerflag ==0) {
    					System.out.println("YES");
    				}
        		}
        		else {
        			System.out.println("NO");
        		}
        	}
        	
        }

	}
