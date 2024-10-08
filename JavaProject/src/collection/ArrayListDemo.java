package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
//		ArrayList arrylist = new ArrayList();
		
		//collection of Emp class object
		ArrayList<Emp> arrylist = new ArrayList<Emp>();
		//List arrList1 = new ArrayListDemo();
		
		//creating objects of Emp
		Emp emp1 = new Emp(1, "irfan", 50000);
		Emp emp2 = new Emp(2, "rfan", 50000);
		Emp emp3 = new Emp(3, "fan", 50000);
		Emp emp4 = new Emp(4, "an", 50000);
		Emp emp5 = new Emp(5, "n", 50000);
		
		//add the objects in collection
		
		arrylist.add(emp1);
		arrylist.add(emp2);
		arrylist.add(emp3);
		arrylist.add(emp4);
		arrylist.add(emp5);
		
		//to display
		
		for(int i = 0; i < arrylist.size(); i++) {
			System.out.println(arrylist.get(i));
			System.out.println("=====================");
		}
		
	}

}
