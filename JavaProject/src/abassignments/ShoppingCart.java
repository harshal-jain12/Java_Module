package abassignments;

class Product {
	private int producrid;
	private String productname;
	private double proPrice;

	public Product(int producrid, String productname, double proPrice) {
		this.producrid = producrid;
		this.productname = productname;
		this.proPrice = proPrice;
	}

	public int getProducrid() {
		return producrid;
	}

	public void setProducrid(int producrid) {
		this.producrid = producrid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getProPrice() {
		return proPrice;
	}

	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}

	@Override
	public String toString() {
		return "Product [producrid=" + producrid + ", productname=" + productname + ", proPrice=" + proPrice + "]";
	}
}

public class ShoppingCart {
	static int size = 0;
	static final int maxs = 10;
	Product[] products;

	ShoppingCart() {
		this.products = new Product[maxs];
	}

	void addproduct(Product product) {
		if (size < maxs) {
			products[size++] = product;
		} else {
			System.out.println("Array size full");
		}
	}

	double getP() {
		double totP = 0;
		for (int i = 0; i < size; i++) {
			totP += products[i].getProPrice();
		}
		return totP;
	}

	void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(products[i]);
		}
	}

	public static void main(String args[]) {
		Product p = new Product(1, "AB", 5000);
		Product p1 = new Product(2, "XC", 500);
		ShoppingCart s = new ShoppingCart();
		s.addproduct(p);
		s.addproduct(p1);
		s.display();
		double total = s.getP();
		System.out.println("Total Price: " + total);
	}
}
