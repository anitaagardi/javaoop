package myproducts.sub;

import myproducts.Bread;
import myproducts.Product;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product("Milk",200,27);
		Bread b1=new Bread("Bread",210,27,3);
		System.out.println(p1.toString());
		System.out.println(b1.toString());
		if(b1.getGrossPrice()>p1.getGrossPrice()){
			System.out.println("Bread");
		}
		else{
			System.out.println("Milk");
		}
		Product product2=new Bread("Bread",220,27,4);
		System.out.println(product2.toString());
		//product2.getAmount(); undefined for type Product
		Bread bread2=new Bread("Bread",250,27,5);
		if(Bread.hasMoreUnitPrice(bread2, (Bread) product2)){
			System.out.println(bread2.toString());
		}else{
			System.out.println(product2.toString());
		}
		
	}

}
