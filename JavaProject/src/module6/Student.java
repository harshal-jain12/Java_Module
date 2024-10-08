package module6;

public class Student {

	private int rollno;
	private String name;
	private float score;

	public Student() {
		//System.out.println("This is default constructor.");		
		rollno = 0;
		name = " ";
		score = 0;
		
	}
	

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	
	public Student(int rollno, String name, float score) {
		System.out.println("This is prameterized constructor.");
		this.rollno = rollno;
		this.name = name;
		this.score = score;
	}

	public void display() {
		System.out.println("Roll no is " + rollno);
		System.out.println("Name is = " + name);
		System.out.println("Score = " + score);
	}

	public void markAttendence() {
		System.out.println("This is markAttendence");
	}
}
