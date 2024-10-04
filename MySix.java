import java.util.Scanner;
class MySix{
public static void main(String args[]){

Scanner obj = new Scanner(System.in);
int a, b, c;
System.out.println("Enter the 2 values");
b = obj.nextInt();
c = obj.nextInt();
System.out.println("Enter the choise 1 or 2: ");
a = obj.nextInt();

switch(a){

case 1: System.out.println(c+b);
	break;
case 2: System.out.println(c-b);
	break;
default:
	System.out.println("Invalid");

}
}

}