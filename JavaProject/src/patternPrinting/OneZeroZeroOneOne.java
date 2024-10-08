package patternPrinting;

public class OneZeroZeroOneOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 6;
		int column = 5;
		
		for(int i = 1; i < row; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
	}

}
