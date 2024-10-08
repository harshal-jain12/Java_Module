package generics;

class Myclass{
	//Generic method to print array will diff data type
	
	public <E> void printArray(E[] arr1) {
		//Capital E is DataType of an Array
		
		for(E i: arr1) {
			System.out.println(i);
		}
		System.out.println("======================");
	}
	
}

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myclass myclass = new Myclass();
		//pass the Interger array
		
		int[] arr = { 33, 3, 3, 55};
		
		Integer[] arrInt = { 11, 22, 33, 44, 55};
		myclass.printArray(arrInt);

		Double[] arrdouble = { 11.33, 24.22, 45.33, 44.48, 55.96};
		myclass.printArray(arrdouble);
		
		Float[] arrfloat = { 11.3f, 24.2f, 45.3f, 44.4f, 55.9f};
		myclass.printArray(arrfloat);
		
		String[] arrstring = { "tia", "ria", "uma", "usha"};
		myclass.printArray(arrstring);
		
		Character[] arrchar = { 'A', 'B', 'C', 'D', 'E'};
		myclass.printArray(arrchar);
	}

}
