package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
//	private int[] arr= {2, 3, 6, 5, 4};
	Scanner sc = new Scanner(System.in);
	
	private int n;
	private int arr[] = new int[n];
	private int start = 0;
	//private int end = n-1;
	
	
	public void set() {
		System.out.println("Enter the size of array: ");
		n = sc.nextInt();
		//System.out.println(n);
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the array element "+ i +" = ");
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
		}
	}
	
	
}
