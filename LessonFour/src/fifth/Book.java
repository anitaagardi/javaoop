package fifth;

public class Book {
	private String title;
	private String author;
	private int issueYear;
	private int price;

	public void raisePrice(double percent) {
		price = (int) (price + price * percent/100);
	}

	public String getDetails() {
		return title + " " + author + " " + issueYear + " " + price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIssueYear() {
		return issueYear;
	}

	public void setIssueYear(int issueYear) {
		this.issueYear = issueYear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
