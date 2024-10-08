package inheritance;

public class GoodsTransport extends Transport {
	
	private String loadCapacity;
	private boolean isRefrigreated;
	private double distance;
	
	
	public GoodsTransport(String transport_type, String drand, double capacity, int speed, String loadCapacity,
			boolean isRefrigreated, double distance) {
		super(transport_type, drand, capacity, speed);
		this.loadCapacity = loadCapacity;
		this.isRefrigreated = isRefrigreated;
		this.distance = distance;
	}
	
	public String get_LoadCapacity() {
		 return loadCapacity;
	}
	
	public boolean get_isRefrigreated() {
		return isRefrigreated;
	}
	
	public double calculate_DeliveryTime(double distance) {
		return ((distance * 100) / 180);
	}
	
	public void displayGoodTransportInfo() {
		System.out.println("Load Capacity "+loadCapacity);
		System.out.println("Is Refrigreated "+isRefrigreated);
		System.out.println("Distance is "+distance);
	}
	
	

}
