package module2;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		System.out.println("\nCalling the methods");
		student.accept();
		student.display();
		student.apperExam();
		student.attendClass();
		student.competeAsignment();
		System.out.println("=============================");
		
		System.out.println("\nSecond Object");
		Student student1 = new Student();
		student1.accept();
		student1.display();
		student1.apperExam();
		student1.attendClass();
		student1.competeAsignment();
		System.out.println("=============================");
		
		System.out.println("\nThird Object");
		Student student2 = new Student();
		student2.accept();
		student2.display();
		student2.apperExam();
		student2.attendClass();
		student2.competeAsignment();
		
		

	}

}
