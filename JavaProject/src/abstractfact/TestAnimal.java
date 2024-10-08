package abstractfact;

abstract class Animal{
	final int legs = 4;
	abstract public void sound();
	abstract public void fun1();
	abstract public void fun2();
	
	public void classInfo(String type) {
		System.out.println("I belongs to " + type + " has " + legs + " legs");
		
	}
}
class Dog extends Animal{
	
	public void sound() {
		System.out.println("The Dog is Bark");
	}
	
	public void fun1() {
		System.out.println("Fun1");
		
	}
	public void fun2() {
		System.out.println("Fun2");
	}
}
class Lion extends Animal{
	
	public void sound() {
		System.out.println("The lion is Roars");
	}
	
	public void fun1() {
		System.out.println("Fun1");
	}
	public void fun2() {
		System.out.println("Fun2");
	}
}
public class TestAnimal {

	public static void main(String[] args) {
		
		Dog tuffy = new Dog();
		tuffy.classInfo("Dog");
		tuffy.sound();
		tuffy.fun1();
		tuffy.fun2();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		Lion simbbha = new Lion();
		simbbha.classInfo("Lion");
		simbbha.sound();
		simbbha.fun1();
		simbbha.fun2();
		
		

	}

}
