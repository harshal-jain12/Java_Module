package inheritance;

public class Import extends Transport{
	
	private double contianerSize;
	private String origniCountry;
	private String destinationPart;
	
	
	public Import(String transport_type, String drand, double capacity, int speed, double contianerSize,
			String origniCountry, String destinationPart) {
		super(transport_type, drand, capacity, speed);
		this.contianerSize = contianerSize;
		this.origniCountry = origniCountry;
		this.destinationPart = destinationPart;
	}
	
	public double get_containerSize() {
		return contianerSize;
	}
	
	public String get_originCountry() {
		return origniCountry;
		
	}
	
	public String get_destinationPart() {
		return destinationPart;
	}
	
	public void transportDetails() {
		System.out.println("Container Size = "  + contianerSize);
		System.out.println("Origin Country = " +origniCountry);
		System.out.println("Destination Part = " +destinationPart);
	}
	public void importDetails(double contianerSize) {
		System.out.println((contianerSize * 10)/100);
		
	}
	
}
