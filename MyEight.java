import java.util.Scanner;
class MyEight{

public static void main(String args[]){

Scanner obj = new Scanner(System.in);
int a, sum=0, digit=0;
System.out.println("Enter the no: ");
a = obj.nextInt();


while(a > 0){
	sum = sum + a % 10;
	a = a / 10;
	digit++;
}
System.out.println(sum);
System.out.println(digit);

}
}