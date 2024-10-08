package inheritance;

public class TestPerson2 {

	public static void main(String[] args) {
		
		Person[] arr = new Person[5];
		
		arr[0] = new Person("zahid" , 22, 'M');
		arr[1] = new Person("ahid" , 22, 'M');
		arr[2] = new Person("hid" , 22, 'M');
		arr[3] = new Person("id" , 22, 'M');
		arr[4] = new Person("d" , 22, 'M');
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("==========================");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + "is " + arr[i].getAge() + " yrs old and gender is " + arr[i].getGender());
		}
		
 
	}

}
