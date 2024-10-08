package abassignments;

import java.util.Scanner;

public class Assignment2 {
public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	
	try {
		System.out.println("Enter a size for array");
		int n= sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a elements");
		
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter a index to get element");
	int m=sc.nextInt();
	System.out.println(arr[m]);
	}catch(Exception e) {
		System.out.println("Index not present");
	}
}
}
