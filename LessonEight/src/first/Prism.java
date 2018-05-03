package first;

public abstract class Prism {
	private int height;

	public Prism(int height) {
		super();
		this.height = height;
	}

	public int getHeight() {
		return height;
	}
	public abstract double getSurface();
	public double getVolume(){
		return getSurface()*height;
	}
	public boolean isBigger(Prism p){
		if(this.getSurface()>p.getSurface()){
			return true;
		}
		return false;
	}
}
