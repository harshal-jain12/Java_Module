package inheritance;

public class Emp extends Student{
	
	private int emp;
	private String company;
	private double salary;
	
	
	
	public Emp(String name, int age, char gender, int rollNo, String stream, double score, int emp, String company,
			double salary) {
		super(name, age, gender, rollNo, stream, score);
		this.emp = emp;
		this.company = company;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp [emp=" + emp + ", company=" + company + ", salary=" + salary + ", rollNo=" + rollNo + ", stream="
				+ stream + ", score=" + score + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	

}
