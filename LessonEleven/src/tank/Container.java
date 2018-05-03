package tank;

public abstract class Container {
	private int volume;

	public Container(int volume) {
		super();
		this.volume = volume;
	}
	public abstract boolean isDangerous();
	public int getVolume() {
		return volume;
	}
	
}
