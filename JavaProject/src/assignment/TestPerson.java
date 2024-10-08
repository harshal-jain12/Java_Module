package assignment;

final class Person{
	
	final String name;
	final int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("Ramnath", 12);
		System.out.println(person);
		System.out.println("Name is = " + person.getName());
		System.out.println("Age is = " + person.getAge());

	}

}
