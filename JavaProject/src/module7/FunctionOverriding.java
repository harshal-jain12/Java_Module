package module7;

class Shape{
	
	void calArea(String shape, int a, int b) {
		System.out.println("CalAre of shape class");
	}
	void display() {
		System.out.println("Display of shape class");
		
	}
	void fun1() {
		System.out.println("fun1 of shape class");
	}
}
class Rectangle extends Shape{
	void calArea(String shape, int a, int b) {
		System.out.println("Area is "+ (a * b));
		
	}
	void display() {
		super.display();
		super.fun1();
	}
}
public class FunctionOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
		shape.calArea("shape", 5, 5);
		shape.display();
		
		Rectangle rectangle = new Rectangle();
		rectangle.calArea("tringle", 10, 10);
		rectangle.display();
		
		System.out.println("+++++++++++++++ Dynamic Binding++++++++++++");
		shape = new Rectangle();
		shape.calArea("rect", 20, 20);
		shape.display();
	}

}
