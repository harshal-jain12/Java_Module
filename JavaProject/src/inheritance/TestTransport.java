package inheritance;

public class TestTransport {

	public static void main(String[] args) {
		System.out.println("This is Transport Base class Info \n\n");
		Transport transport = new Transport("Truck", "Nick", 100.25, 40);
		System.out.println(transport);
		transport.getType();
		transport.getBrand();
		transport.getCapacity();
		transport.getSpeed();
		transport.display_info();
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
		
		System.out.println("This is Public Transport Class Info \n\n");
		PublicTranport publicTransport = new PublicTranport("Ship", "Adidas", 450.23, 45, "127", "16:30");
		System.out.println(publicTransport);
		publicTransport.get_routeNumber();
		publicTransport.get_schedule();
		publicTransport.isRunningOnTime();
		publicTransport.displayInfoPublic();
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
		
		System.out.println("This is Good Transport Class info");
		GoodsTransport goodTransport = new GoodsTransport("Aeroplane", "Artlary", 450.21, 400, "400 Tn", false, 2000);
		System.out.println(goodTransport);
		goodTransport.get_LoadCapacity();
		goodTransport.get_isRefrigreated();
		goodTransport.calculate_DeliveryTime(500);
		goodTransport.displayGoodTransportInfo();
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
		
		System.out.println("This is a Import Class : ");
		Import import1 = new Import("Car", "BKT", 100, 80, 80.90, "India", "Maharashatra");
		System.out.println(import1);
		import1.get_containerSize();
		import1.get_destinationPart();
		import1.get_originCountry();
		import1.importDetails(500);
		import1.transportDetails();
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
		
		System.out.println("This is Export Class: ");
		Export export = new Export("Railway", "Gov Goods", 500.20, 130, 800.25, "Urope", "12/10/2015");
		System.out.println(export);
		export.get_containerSize();
		export.get_destinationCountry();
		export.get_exportDate();
		export.calculateExportDuties(600);
		export.transportDetails();
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
		
		
		
			
	}

}
