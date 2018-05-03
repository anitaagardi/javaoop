package third;

import java.awt.Color;

import fourth.ColorOwn;
import second.Colorable;

public class Pen extends Product implements Colorable {
	private Color color;
	private String tradeName;

	public Pen(String name, int price, int taxKey, Color color, String tradeName) {
		super(name, price, taxKey);
		// TODO Auto-generated constructor stub
		this.color = color;
		this.tradeName = tradeName;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.color = color;
	}
	public String toString(){
		return super.toString()+" "+new ColorOwn(color)+" "+tradeName;
	}

}
