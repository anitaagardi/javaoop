package myproducts;

public class Product {
	private String name;
	private int netPrice;
	private int taxKey;
	public Product(String name, int price, int taxKey) {
		super();
		this.name = name;
		this.netPrice = price;
		this.taxKey = taxKey;
	}
	public int getGrossPrice(){
		return netPrice*taxKey/100+netPrice;
	}
	public String toString(){
		return name+" "+getGrossPrice();
	}
	public void addToPrice(int percent){
		this.netPrice=netPrice+netPrice*percent/100;
	}
	public int hasMorePrice(Product p){
		if(getGrossPrice()>p.getGrossPrice()){
			return 1;
		}else if(getGrossPrice()<p.getGrossPrice()){
			return -1;
		}
		return 0;
	}
	
	

}
