package billing;

import java.util.Iterator;
import java.util.LinkedList;

class Product {

	private String id;
	private String pname;
	private int qty;
	private double price;
	private double totalPrice;
	private int qty1;
	LinkedList<String> products = new LinkedList<>();
	LinkedList<Double> productprice = new LinkedList<>();
	static LinkedList<Integer> quantity = new LinkedList<>();
	public void setProduct() {
		System.out.println("Items\t\t\tPrice\tQuantity");
		products.add("\n1.Biscuit");
		productprice.add(40.00);
		quantity.add(100);
		products.add("\n2.Noodles");
		productprice.add(35.00);
		quantity.add(50);
		products.add("\n3.Soap");
		productprice.add(10.00);
		quantity.add(150);
		products.add("\n4.Wafers");
		productprice.add(20.00);
		quantity.add(100);
		products.add("\n5.Brush");
		productprice.add(15.00);	
		quantity.add(100);
		products.add("\n6.ToothPaste");
		productprice.add(80.00);
		quantity.add(100);
		products.add("\n7.Hair Oil");
		productprice.add(110.00);
		quantity.add(100);
		products.add("\n8.Towel");
		productprice.add(250.00);
		quantity.add(100);
		products.add("\n9.Chocolate");
		productprice.add(25.00);
		quantity.add(100);
		products.add("\n10.Cold Drink");
		productprice.add(55.00);
		quantity.add(100);
		products.add("\n11.Spoon");
		productprice.add(40.00);
		quantity.add(100);
		products.add("\n12.Bread");
		productprice.add(32.00);
		quantity.add(100);
		products.add("\n13.Shampoo");
		productprice.add(76.00);
		quantity.add(100);
		products.add("\n14.Perfume");
		productprice.add(210.00);
		quantity.add(100);
		products.add("\n15.Spices");
		productprice.add(30.00);
		quantity.add(100);

	}

	public void displayProducts() {
		
		Iterator<String> itp = products.iterator();
		Iterator<Double> itpr = productprice.iterator();
		Iterator<Integer> itqut = quantity.iterator();
		
		while(itp.hasNext() && itpr.hasNext()){
			System.out.format("%-25s",itp.next());
			System.out.format("%-8s",itpr.next());
			System.out.format("%-8s",itqut.next());
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
	}

	Product() {

	}

	Product(String id, String pname, int qty, double price, double totalPrice, int qty1) {
		this.id = id;
		this.pname = pname;
		this.qty = qty;
		this.qty1 = qty1;
		this.price = price;
		this.totalPrice = totalPrice;
	}

	public String getId() {
		return id;
	}
	public String getPname() {
		return pname;
	}

	public int getQty() {
		return qty;
	}

	public double getPrice() {
		return price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public int qty1(){ 
		return qty1;
	}
	public static void displayFormat() {
		System.out.format(
				"-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");
		System.out.format(
				"-----------------------------------------------------------------------------------------------------------------------------------\n");
	}

	public void calculatequantity(int number,int quantity){
//		this.quantity.add(number - 1, this.quantity.get(number - 1 )-quantity);
//	}
	
	if (this.quantity.get(number - 1) >= quantity) {
	   
	    this.quantity.add(number - 1, this.quantity.get(number - 1) - quantity);
	} else {
	   
	    System.out.println("Quantity not available.");}
	}
	public void display() {
		System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n", id,pname, qty, price, totalPrice);
	}
}