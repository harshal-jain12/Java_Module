package assignment1;
import java.util.Scanner;
/*Assignment 3: Door Access Control
Write a program that simulates an access control system. 
A person is allowed access if they have both a valid ID and 
a valid access card, or if they are an admin.
Requirements:
•    Use logical operators &&, ||, and !.
*/
public class DoorControl {
	private int id, card, admin;
	Scanner sc = new Scanner(System.in);
	public void set() {
		System.out.println("Please Give rensponse in 1 or 0. (here, 1 = yes and 0 = false)");
		System.out.println("You have id: ");
		id = sc.nextInt();
		System.out.println("You have Access Card: ");
		card = sc.nextInt();
		System.out.println("Are you a Admin: ");
		admin = sc.nextInt();		
	}
	
	public void checkAccess() {
		if(id == 1 || card == 1 || admin == 1)
			System.out.println("Congrats. Access Granted: ");
		else
			System.out.println("Access Dinay:\nGet the valid id or Card");
	}
	
	public void show() {
		System.out.println("Id = "+id);
		System.out.println("Card = "+card);
		System.out.println("Admin = "+admin);
	}

}
