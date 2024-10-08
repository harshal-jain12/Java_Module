package patternPrinting;

public class RowNumberPrintInSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		int column = 5;
		
		for(int i = 1; i < row + 1; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
