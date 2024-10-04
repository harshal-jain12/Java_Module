import java.util.Scanner;
class MyTen{

public static void main(String args[]){

Scanner obj = new Scanner(System.in);
int a, b = 0, c = 1, fibbo=0;
System.out.println("Enter the 1 numbers: ");
a = obj.nextInt();
System.out.println(b);
do{
b = c;
c = fibbo;
fibbo = b + c;

System.out.println(fibbo);
a--;
}while(a>0);

}
}