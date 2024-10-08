package multithreading;

class Demo{
	
	public void fun1() {
		System.out.println("This a is fun1");
	}
	
	public void fun2() {
		System.out.println("This a is fun2");
	}
}

class Multhithread extends Thread{
	Demo demo1 = new Demo();
	// ch					parent
	
	public void run() {
		
		demo1.fun1();
		demo1.fun2();
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		System.out.println("id is "+id);
		System.out.println("Thread name is " + name);
	
	}
}

public class MultithreadingDemo {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 7; i++) {
			
			Multhithread thread1 = new Multhithread();
			thread1.start();//will call run()
			System.out.println("=====================");
			
		}
			
	}

}
