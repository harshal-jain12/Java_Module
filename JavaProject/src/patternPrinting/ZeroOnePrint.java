package patternPrinting;

public class ZeroOnePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		int column = 7;
		
		for(int i = 0; i < row; i++ ) {
			for(int j = 2; j < column; j++) {
				System.out.print(j%2);
			}
			System.out.println();
		}

	}

}
