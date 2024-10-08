package collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Character, String> hashmap = new HashMap<Character, String>();
		hashmap.put('p',"Priya");
		hashmap.put('A', "Akshay");
		hashmap.put('o',"Om");
		hashmap.put('H', "Harsh");
		hashmap.put('r', "Rama");
		hashmap.put('k', "kartikey");
		hashmap.put('g', "Ganesh");
		hashmap.put('d', "Durga");
		hashmap.put(null, null);
		hashmap.put(null, "Shama");
		hashmap.put('y', null);
		
		//to display
		System.out.println(hashmap);
		
		boolean res = hashmap.containsKey('p');
		System.out.println(res);
		
		hashmap.remove('H');
		
		hashmap.replace('k', "SwamiAyyapa");
		
		System.out.println(hashmap);
		
		System.out.println("=================");
		
		System.out.println("Display the keys........");
		//get all keys of hashmap
		Object[] keys = hashmap.keySet().toArray();
		System.out.println("\nkeys: ");
		for(int i = 0; i < keys.length; i++) {
			System.out.print(keys[i] + " ");
			System.out.print(hashmap.get(keys[i]));
			System.out.println();
		}
		
		System.out.println("+++++++++++++++++++++");
		System.out.println("to get one value.....");
		System.out.println(hashmap.get('R'));
		
	}

}
