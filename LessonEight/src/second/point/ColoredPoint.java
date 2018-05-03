package second.point;

import java.awt.Color;

import fourth.ColorOwn;
import second.Colorable;

public class ColoredPoint extends Point implements Colorable{
private Color color;
	public ColoredPoint(int x, int y,Color c) {
		super(x, y);
		this.color=c;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		 this.color=color;
	}
	@Override
	public String toString(){
		return super.toString()+" "+new ColorOwn(getColor());
	}

}
