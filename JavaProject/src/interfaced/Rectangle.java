package interfaced;

public class Rectangle implements Graphic {
	
	private float width, height;

	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is = ");
		return (width * height);
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Perimeter is ");
		return (2 * width * height);
	}
	
	
}
