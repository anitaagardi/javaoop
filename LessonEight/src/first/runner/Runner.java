package first.runner;

import first.Cylinder;
import first.Cylinder.Cuboid;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder=new Cylinder(15,5);
		System.out.println(cylinder.toString());
		System.out.println(cylinder.getVolume());
		Cuboid cuboid =new  Cuboid(15,5,6);
		System.out.println(cuboid.toString());
		System.out.println(cuboid.getVolume());
		if(cuboid.isBigger(cylinder)){
			System.out.println(cuboid.toString());
		}else{
			System.out.println(cylinder.toString());
		}
		
	}

}
