package fifth;

public class BookUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setPrice(1500);
		System.out.println("Price: "+book.getPrice());
		book.raisePrice(30);
		System.out.println("Price: "+book.getPrice());
		System.out.println(book.getDetails());
	}

}
