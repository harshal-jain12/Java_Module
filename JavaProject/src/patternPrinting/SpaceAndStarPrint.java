package patternPrinting;

public class SpaceAndStarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int j = 6;
		for( i = 0; i < 6; i++) {
			for(j = 5; j > i; j--) {
				
			}
			for(int k = 6 - i ; k > j; k--) {
				System.out.print("1");
			}
			System.out.print("*");
		}
			System.out.println();
			
		}
	}


