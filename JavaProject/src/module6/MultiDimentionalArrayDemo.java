package module6;

import java.util.Scanner;

public class MultiDimentionalArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int [2][2];
				
		System.out.println("Enter 2 elemet for array");
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("print the array");
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(arr[i][j]+"\t\t");
			}
			System.out.println();
		}
		
		
//		//second method for array
//		System.out.println("======================");
//		for(int temp: arr[][]) {
//			System.out.println(temp);
//		}
//		
		

	}

}
