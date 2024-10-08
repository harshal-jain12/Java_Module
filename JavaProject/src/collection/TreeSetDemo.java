package collection;

import java.util.Iterator;
import java.util.TreeSet;                  

public class TreeSetDemo {

	public static void main(String[] args) {
		// collection of Integers array, sqrted
		//TreeSet<Interger> = tree1 = new TreeSet<Integer>();
		//TreeSet<Integer> tree1 = new TreeSet<>();
		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(10);
		tree1.add(20);
		tree1.add(4);
		tree1.add(55);
		tree1.add(55);
		tree1.add(55);
		tree1.add(55);
		tree1.add(55);
		tree1.add(55);
		
		
		System.out.println("Size is " + tree1.size());
		
		Iterator itr = tree1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("using enhance the for loop");
		for (int i : tree1) {
			System.out.println(i);
		}
		
		System.out.println("==================");
		System.out.println("using sop");
		System.out.println(tree1);
		
		tree1.remove(17);
		
		System.out.println("first " + tree1.first());
		System.out.println(" last " + tree1.last());
		
		tree1.clear();
		System.out.println("isempty: " + tree1.isEmpty());
		
	
	}

}
