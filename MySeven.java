import java.util.Scanner;
class MySeven{

public static void main(String args[]){

Scanner obj = new Scanner(System.in);
int a, fact=1;
System.out.println("Enter the fact no: ");
a = obj.nextInt();

while(a > 0){
	fact = fact * a;
	a--;
}
System.out.println(fact);

}
}