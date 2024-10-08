package interfaced;

public class TestGraphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Circle area and Perimeter : ");
		Circle circle = new Circle(10.01f);
		System.out.println(circle.area());
		System.out.println(circle.perimeter());
		
		System.out.println("Rectangle area and Perimeter : ");
		Rectangle rectangle = new Rectangle(10.0f, 20.0f);
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
	}

}
