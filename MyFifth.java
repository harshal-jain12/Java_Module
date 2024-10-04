import java.util.Scanner;
class MyFifth{

public static void main(String args[]){

Scanner obj = new Scanner(System.in);

int a;
System.out.println("Enter the age: ");
a = obj.nextInt();

if(a> 0 && a <18)
	System.out.println("Child");
else if ( a>17 && a< 60)
	System.out.println("Yournger");
else if(a>59 && a<121)
	System.out.println("Old");
else
	System.out.println("Please Check you AGE");





}

}