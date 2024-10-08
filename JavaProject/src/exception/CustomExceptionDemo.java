package exception;
import java.util.Scanner;

class CheckPassword extends Exception {

	public CheckPassword(String msg) {
		super(msg); //calling parent class constructor
	}
}


public class CustomExceptionDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.next();
		
		try {
			
			if(password.length() < 8) 
				throw new CheckPassword("Password length should be more than 8 ch. ");
				// 			anonymous obj is created
				// to check pattern matching
				else if(password.matches("[A-Za-z0-9 ]*"))
					throw new CheckPassword("Password should have spcecial characters. ");
				else
					System.out.println("Valid Password");
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
