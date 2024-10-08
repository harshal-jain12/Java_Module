package abassignments;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList arraylist = new ArrayList();
		int n = sc.nextInt();
		String s= sc.next();
		double bal = sc.nextDouble();
		
		System.out.println("Please Enter the User Details ");
		for(int i = 0 ; i < 10; i++) {
			System.out.println("Enter the Account Number, Name, Balance " + i);
		}
			Account account = new Account(n, s, bal);
			arraylist.add(account);
		
		
		for(int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		

	}

}
