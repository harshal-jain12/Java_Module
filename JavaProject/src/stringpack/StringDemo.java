package stringpack;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("Harsh");
		String str1 = new String("Jain");
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(2, 4));
		
		System.out.println(str.trim());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim().toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf("r"));
		System.out.println(str.replace("H", "A"));
		System.out.println(str.concat(str1));
		System.out.println(str.charAt(3));
		System.out.println();
		
		if(str.equals(str1))
			System.out.println("Same");
		String[] arr = str.split(" ");
		for(String s : arr) {
			System.out.println(s);
		}
	}

}
