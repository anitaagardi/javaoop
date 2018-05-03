package fourth;

public class UnsupportedConsoleException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		System.out.println("Unsupported Console Exception");
		return super.getMessage();
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("Unsupported Console Exception");
		super.printStackTrace();
	}

}
