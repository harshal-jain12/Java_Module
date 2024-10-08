package module5;

public class OverLoadMain {
	
	static public int main() {
		System.out.println("This is parameter less main method");
		return 0;
	}
	static public int main(int a) {
		System.out.println("This is one parameter pass main mehtod" + a);
		return a;
	}
	
	static public void main(int c, double d) {
		System.out.println("this is two parameter pass mai method "+c +" "+ d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(main(10));
		int result = main(10);
		System.out.println(result);
		int result1 = main();
		System.out.println(result1);
		main();
		main(10);
		main(10, 20.00);


	}

}
