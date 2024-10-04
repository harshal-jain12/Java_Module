import java.util.Scanner;
class MyThird{

public static void  main(String args[]){

Scanner obj = new Scanner(System.in);//new is allocate the dynamnic memory for obj

int a, b, c;

System.out.println("Enter the value for a");
a = obj.nextInt();
System.out.println("Enter the value for b");
b = obj.nextInt();
c = a + b;

System.out.println("Addition = " + c);



}
}