package mathsAndAlgorithm;

import java.util.Scanner;

public class UnitDigit {

	public static void main(String[] args) {
		Scanner rob = new Scanner(System.in);
        int t,n;
        System.out.println("enter no of test cases");
        t = rob.nextInt();
        for (int l=0;l<t;l++) {
        	n = rob.nextInt();
        	if (n<=10) {
        	int result=1;
        	for (int i=n;i>0;i--) {
        		result *= i;
        	}
        	System.out.println(result%10);
        	}
        	else {
        		System.out.println("0");
        	}
	
	}

}
}
