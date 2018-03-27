package myproducts;

public class Bread extends Product {
	private double amount;

	public Bread(String name, int price, int taxKey, double amount) {
		super(name, price, taxKey);
		// TODO Auto-generated constructor stub
		this.amount = amount;
	}

	public String toString() {
		return super.toString() + "  " + getGrossPrice() / amount;
	}

	public double getAmount() {
		return amount;
	}

	public static boolean hasMoreUnitPrice(Bread b1, Bread b2) {
		int unitPriceB1 = (int) (b1.getGrossPrice() / b1.getAmount());
		int unitPriceB2 = (int) (b2.getGrossPrice() / b2.getAmount());
		if (unitPriceB1 > unitPriceB2) {
			return true;
		}
		return false;
	}
	
}
