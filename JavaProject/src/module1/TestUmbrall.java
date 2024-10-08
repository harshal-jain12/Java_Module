package module1;

public class TestUmbrall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umbrall umbrell = new Umbrall();
		System.out.println("First Umbrall: ");
		umbrell.set_values();
		umbrell.display();
		umbrell.functionaly();
		umbrell.weapon_type();
		umbrell.way_opening_closing();
		
		
		System.out.println("\nSecond Umbrall : ");
		Umbrall umbrell2 = new Umbrall();
		umbrell2.set_values();
		umbrell2.display();
		umbrell2.functionaly();
		umbrell2.weapon_type();
		umbrell2.way_opening_closing();
		
		System.out.println("\nThird Umbrall : ");
		Umbrall umbrell3 = new Umbrall();
		umbrell3.display();
		umbrell3.functionaly();
		umbrell3.weapon_type();
		umbrell3.way_opening_closing();
		
	}

}
