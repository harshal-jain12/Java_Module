package module5;

public class ForDemo {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}
		
		
		System.out.println("=========== continue ===========");
		
		for(int i = 1; i <= 10; i++)
		{
			if(i==5)
				continue;
			System.out.println(i);
		}
	}

}
