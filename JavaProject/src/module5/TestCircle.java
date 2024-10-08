package module5;

public class TestCircle {
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle circle2 = new Circle();
		Circle circle3 = new Circle();
		
		circle.accept();
		circle.calArea();
		circle.calPeri();
		circle.display();
		
		System.out.println(circle.hashCode());
		System.out.println(circle2.hashCode());
		System.out.println(circle3.hashCode());
		
		//compare objects
		boolean result = circle.equals(circle2);
		System.out.println(result);
		
		boolean result1 = circle2.equals(circle3);
		System.out.println(result);
		
		int a = 100;
		int b = 100;
		if(a ==b)
			System.out.println("Same");
		
		String s = "manish";
		String ss = "manisy";
			if(s == ss)
				System.out.println("same");
			else
				System.out.println("Not same");
		System.out.println("\n");
		
		String s1 = new String("chinmay");
		String s2 = new String("chinmay");
		
		if(s1.equals(s2))
			System.out.println("Same");
		else
			System.out.println("not same");
		
		System.out.println("++++++++++++++++++++++++++++++++");
		
		String s3 = new String("chinmay");
		String s4 = new String("CHINMAY");
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Same");
		else
			System.out.println("not same");
	}

}
