package module1;
import module2.Employee;
public class TestEmp {

	//The Employee Class is created in Module 2 Please check it
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.accept();
		emp.display();
		emp.checkAttendance();
		emp.applyLoan();
		emp.completProject();
	}

}
