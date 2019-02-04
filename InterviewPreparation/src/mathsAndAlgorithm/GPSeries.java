package mathsAndAlgorithm;

import java.util.Scanner;

public class GPSeries {
   public static void main(String[] args) {
	   int t;
	   float a,b,n;
	   System.out.println("Enter no of test cases");
	   Scanner rob = new Scanner(System.in);
	   t = rob.nextInt();
	   for (int l=0;l<t;l++) {
		   float result=0;
		   a = rob.nextFloat();
		   b = rob.nextFloat();
		   n = rob.nextFloat();
		   float r = b/a;
		   result =  (float)(a*Math.pow(r, n-1));
		   System.out.println((int)result);
	   }
	   //int finalResult = Math.ceil(result);
	   
	  
   }
}
