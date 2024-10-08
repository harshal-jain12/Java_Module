package module4;
import java.util.Scanner;
public class Emp {
	private int empNo;
	private String ename;
	private double bal;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter the EmpNo: ");
		empNo = sc.nextInt();
		System.out.println("Enter the Emp Name ");
		ename = sc.next();
		System.out.println("Enter the Balance: ");
		bal = sc.nextDouble();
	}
	public void checkEmpNo() {
		if(empNo > 0)
			System.out.println(" Valid Emplyee");
		else
			System.out.println("Invalid Emplyee No");
	}
	
	public void cehckBal() {
		if(bal > 0 & bal< 10000) 
			System.out.println("Valid Balance");
		else 
			System.out.println("Invalid Balance");
	}
}
































































































