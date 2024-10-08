package module2;
import java.util.Scanner;

public class Employee {

	private int empNo;
	private String ename;
	private double empSalary;
	
	Scanner emp = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter the Employee Number " );
		empNo = emp.nextInt();
		System.out.println("Enter the Employee Name ");
		ename = emp.next();
		System.out.println("Enter the Employee Salary ");
		empSalary = emp.nextDouble();
	}
	public void display() {
		System.out.println("Employe Number is = " +empNo);
		System.out.println("Employe Name is = "+ename);
		System.out.println("Employe Employee Salary is = "+empSalary);
	}
	public void completProject() {
		System.out.println("The Project is completed ");
	}
	public void checkAttendance() {
		System.out.println("Employe Attendance is Done ");
	}
	public void applyLoan() {
		System.out.println("Yes, You can eligible for apply loan. ");
	}
}
