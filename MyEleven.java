import java.util.Scanner;
class MyEleven{

public static void main(String args[]){

Scanner obj = new Scanner(System.in);
int a, max = 0;
System.out.println("Enter the 10 numbers: ");

for(int i = 1; i < 11; i++){
a = obj.nextInt();
if(max<a){
max = a;
	
}
}
System.out.println("Max Number = " + max);
}
}