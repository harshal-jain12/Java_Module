package module3;

import java.util.Scanner;

public class IfDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Enter the first Number: ");
		num1 = sc.nextInt();
		sc.close();
	
		
		if((num1 != 0) && (num1 < 9 && num1 >0)){
			System.out.println("Number is One digits : "+num1);
		}
		else if((num1 < 99 && num1 >9)){
			System.out.println("Two Digit number: "+num1);
		}
		else if((num1 < 999 && num1 >99)) {
			System.out.println("Three digit number: "+num1);
		}
		else if((num1 < 9999 && num1 >999)){
			System.out.println("Four digit number  or above");
		}
		
	}

}
