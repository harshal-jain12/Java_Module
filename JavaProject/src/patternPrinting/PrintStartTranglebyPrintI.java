package patternPrinting;

public class PrintStartTranglebyPrintI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		int column = 5;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j <= i;j++ ) {
					System.out.print("*");
					
			}
			System.out.println();
		}
	}

}
