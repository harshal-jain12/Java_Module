package inheritance;

public class Transport {
	
	//Member Variable
	private String transport_type;
	private String brand;
	private double capacity;
	private int speed;
	
	
	public Transport(String transport_type, String brand, double capacity, int speed) {
		super();
		this.transport_type = transport_type;
		this.brand = brand;
		this.capacity = capacity;
		this.speed = speed;
	}
	
	public String getType() {
		return transport_type;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getCapacity() {
		return capacity;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void display_info() {
		System.out.println("Transport type = " + transport_type);
		System.out.println("Transport Brand = " + brand);
		System.out.println("Transport Capacity = " + capacity);
		System.out.println("Transport Speed = " + speed);
	}

	@Override
	public String toString() {
		return "Transport [transport_type=" + transport_type + ", brand=" + brand + ", capacity=" + capacity
				+ ", speed=" + speed + "]";
	}
	
	
	
	
	

}
