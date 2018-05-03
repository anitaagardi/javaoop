package third;

import java.awt.Color;

import fourth.ColorOwn;
import second.Colorable;
import second.point.ColoredPoint;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colorable c=new ColoredPoint(5,4,Color.BLACK);
		System.out.println(c.toString());
		c.setColor(Color.BLUE);
		System.out.println(c.toString());
		
		Colorable p=new Pen("pen1",150,27,Color.BLACK,"Zebra");
		System.out.println(p.toString());
		p.setColor(Color.BLUE);
		System.out.println(p.toString());
		reColor(c);
		reColor(p);
		ColorOwn co=new ColorOwn(c.getColor());
		System.out.println(c.toString());
		System.out.println(p.toString());
	}
	public static void reColor(Colorable c){
		c.setColor(c.baseColor);
	}

}
