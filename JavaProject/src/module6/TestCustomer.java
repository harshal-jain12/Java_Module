package module6;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is default constructor ");
		Customer customer = new Customer();
		System.out.println("Customer id = "+customer.getCusId());
		System.out.println("Customer name = "+customer.getName());
		System.out.println("Customer mobile = "+customer.getMobile());
		System.out.println("Customer address = "+customer.getAddress());
		
		
		System.out.println("===================================");
		System.out.println("This is paramitersized constructor");
		System.out.println("Enter cusId, name , mobile, address");
		
		Customer customer1 = new Customer(45, "Ganesh", 56321452, "Mumbai");
		System.out.println("Customer id = "+customer1.getCusId());
		System.out.println("Customer name = "+customer1.getName());
		System.out.println("Customer mobile = "+customer1.getMobile());
		System.out.println("Customer address = "+customer1.getAddress());
		
		System.out.println("===================\nThis is toString Object class function: ");
		System.out.println(customer1);
		
//		customer.setName(name);
//		customer.setMobile(mobile);
//		customer.setAddress(address);
		
		
		
//		customer.setCusId(cusId);
//		customer.setName(name);
//		customer.setMobile(mobile);
//		customer.setAddress(address);
	
	}

}
