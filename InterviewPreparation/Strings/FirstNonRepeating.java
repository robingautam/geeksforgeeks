package Strings;

import java.util.Scanner;

public class FirstNonRepeating {
	 static final int NO_OF_CHARS = 256; 
	    static char count[] = new char[NO_OF_CHARS]; 
	    
	    static void getCharCountArray(String str)  
	     { 
	    	int i=0;
	         for ( i = 0; i < str.length();  i++) 
	              count[str.charAt(i)]++; 
	     } 
	    
	    static int firstNonRepeating(String str) 
	    { 
	        getCharCountArray(str); 
	        int index = -1, i=0; 
	       
	        for (i = 0; i < str.length();  i++) 
	        { 
	            if (count[str.charAt(i)] == 1) 
	            { 
	                index = i; 
	                break; 
	            }    
	        }   
	        
	      return index; 
	    } 
	    

	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
		   int t;
		   System.out.println("Enter test cases");
		   t = rob.nextInt();
		   for (int l=0;l<t;l++) {
			   int length;
			   String str=null;
			   length = rob.nextInt();
			   str = rob.next();
			   int index =  firstNonRepeating(str); 
			   if (index!=-1) {
			   System.out.println(str.charAt(index));
			   }
			   else {
				   System.out.println("-1");
			   }
			

}
	}
}
