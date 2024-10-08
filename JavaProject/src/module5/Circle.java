package module5;
import java.util.Scanner;



public class Circle {
	private double radius;
	private double area1;
	private double peri;

   
    
	static double PI;
	{
		PI = 3.14;
	}
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter the value of Radius");
		radius = sc.nextDouble();
			
	}
	public void display() {
		System.out.println("Radius of Circle is  = "+radius);
		System.out.println("Area of circle is = "+area1);
		System.out.println("Perimeter of circle is = "+peri);
		System.out.println("Perimeter of circle is = "+Math.round(peri));
		
		System.out.println("\n");

	}
	public void calArea() {
		area1 = PI * radius * radius;
		
	}
	public void calPeri() {
				
		peri = 2 * PI * radius;
		  // comma Specifier
		
	}

}
