package module2;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		System.out.println("First Object ");
		employee.accept();
		employee.display();
		employee.completProject();
		employee.checkAttendance();
		employee.applyLoan();
		System.out.println("===========================");
		
		System.out.println("Second Object ");
		employee.accept();
		employee.display();
		employee.completProject();
		employee.checkAttendance();
		employee.applyLoan();
		System.out.println("===========================");
		
		System.out.println("Third Object ");
		employee.accept();
		employee.display();
		employee.completProject();
		employee.checkAttendance();
		employee.applyLoan();
		System.out.println("===========================");

	}

}
