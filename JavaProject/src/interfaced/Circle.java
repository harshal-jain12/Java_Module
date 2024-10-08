package interfaced;

public class Circle implements Graphic{
	
	private float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		System.out.println("Radius is = ");
		return (PI * radius * radius);
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter is = ");
		return (2 * PI * radius);
	}
	
	
	

}
