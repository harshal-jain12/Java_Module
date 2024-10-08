package patternPrinting;

public class PrintColumnRowsNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 6;		
		for(int i = 1; i < row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
