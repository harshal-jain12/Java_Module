package assignment;

abstract class GeometicShape{
	abstract public void area();
	abstract public void perimeter();
	final static float PI = 3.14f;
	
	public void display() {
		System.out.println("This is GeometicShape Abstract class");
	}
} 

 class Circle extends GeometicShape{
	
	 private float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public void area() {
		System.out.println("Area of Circle = " + PI*radius*radius);
	}
	
	public void perimeter() {
		System.out.println("Perimeter is Circle = " + 2 * PI * radius);
	}
	
}
 
 class Rectangle extends GeometicShape{
	 
	 private double l, b;
	 
	 public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	public void area() {
			System.out.println("Area of Rectangle = " + l * b);
		}
		
		public void perimeter() {
			System.out.println("Perimeter is Rectangle = " + 2 * (l * b));
		}
	
}

 class Tringle extends GeometicShape{
	 
	 private double side1, side2, side3, b, h;
	 
	 public Tringle(double side1, double side2, double side3, double b, double h) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.b = b;
		this.h = h;
	}

	public void area() {
			System.out.println("Area of Tringle = " + 0.5 * b * h);
		}
		
		public void perimeter() {
			System.out.println("Perimeter is Tringle = " + (side1 + side2 + side3));
		}
	
}


public class TestGeometricShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(30);
		System.out.println(circle);
		circle.area();
		circle.perimeter();
		circle.display();
		System.out.println("++++++++++++++++++++");
		
		Rectangle rectangle = new Rectangle(10, 20);
		rectangle.area();
		rectangle.perimeter();
		rectangle.display();
		System.out.println("+++++++++++++++++++++++++");
		
		Tringle tringle = new Tringle(10, 12, 14, 20, 40);
		tringle.area();
		tringle.perimeter();
		tringle.display();
		System.out.println("++++++++++++++++++");
		
		

	}

}
