package module3;
import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num =sc.nextInt();
		if(num > 0) {
			System.out.println("Number is Positive: ");
		}
		else if(num == 0) {
			System.out.println("Number is Zero: ");
		}
		else {
			System.out.println("Number is Negative : ");
		}

	}

}
