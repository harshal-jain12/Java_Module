package module6;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		Integer i = a; //autoboxing
		
		System.out.println("autoboxing " + i);
		System.out.println("autoboxing " + i.byteValue());
		System.out.println("autoboxing " + i.hashCode());
		
		int b = i; // unboxing
		
		System.out.println("unboxing" + b);
		
	
		
		

	}

}
