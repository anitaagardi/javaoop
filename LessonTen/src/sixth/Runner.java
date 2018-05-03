package sixth;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String title, String author, int issueYear, int price
		Scanner sc = new Scanner(System.in);
		System.out.println("Title: ");
		String title = sc.nextLine();
		System.out.println("Author: ");
		String author = sc.nextLine();
		int issueYear;
		do {
			System.out.println("Issue year: ");
			issueYear = Integer.parseInt(sc.nextLine());
		} while (issueYear < 0);
		int price;
		do {
			System.out.println("Price :");
			price = Integer.parseInt(sc.nextLine());
		} while (price < 0);
		Book b = new Book(title, author, issueYear, price);
		
		

	}

}
