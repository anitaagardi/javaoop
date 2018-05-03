package first;

public class Cylinder extends Prism{
private double radius;
	public Cylinder(int height,double radius) {
		super(height);
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}

	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		return 2*radius*3.14*getHeight();
	}

	@Override
	public String toString() {
		return radius+" "+getHeight();
	}
	public static class Cuboid extends Prism{
		private double a;
		private double b;
		public Cuboid(int height,double a, double b) {
			super(height);
			// TODO Auto-generated constructor stub
			this.a=a;
			this.b=b;
		}

		@Override
		public double getSurface() {
			// TODO Auto-generated method stub
			return a*b*getHeight();
		}
		@Override
		public String toString() {
			return a+" "+b+" "+getHeight();
		}
		
	}
	

}
