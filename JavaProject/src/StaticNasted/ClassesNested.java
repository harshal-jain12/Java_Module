package StaticNasted;

class OuterClass{
	private static String msg = "Welcome to Nested Classes"; //mv
	//Static nested class
	public static class NestedStaticClass{
		public void printMessage() {
			//can access only static mv
			System.out.println("Message form nested static class: " + msg);
		}
	}
	//non static nested class //called Inner class
	public class InnerClass{
		//Both static and non static members of Outer class are accessible here 
		public void display() {
			System.out.println("Message from non -static nested class: "+ msg);
		}
	}
}

public class ClassesNested {

	public static void main(String[] args) {
		//1 object is created to call method of Static class
		OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
		
		printer.printMessage();
		
		//2 object is created to call method of non StaticClass
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.display();
	}

}
