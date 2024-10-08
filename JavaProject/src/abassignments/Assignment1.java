package abassignments;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		try {
			int square = n*n;
			System.out.println(square);
		}catch(Exception e) {
			System.out.println("You entered other than number");
		}
	}

}
