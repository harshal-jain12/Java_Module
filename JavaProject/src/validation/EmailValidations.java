package validation;
import java.util.Scanner;
public class EmailValidations {

	public void checkEmail(String email) {
		
		int a = email.indexOf("@"); //return position of @"
		int d = email.lastIndexOf("."); //return position of .
		System.out.println(a);
		System.out.println(d);
		
		if(a > -1 && d > -1 && a < d) {
			System.out.println("Email is valid");
		}
		else {
			System.out.println("Invalid email id");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		EmailValidations emailValidations = new EmailValidations();
		System.out.println("Enter your email id ");
		String email = sc.next();
		emailValidations.checkEmail(email);

	}

}
