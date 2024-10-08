package module3;
import java.util.Scanner;
public class IfDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Enter the first Number: ");
		num1 = sc.nextInt();
		System.out.println("Enter the Second Number: ");
		num2 = sc.nextInt();
		System.out.println("Enter the Third Number: ");
		num3 = sc.nextInt();
		
		if((num1 > num2) && (num1 > num3) && (num1 != 0)){
			System.out.println("First Number is Greater : "+num1);
		}
		else if((num2 > num3) && (num1 != 0)){
			System.out.println("Second Number is Greater: "+num2);
		}
		else if(num3 != 0) {
			System.out.println("Third Number is Greater: "+num3);
		}
		else {
			System.out.println("All the enter number is Zeros");
		}


	}

}
