package inheritance;

public class PublicTranport extends Transport {
	
	private String routeNumber;
	private String schedule;
	
	public PublicTranport(String transport_type, String drand, double capacity, int speed, String routeNumber,
			String schedule) {
		super(transport_type, drand, capacity, speed);
		this.routeNumber = routeNumber;
		this.schedule = schedule;
	}
	
	public void get_routeNumber() {
		System.out.println("Route Number " +routeNumber);
	}
	public void get_schedule() {
		System.out.println("Schedule " +schedule);
	}
	
	public boolean isRunningOnTime() {
			return true;
	}
	
	public void displayInfoPublic() {
		System.out.println("Route no = " +routeNumber);
		System.out.println("Schedule = " + schedule);
		System.out.println("Running on Time " + isRunningOnTime());
	}
	
	

}
