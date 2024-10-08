package module5;

class Myclass2 {
	public void fun2() {
		System.out.println("This is Second class");

	}
}

class Myclass3 {
	public void fun3() {
		System.out.println("This is Third class");
	}
}

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is First class: ");
		Myclass3 myclass3 = new Myclass3();
		myclass3.fun3();
		Myclass2 myclass2 = new Myclass2();
		myclass2.fun2();
		Myclass4 myclass4 = new Myclass4();
		myclass4.fun4();

	}

}

class Myclass4 {
	public void fun4() {
		System.out.println("This is Four class");
	}
}
