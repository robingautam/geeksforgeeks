package mathsAndAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t;
		long n;
		//Scanner s=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("enter test cases");
		t = Integer.parseInt(br.readLine()); 
		//t = s.nextInt();
		for (int l=0;l<t;l++) {
			int result=0;
			//n = s.nextInt();
			n = Long.parseLong(br.readLine());
			for (int i=1;i<=n/2;i++) {
				if (n%i==0) {
					result+=i;
				}
			}
			 StringBuffer sb = new StringBuffer(); 
			 
			if (result==n) {
				sb.append("1");
				System.out.println(sb);
			}
			else {
				sb.append("0");
				System.out.println(sb);
			}
		}
	}

}
