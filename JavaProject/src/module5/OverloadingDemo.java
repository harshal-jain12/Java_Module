package module5;

public class OverloadingDemo {
	
	static public int add(int a, int b) {
		return (a+b);
	}
	static public int add(int a, int b, int c) {
		return (a+b+c);
	}
	static public double add(int a, double b) {
		return (a+b);
	}

	public static void main(String[] args) {
		// we did not have to create an obj to call the static method
		
		System.out.println(add(10, 20)); //directly return the value without storing the value in variable
		
		int result = add(10, 20, 30);
		System.out.println(result);
		
		double resulta = add(10, 20.20);
		System.out.println(resulta);
		
		
		

	}

}
