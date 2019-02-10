package Arrays;

import java.io.BufferedReader;
import java.io.InputStream;
//import java.io.InputStream;
import java.util.Scanner;

public class AlternateElements {
	
	
	static void alternateMerge(int arr1[], int arr2[], 
			int n1, int n2, int arr3[]) 
{ 
int i = 0, j = 0, k = 0; 

while (i < n1 && j < n2) 
{ 
arr3[k++] = arr1[i++]; 
arr3[k++] = arr2[j++]; 
} 

while (i < n1) 
arr3[k++] = arr1[i++]; 

while (j < n2) 
arr3[k++] = arr2[j++]; 
} 

	public static void main(String[] args) {
		int n,m;
		//BufferedReader br = new BufferedReader(new InputStream(System.in));
		Scanner rob = new Scanner(System.in);
		System.out.println("enter n");
		n = rob.nextInt();
		System.out.println("enter m");
		m = rob.nextInt();
		int N[] = new int[n];
		int M[] = new int[m];

	     for (int i=0;i<n;i++) {
				N[i] = rob.nextInt();
		}
		for (int i=0;i<m;i++) {
			M[i] = rob.nextInt();
		}
		int temp[] = new int[n+m];
		alternateMerge(N, M, n, m, temp);
		for (int i=0;i<n+m;i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
