package assignment1;
import java.util.Scanner;
/*(Assignment 1: Validating Age and Income
Write a program that checks if a person is eligible 
for a loan based on their age and income.
Requirements:
•    A person is eligible if their age is between 18 and 60 
and their income is above $25,000.
•    Use logical && to combine these conditions.
*/
public class ValidateAge {
	private int age;
	private float income;
	Scanner sc = new Scanner(System.in);
	
	public void set() {
		System.out.println("Enter the Age : ");
		age = sc.nextInt();
		System.out.println("Enter the Income: ");
		income = sc.nextFloat();
	}
	
	public void checkAge() {
		if(age > 17 && age < 61 ) {
			System.out.println("Age is valid For Loan: ");
		}
		else {
			System.out.println("Not Valid Age: ");
		}
	}
	public void checkIncome() {
		if(income >= 25000)
			System.out.println("Valid income for Loan: ");
		else
			System.out.println("Not a valid income");
	}
	public void display() {
		System.out.println("Age is  = " +age);
		System.out.println("Income is = " +income);
	}
	
	

}
