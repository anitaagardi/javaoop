package mybooks.sub;

import java.util.Scanner;

import mybooks.BookStyle;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The amount of books");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		BookStyle[] bookStyle=new BookStyle[n];
		for(int i=0;i<bookStyle.length;i++){
			System.out.println("Title:");
			String title=s.nextLine();
			System.out.println("Author:");
			String author=s.nextLine();
			System.out.println("Issue year:");
			int issueYear=s.nextInt();
			System.out.println("Price: ");
			int price=s.nextInt();
			System.out.println("Style: ");
			String style=s.nextLine();
			bookStyle[i]=new BookStyle(title,author,issueYear,price,style);
		}
		int differentStyleAmount=0;
		
		for(int i=0;i<bookStyle.length;i++){
			for(int j=i+1;j<bookStyle.length;j++){
			
					if(bookStyle[i].getStyle().equalsIgnoreCase(bookStyle[j].getStyle())){
						differentStyleAmount++;
					}
				
			}
		}
		double averagePriceScifi=0;
		double scifiAmount=0;
		for(int i=0;i<bookStyle.length;i++){
			if(bookStyle[i].getStyle().equalsIgnoreCase("Scifi")){
				System.out.println(bookStyle[i].getDetails());
				averagePriceScifi=averagePriceScifi+bookStyle[i].getPrice();
				scifiAmount++;
			}
		}
		averagePriceScifi=averagePriceScifi/scifiAmount;
		
	}
}
