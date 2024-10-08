package module2;

public class Mathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.sqrt(144));
		System.out.println(Math.abs(-56));
		System.out.println(Math.min(45,65));
		System.out.println(Math.max(65,75));
		System.out.println("No is betn 0 to 1 "+Math.random());
		double d = (int)(Math.random()*100);
		System.out.println(d);
		System.out.println("Random no betn 1 to 1000 "+Math.random()*1000);
		System.out.println("Random no betn 1 to 100 "+Math.random()*100);
		System.out.println("Random no betn 1 to 10 "+Math.random()*10);
		
		System.out.println(Math.ceil(654.053));
		System.out.println(Math.floor(123.456));
		System.out.println(Math.round(413.562));
		
		System.out.println(Math.pow(8, 3));
		System.out.println(Math.PI);
		System.out.println(Math.asin(45));
		System.out.println(Math.cbrt(8));

	}

}
