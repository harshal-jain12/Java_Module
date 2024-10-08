package module2;
import java.util.Scanner; //1

public class Student {
	private int rollno;
	private String name;
	private double score;
	
	Scanner sc = new Scanner(System.in);//2
	public void accept() {
		System.out.println("Enter the RollN0 ");
		rollno = sc.nextInt();
		System.out.println("Enter the Name ");
		name = sc.next();
		System.out.println("Enter the Score ");
		score = sc.nextDouble();
	}
	public void attendClass() {
		System.out.println("attending the class");
	}
	public void apperExam() {
		System.out.println("appearing for the exam");
	}
	public void competeAsignment() {
		System.out.println("competeAssignment");
	}
	public void display() {
		System.out.println("Roll is "+rollno);
		System.out.println("Name "+name);
		System.out.println("Score "+score);
	}

}
