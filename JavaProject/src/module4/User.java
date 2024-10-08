package module4;
import java.util.Scanner;
public class User {
	private String name;
	private int age;
	private float salary;
	
	Scanner sc = new Scanner(System.in);
	public void accept() {
		System.out.println("Enter the name: ");
		name = sc.next();
		System.out.println("Enter the Age: ");
		age = sc.nextInt();
		System.out.println("Enter the Salary: ");
		salary = sc.nextFloat();
	}
	public void checkAge() {
		if(age == 18)
			System.out.println("Valid for vote");
		else if(age > 18 && age < 120)
			System.out.println("Valid age");
		else
			System.out.println("Not Valid Age:");
	}
	public void checkSalary() {
		if(salary > 3000 && salary <100000)
			System.out.println("Valid Salary");
		else
			System.out.println("Invalid Salary");
	}
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
	}
}
