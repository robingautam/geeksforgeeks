package Arrays;

import java.util.Scanner;

public class RotateArray {
	void leftRotate(int arr[], int d, int n) 
    { 
        for (int i = 0; i < d; i++) 
            leftRotatebyOne(arr, n); 
    } 
  
    void leftRotatebyOne(int arr[], int n) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
    } 
  
   
    void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    public static void main(String[] args) 
    { 
    	int t,n,d;
    	Scanner rob = new Scanner(System.in);
    	System.out.println("enter test cases");
    	t = rob.nextInt();
    	for (int l=0;l<t;l++) {
    		n = rob.nextInt();
    		d = rob.nextInt();
        RotateArray rotate = new RotateArray(); 
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
        	arr[i] = rob.nextInt();
        }
        rotate.leftRotate(arr, d, n); 
        rotate.printArray(arr, n); 
    	}
    } 
}
