package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList arrylist = new ArrayList();
		
		arrylist.add(10);
		arrylist.add(20.2);
		arrylist.add(true);
		arrylist.add("rohit");
		arrylist.add("Rama");
		
		Emp emp1 = new Emp(1, "irfan", 50000);
		Emp emp2 = new Emp(2, "rfan", 50000);
		
		arrylist.add(emp1);
		arrylist.add(emp2);
		
		for(int i = 0; i < arrylist.size(); i++)
			System.out.println(arrylist.get(i));
		System.out.println("===================");
		
		//2nd to dipslay the objets
		System.out.println("using the iterator method");
		Iterator itr =  arrylist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//to check whereter the bje is present : returns t /f
		boolean res = arrylist.contains("Rama");
		System.out.println(res);
		
		//return the int if present, else -1
		int real1 = arrylist.indexOf("Rama");
		System.out.println(real1);
		
		real1 = arrylist.lastIndexOf("Rama");
		System.out.println("lastIndexOf : " + res);
		
		System.out.println("using the remove");
		
		arrylist.remove("Rohit");
		arrylist.remove(1);
		
		for(int i = 0; i < arrylist.size(); i++) {
			System.out.println(arrylist.get(i));
			System.out.println("===============");
		}
		// to delete all the elements
		arrylist.clear();
		
		System.out.println(arrylist.isEmpty());
		
		arrylist.addFirst(22);
		arrylist.addLast(35);
		
		//to change the obj
		
		arrylist.set(1, 88);
		
		System.out.println("=================");
		for(int i = 0; i < arrylist.size(); i++) {
			System.out.println(arrylist.get(i));
			System.out.println("+++++++++++++++++++++");
		}
		System.out.println();
	}

}
