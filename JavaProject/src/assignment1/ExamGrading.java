package assignment1;
import java.util.Scanner;
/*Assignment 2: Exam Grading System
Write a program that determines whether a student passes
 an exam based on three subjects. A student passes if the 
 average score is at least 60, and none of the individual
  scores is below 40.
Requirements:
•    Use logical operators && and || to combine conditions.
*/

public class ExamGrading {
	private int s1, s2, s3;
	private float avg;
	
	Scanner sc = new Scanner(System.in);
	
	public void set() {
		System.out.println("Enter the First Subject Mark: ");
		s1 = sc.nextInt();
		System.out.println("Enter the Second Subject Mark: ");
		s2 = sc.nextInt();
		System.out.println("Enter the Third Subject Mark: ");
		s3 = sc.nextInt();
	}
	
	public void checkAverage() {
		avg = (s1 + s2 + s3)/3;
		if(avg >= 60 && s1 > 40 && s2>40 && s3>40)
			System.out.println("Student is Passed the Examinations.");
		else
			System.out.println("Congratulations your are Fail. !!Try Again!!");
	}
	public void show() {
		System.out.println("First Subject Mark = "+s1);
		System.out.println("Second Subject Mark = "+s2);
		System.out.println("Third Subject Mark = "+s3);
		System.out.println("Average of Subjects Marks Is = "+avg);
	}

}
