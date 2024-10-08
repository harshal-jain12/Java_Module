package module7;

class Stream{
	
	private String type;
	private int fees;
	private int noOfStudent;
	
	public Stream(String type, int fees, int noOfStudent) {
		super();
		this.type = type;
		this.fees = fees;
		this.noOfStudent = noOfStudent;
	}
	@Override
	public String toString() {
		return "Stream [type=" + type + ", fees=" + fees + ", noOfStudent=" + noOfStudent + "]";
	}
	
	
}


 class College {
	
	private String name;
	private char grade;
	private String address;
	private String contactNo;
	
	public College(String name, char grade, String address, String contactNo) {
		super();
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.contactNo = contactNo;
	}
	
	@Override
	public String toString() {
		return "College [name=" + name + ", grade=" + grade + ", address=" + address + ", contactNo=" + contactNo + "]";
	}

}
 
public class TestCollege{
public static void main(String[] args) {
	// TODO Auto-generated method stub
	College college = new College("Met",'A', "Nahsik", "123 345 566 2");
	Stream stream1 = new Stream("CS", 7800, 47);
	Stream stream2 = new Stream("IT",4500,50);
	Stream stream3 = new Stream("mech", 632165, 45);
	Stream stream4 = new Stream("EE", 6542, 456);
	Stream stream5 = new Stream("ENTC", 45125,4561);
	//to display the detials
	System.out.println(college);
	System.out.println(stream1);
	System.out.println(stream2);
	System.out.println(stream3);
	System.out.println(stream4);
	System.out.println(stream5);
	
}
}
