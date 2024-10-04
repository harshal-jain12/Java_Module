import java.util.Scanner;
class MyNine{

public static void main(String args[]){

Scanner obj = new Scanner(System.in);
int a=0, sum=0, digit=0;
System.out.println("Enter the 10 numbers: ");

while(a < 11){
a = obj.nextInt();
if(a%2==0)
{
sum = sum + a;
}
else{
digit = digit + a;
}
a++;
}
System.out.println("Sum of Even Numbers: " + sum);
System.out.println("Sum of Odd Numbers: " + digit);

}
}