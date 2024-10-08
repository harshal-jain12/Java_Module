package statics;

public class StaticVarDemo {
	
	static int num = 1;
	
	public void display() {
		num++;
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(num);//1 method to call static variable
		System.out.println(StaticVarDemo.num);//2 method to call the static variable class name . varuaibale name
		
		

	}

}
