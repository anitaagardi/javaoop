package book;

public class BookWithEnum extends Book {
	public enum Style {
		SCIFI, COOK, ROMANCE, OTHER
	}

	private Style style;

	public BookWithEnum(String title, String author, int issueYear, int price, Style style) {
		super(title, author, issueYear, price);
		// TODO Auto-generated constructor stub
		this.style = style;
	}
	@Override
	public String toString(){
		return super.toString()+style.toString();
	}
	public Style getStyle() {
		return style;
	}
	

}
