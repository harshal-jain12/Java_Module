package icicBank;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		int ch;
		String choise;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("============Welcome to ICIC Bank===============");
			System.out.println("1. Accept Details");
			System.out.println("2. Display Details ");
			System.out.println("3. Withraw Amount");
			System.out.println("4. Deposit Amount");
			System.out.println("5. Transfer Amount ");
			System.out.println("6. Check Balance ");
			System.out.println("7. Update Balance ");
			System.out.println("8. Exit ");

			System.out.println("\nEnter your Choise:  ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Accept Details ");
				break;
			case 2:
				System.out.println("Display Detials");
				break;
			case 3:
				System.out.println("Withdraw Amount ");
				break;
			case 4:
				System.out.println("Deposit Amount");
				break;
			case 5:
				System.out.println("Transfer Money");
		
				break;
			case 6:
				System.out.println("Check Balance");
				break;
			case 7:
				System.out.println("Update Blance ");
				break;
			case 0:
				System.out.println("Thank you for Visting: ");
				System.exit(0);

			}
			System.out.println("Do you want to continue? (Y/N)");
			choise = sc.next();
			sc.close();
		} while (choise.equalsIgnoreCase("Y"));

		System.out.println("Thank you for Visting: ");

	}
	
}
