package exception;
import java.util.Scanner;

public class SingleExeption {

	public static double divide(int num, int num2) {
		return num / num2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the 2 numbers ");
			int num = sc.nextInt();
			int num2 = sc.nextInt();
			double result = divide(num, num2);
			System.out.println("result is " + result);		
		}catch(ArithmeticException e) {
			System.out.println("We can not 10 " + "divede any number by 0..........\n"); //first way to print message
			System.out.println("\n"+e.getMessage()); //second way to print massage
			e.printStackTrace();//third
			System.out.println("\n" + e);//third way to print message
		
		}

	}

}
