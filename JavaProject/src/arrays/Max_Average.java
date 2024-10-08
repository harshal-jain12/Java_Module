package arrays;

public class Max_Average {

	private int a[]= {53, 67, 46, 76, 98};
	private int max= 0;
	private double avg = 0;
	private int sum = 0;
	public void maxFind(){
		for(int i = 1; i < a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
			max = a[i];
		}
		System.out.println("Max Number is " + max);
	}
	public void avgFind() {
		for(int i:a) {
			sum += i;
		}
		double avg = sum/a.length;
		System.out.println("Average is = "+avg);
	}
			public static void main(String[] args) {
				Max_Average max_average = new Max_Average();
				max_average.maxFind();
				max_average.avgFind();
		
	}

}
