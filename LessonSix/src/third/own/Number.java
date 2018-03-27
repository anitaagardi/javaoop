package third.own;

public class Number {
	private static final double TOLERANCE = 0.001;
	private double number;

	public Number(double number) {
		super();
		this.number = number;
	}

	public boolean isInTolerance(double num) {
		if (Math.abs(num - number) < TOLERANCE) {
			return true;
		}
		return false;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	
}
