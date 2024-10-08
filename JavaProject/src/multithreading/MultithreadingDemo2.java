package multithreading;

class Multithread2 implements Runnable{
	public void fun1() {
		System.out.println("This is a fun1");
	}
	public void fun2() {
		System.out.println("This is a fun2");
	}
	public void run() {
		fun1();
		fun2();
		
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		System.out.println("id is "+id);
		System.out.println("Thread name is " + name);
	}
}

public class MultithreadingDemo2 {

	public static void main(String[] args) {
		
		Multithread2 obj1 = new Multithread2();
		
		Thread th1 = new Thread(obj1);
		th1.setPriority(1);
		th1.start();
		
		
		Thread th2 = new Thread(obj1);
		th2.setPriority(3);
		th2.start();
		
		
		Thread th3 = new Thread(obj1);
		th3.setPriority(2);
		th3.start();
		
	}

}
