package book;

import java.util.Scanner;

import book.BookWithEnum.Style;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of Books: ");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		BookWithEnum[] bookWithEnumArray = new BookWithEnum[n];
		for (int i = 0; i < bookWithEnumArray.length; i++) {
			System.out.println("Title: ");
			String title = sc.nextLine();
			System.out.println("Author: ");
			String author = sc.nextLine();
			System.out.println("Issue year: ");
			int issueYear = Integer.parseInt(sc.nextLine());
			System.out.println("Price: ");
			int price = Integer.parseInt(sc.nextLine());
			System.out.println("Style: ");
			String stlye = sc.nextLine();
			Style s;
			switch (stlye.toUpperCase()) {
				case "SCIFI":
					s = Style.SCIFI;
					break;
				case "COOK":
					s = Style.COOK;
					break;
				case "ROMANCE":
					s = Style.ROMANCE;
					break;
				default:
					s = Style.OTHER;

			}
			bookWithEnumArray[i] = new BookWithEnum(title, author, issueYear, price, s);

		}
		getDetails(bookWithEnumArray);
		if (getBookStyle(bookWithEnumArray, Style.SCIFI) != null) {
			getDetails(getBookStyle(bookWithEnumArray, Style.SCIFI));
		}

	}

	public static void getDetails(Book[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i].toString());
		}
	}

	public static BookWithEnum[] getBookStyle(BookWithEnum[] bw, Style s) {
		int actualIndex = 0;
		for (int i = 0; i < bw.length; i++) {
			if (bw[i].getStyle() == s) {
				actualIndex++;
			}
		}
		if (actualIndex == 0) {
			return null;
		}
		BookWithEnum[] bwStyle = new BookWithEnum[actualIndex];
		actualIndex = 0;
		for (int i = 0; i < bw.length; i++) {
			if (bw[i].getStyle() == s) {
				bwStyle[actualIndex] = bw[i];
				actualIndex++;
			}
		}
		return bwStyle;

	}

}
