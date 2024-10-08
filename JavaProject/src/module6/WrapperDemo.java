package module6;

public class WrapperDemo {

	public static void main(String[] args) {
		
		String str = "100";
		String str1 = "200";
		String str2 = "100.77";
		String str3 = "34.87";
		
		System.out.println("Total is = "+ (Integer.parseInt(str)+(Integer.parseInt(str1))));
		
		System.out.println("=====================");
		
		System.out.println("Total is = " + (Float.parseFloat(str3)+ (Float.parseFloat(str2))));
		
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("Total is double = "+(Double.parseDouble(str3)+(Double.parseDouble(str2))));
		
		System.out.println(Integer.MAX_VALUE);//Return the max range of integer
		System.out.println(Integer.MIN_VALUE);//Return the min range of integer
	}

}
