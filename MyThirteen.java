import java.util.Scanner;
class MyThirteen{
public static void main(String args[]){

Scanner obj = new Scanner(System.in);
int n;
System.out.println("Enter the n");
n = obj.nextInt();

for(int i = 0; i < n; i++){
	for(int j = 0;  j < i +1; j++){
		System.out.print("*");
}
System.out.println();
}
for(int i = n+1; i>0; i--){
for(int j = 0; j < i; j++){
System.out.println("*");
}
System.out.println();
}
}
}