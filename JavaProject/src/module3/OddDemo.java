package module3;
import java.util.Scanner;

public class OddDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		while(num <= 20) {
			if(num % 2 == 1 && num != 0) {
				System.out.println(num);
			}
			num++;
		}

	}

}
