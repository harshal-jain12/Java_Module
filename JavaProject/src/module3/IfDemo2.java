package module3;
import java.util.Scanner;
public class IfDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter the value for num1: ");
		num1 = sc.nextInt();
		System.out.println("Enter the value for num1: ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("Number One is Greater "+ num1);
		}
		else if(num1<num2) {
			System.out.println("Number Two is Greater "+ num2);
		}
		else {
			System.out.println("Numbers are Equal ");
		}
		
	}

}
