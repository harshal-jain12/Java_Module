package module5;

public class UpwardCasting {

	public static void main(String[] args) {
		double num = 123.02;
		int mun = (int)num; //Downward Casting : Explicit Casting
		System.out.println(mun);
		
		int num1 = 123;
		double mun1 = num1; //Upward Casting : Explicit Casting
		System.out.println(mun1);
	}

}
