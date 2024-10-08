package module6;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		System.out.println("This is default constructor");
		System.out.println("Enter rollno, name , score");
		int rollno = sc.nextInt();
		String name = sc.next();
		float score = sc.nextFloat();
		sc.close();

		Student student1 = new Student();
		student1.setRollno(rollno);
		student1.setName(name);
		student1.setScore(score);	
		
//		student1.display();
		
		System.out.println("Display the details........");
		System.out.println("RollNo is "+ student1.getRollno());
		System.out.println("name is " + student1.getName());
		System.out.println("Score is " + student1.getScore());
		
		student1.markAttendence();
		
		System.out.println("==============================");
		System.out.println("Second Consturctur with parametrized construector");
		
		Student student2 = new Student(22, "Harshal", 78);
		System.out.println("RollNo is "+ student2.getRollno());
		System.out.println("name is " + student2.getName());
		System.out.println("Score is " + student2.getScore());
		System.out.println("===========================");
		
		System.out.println("Enter the new name");
		String name1 = sc.next();
		student2.setName(name1);
		System.out.println("New name is " + student2.getName());
		


	}

}
