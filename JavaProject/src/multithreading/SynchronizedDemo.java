package multithreading;

class Myclass implements Runnable{
	//print odd and even numbers
	private static boolean flag = true;
	
	public synchronized void printEven(){
		
		long id = Thread.currentThread().getId();
		for(int i = 2; i < 20; i +=2) {
			System.out.println(i + " id is " + id);
		}
	}
	
	public synchronized void printOdd(){
		
		long id = Thread.currentThread().getId();
		for(int i = 1; i < 20; i +=2) {
			System.out.println(i + " id is " + id);
		}
	}
	@Override
	public void run() {
		
		if(flag == true) {
			flag = false;
			printEven();
		}
		else {
			printOdd();
		}
		
	}
	
}
public class SynchronizedDemo {

	public static void main(String[] args) {
		
		Myclass myclass = new Myclass();
		Thread eventh1 = new Thread(myclass);
		Thread oddth1 = new Thread(myclass);
		
		eventh1.start();
		oddth1.start();
	}

}
