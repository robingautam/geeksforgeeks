package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
	 void swap(int arr[], int a, int b) 
	    { 
	        int temp = arr[a]; 
	        arr[a] = arr[b]; 
	        arr[b] = temp; 
	    } 
	  
	    void sortInWave(int arr[], int n) 
	    { 
	      
	        Arrays.sort(arr); 
	  
	        for (int i=0; i<n-1; i += 2) 
	            swap(arr, i, i+1); 
	    } 
	    public static void main(String[] args) {
	    	   int t,n;
	    	   Scanner rob = new Scanner(System.in);
	    	   System.out.println("enter number of test cases");
	    	   t = rob.nextInt();
	    	   for (int l=0;l<t;l++){
	    	       n = rob.nextInt();
	    	       int arr[] = new int[n];
	    	       for (int i=0;i<n;i++){
	    	           arr[i] = rob.nextInt();
	    	       }
	    	       WaveArray ob = new WaveArray();
	    	       int len = arr.length; 
	               ob.sortInWave(arr, len); 
	                for (int i : arr) {
	                System.out.print(i + " "); 
	                }
	    	   }
	    }

}
