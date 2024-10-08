package inheritance;

public class Export extends Transport {
	
	private double contianerSize;
	private String destinationCountry;
	private String exportDate;
	
	public Export(String transport_type, String drand, double capacity, int speed, double contianerSize,
			String destinationCountry, String exportDate) {
		super(transport_type, drand, capacity, speed);
		this.contianerSize = contianerSize;
		this.destinationCountry = destinationCountry;
		this.exportDate = exportDate;
	}
	
	public double get_containerSize() {
		return contianerSize;
	}
	
	public String get_destinationCountry() {
		return destinationCountry;
		
	}
	
	public String get_exportDate() {
		return exportDate;
	}
	
	public void transportDetails() {
		System.out.println("Container Size = "  + contianerSize);
		System.out.println("Destination Country = " +destinationCountry);
		System.out.println("Export Date = " +exportDate);
	}
	public void calculateExportDuties(double contianerSize) {
		System.out.println((contianerSize * 10)/100);
		
	}
	
	
}
