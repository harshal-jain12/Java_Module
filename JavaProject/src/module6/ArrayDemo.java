package module6;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[5]; //First way to declare array
//		arr[0]= 99;
//		arr[1]= 99;
//		arr[2]= 99;
//		arr[3]= 99;
//		arr[4]= 99;
		
		int arr[] = { 23, 34, 45, 56, 65};//second way of decalre array
		//int[] arr = new int[5]; //third way to declare array
		
		System.out.println("Enter 5 elemet for array");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("print the array");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		//second method for array
		System.out.println("======================");
		for(int temp: arr) {
			System.out.println(temp);
		}
		

	}

}
