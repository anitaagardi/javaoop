package first;

public class RectangleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1=new Rectangle(12,45);
		Rectangle rec2=new Rectangle(10,20);
		Rectangle rec3=rec1;
		System.out.println(rec1.getDetails());
		System.out.println(rec2.getDetails());
		System.out.println(rec3.getDetails());
		rec1.setSides(25, 42);
		System.out.println(rec1.getDetails());
		System.out.println(rec2.getDetails());
		System.out.println(rec3.getDetails());
		rec1.setSides(10,20);
		System.out.println(rec1==rec2);
		System.out.println(rec1==rec3);
		System.out.println(rec1.isSame(rec2));
		
	}

}
