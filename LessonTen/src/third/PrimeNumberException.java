package third;

public class PrimeNumberException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		System.out.println("Not prime");
		return super.getMessage();
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("Not prime");
		super.printStackTrace();
	}
	
}
