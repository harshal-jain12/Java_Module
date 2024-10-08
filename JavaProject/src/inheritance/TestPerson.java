package inheritance;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("Surabh", 25, 'M');
		System.out.println(person); //we call toString method
		person.display();
		person.fun1();
		
		System.out.println("============================");
		Student student = new Student("Ram", 23, 'M', 25, "Cs", 23.02);
		System.out.println(student);
		student.disply();
		System.out.println("============================");
		Emp emp = new Emp("ram", 25, 'm', 56, "it", 25.20, 45, "raman", 99.08);
		System.out.println(emp);
		emp.disply();
		emp.display();
		emp.fun1();

	}

}
