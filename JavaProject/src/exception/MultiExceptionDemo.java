package exception;
import java.util.Scanner;

public class MultiExceptionDemo {
	
	public static double divide(int num, int num2) {
		return num / num2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 values");
		String str = sc.next();
		String str1 = sc.next();
		
		try {
			
			int num1 = Integer.parseInt(str);
			int num2 = Integer.parseInt(str1);
			
			double result = divide ( num1, num2);
			System.out.println("result is " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("We can not divide any number by 0 ..");
		}
		catch(NumberFormatException e) {
			System.out.println("The value expected is number and not string");
		}
		catch(Exception e ) {
			System.out.println("Error: There is an erro");//generalized exception
		}
		finally {
			System.out.println("This is finally block........");


		}
		
	}

}
