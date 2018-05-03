package tank;

public class Tank extends Container {
	private double pressure;

	public Tank(int volume, double pressure) {
		super(volume);
		this.pressure = pressure;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isDangerous() {
		// TODO Auto-generated method stub
		if (getVolume() * pressure > 100) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "volume: " + getVolume() + " pressure: " + pressure + " dangerous: " + isDangerous();
	}

	public boolean hasMorePressure(Tank t) {
		if (this.pressure > t.pressure) {
			return true;
		}
		return false;
	}
	public static Tank getTankMorePressure(Tank t1,Tank t2){
		if(t1.hasMorePressure(t2)){
			return t1;
		}
		return t2;
	}
}
