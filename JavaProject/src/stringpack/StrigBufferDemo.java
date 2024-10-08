package stringpack;
import java.util.*;

public class StrigBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Purva");
		sb.append("CCDAc nahsiik");
		System.out.println(sb);
		
		int i = sb.indexOf("R");
		System.out.println("i is "+ i);
		int i1 = sb.lastIndexOf("a");
		System.out.println("i1 is " + i1);
		sb.replace(6,  9, "new");
		System.out.println(sb);
		System.out.println(sb.offsetByCodePoints(2, 4));
		
		sb.replace(3, 5, "new");
		System.out.println(sb);
		
		sb.delete(0, 5);
		
		System.out.println(sb);
		System.out.println(sb.reverse());
	}

}
