package module3;

import java.util.Scanner;

public class IfDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp, result;
		System.out.println("Enter the the number: ");
		int num = sc.nextInt();
		System.out.println(num);
		
		temp = num % 10;
		num = num / 10;
		
		if(num != 0 && num > 9) {
			result = num;
		}
		

	}

}
