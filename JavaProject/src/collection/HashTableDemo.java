package collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Character, String> table = new Hashtable<Character, String>();
		table.put('R', "Ram");
		table.put('S', "Sham");
		table.put('K', "Krishna");
		table.put('S', "Shankar");
		table.put('G', "Ganesha");
		table.put('N', "Narayan");
		
		System.out.println(table.get(1));
		System.out.println(table);
		System.out.println('R');
		System.out.println('G');
		System.out.println('S');
		
		System.out.println(table.remove('R'));
		
		
	}

}
