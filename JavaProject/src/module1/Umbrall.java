package module1;
import java.util.Scanner;

public class Umbrall {
	
	private String color, shape, brand;
	 private int size, height, cost, weight;
	 
	Scanner s = new Scanner(System.in);
	public void set_values() {
		System.out.println("Enter the Color = ");
	color = s.next();
		System.out.println("Enter the Shape = ");
		shape = s.next();
		System.out.println("Enter the Brand = ");
		brand = s.next();
		System.out.println("Enter the Size = ");
		size = s.nextInt();
		System.out.println("Enter the Height = ");
		height = s.nextInt();
		System.out.println("Enter the Cost = ");
		cost = s.nextInt();
		System.out.println("Enter the Weight = ");
		weight = s.nextInt();
		
	}
	public void functionaly() {
		System.out.println("\nUmbrell Functionality is =");
		System.out.println("Bulletpruff");
		System.out.println("Gun");
	}
	public void weapon_type() {
		System.out.println("\nUmbrell Weapon Type ");
		System.out.println("Swad");
		System.out.println("Stick");
		System.out.println("knife");
	}
	public void way_opening_closing() {
		System.out.println("\nWay of opening and closig is ");
		System.out.println("Forward Opening");
		System.out.println("Backward Closing");
	}
	
	public void display() {
		System.out.println("Color =" +color);
		System.out.println("Shape =" +shape);
		System.out.println("brand =" +brand);
		System.out.println("size =" +size);
		System.out.println("height = " +height);
		System.out.println("Cost ="+cost);
		System.out.println("Weight =" +weight);
		
	}

}
