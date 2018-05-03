package sixth;

import java.util.Scanner;

public class Runner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Title: ");
		String title = sc.nextLine();
		System.out.println("Author: ");
		String author = sc.nextLine();
		int issueYear;

		System.out.println("Issue year: ");
		issueYear = Integer.parseInt(sc.nextLine());
		if (issueYear < 0) {
			issueYear = 0;
		}
		int price;

		System.out.println("Price :");
		price = Integer.parseInt(sc.nextLine());
		if (price < 0) {
			price = 0;
		}
		Book b = new Book(title, author, issueYear, price);
	}

}
