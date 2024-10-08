package patternPrinting;

public class AddIJ2Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		int column = 7;
		
		for(int i = 0; i < row; i++ ) {
			for(int j = 0; j < column; j++) {
				System.out.print((i+j)%2);
			}
			System.out.println();
		}

	}

}