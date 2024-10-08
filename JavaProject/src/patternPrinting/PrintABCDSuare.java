package patternPrinting;

public class PrintABCDSuare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		int column = 5;
		char a = 'A';
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print((char)(a+i+j)+" ");
				
			}
			System.out.println();
		}
	}

}
