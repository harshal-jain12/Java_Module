package module3;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number (Number is less than 8) ");
		int num = sc.nextInt();
		
		
		switch(num){
		case 7:
			System.out.println("Sleepy Sunday");
			break;
		case 6: 
			System.out.println("Super Saturday");
			break;
		case 5:
			System.out.println("Movie Day");
			break;
		default: 
			System.out.println("Let's Work Together");
		}

	}

}
