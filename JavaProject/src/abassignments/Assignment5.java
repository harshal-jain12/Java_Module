package abassignments;

import java.util.Scanner;
class CheckVowel extends Exception {

	public CheckVowel(String msg) {
		super(msg); //calling parent class constructor
	}
}
public class Assignment5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
		System.out.println("Enter a string");
	String str= sc.next();
	for(int i=0;i<str.length();i++) {
	if(str.charAt(i)!='a'||str.charAt(i)!='e'||
			str.charAt(i)!='i'||str.charAt(i)!='o'||
			str.charAt(i)!='u'||
			str.charAt(i)!='A'||str.charAt(i)!='E'||
			str.charAt(i)!='I'||str.charAt(i)!='O'||
			str.charAt(i)!='U') {
		throw new CheckVowel("Exception: Vowel not present");
	}
	}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
