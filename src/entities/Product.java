package entities;

public class Product {
	
	private String name;
	private Double price;
	private String priceTag;
	
	Product(){
		
	}

	public Product(String name, Double price, String priceTag) {
				this.name = name;
		this.price = price;
		this.priceTag = priceTag;
	}

	public Product(String name, Double price, String priceTag) {
		super();
		this.name = name;
		this.price = price;
		this.priceTag = priceTag;
	}
	
	

}
