package mathsAndAlgorithm;

import java.util.Scanner;

public class LargestPrimeFactor {
	void sieveOfEratosthenes(int n) 
    { 
		int result=0;
        // Create a boolean array "prime[0..n]" and initialize 
        // all entries it as true. A value in prime[i] will 
        // finally be false if i is Not a prime, else true. 
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
          
        // Print all prime numbers 
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true) 
                //System.out.print(i + " "); 
            	if (n%i==0) {
            		result=i;
            	}
        } 
        System.out.println(result);
    } 
	
	public static void main(String[] args)
	{
		int n,t; 
		Scanner rob = new Scanner(System.in);
		System.out.println("Enter number of Test Cases");
		t = rob.nextInt();
		for (int l=0;l<t;l++) {
			n = rob.nextInt();
        LargestPrimeFactor g = new LargestPrimeFactor(); 
        g.sieveOfEratosthenes(n);    
		}
		
		    
	 
	}
	}
