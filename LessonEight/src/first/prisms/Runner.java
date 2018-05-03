package first.prisms;

import java.util.Scanner;

import first.Cylinder;
import first.Cylinder.Cuboid;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prisms prisms=new Prisms(5);
		prisms.setArrayElements(0, null);
		System.out.println("Cuboid1");
		Scanner sc=new Scanner(System.in);
		int height=Integer.parseInt(sc.nextLine());
		double a=Double.parseDouble(sc.nextLine());
		double b=Double.parseDouble(sc.nextLine());
		Cuboid cuboid1=new Cuboid(height,a,b);
		System.out.println("Cylinder1");
		height=Integer.parseInt(sc.nextLine());
		double radius=Double.parseDouble(sc.nextLine());
		Cylinder cylinder1=new Cylinder(height,radius);
		System.out.println("Cylinder2");
		height=Integer.parseInt(sc.nextLine());
		radius=Double.parseDouble(sc.nextLine());
		Cylinder cylinder2=new Cylinder(height,radius);
		prisms.setArrayElements(1, cuboid1);
		prisms.setArrayElements(2, cylinder1);
		prisms.setArrayElements(3, cylinder2);
		prisms.setArrayElements(4,null);
		System.out.println(prisms.toString());
		System.out.println(prisms.getAverageSurface());
		System.out.println(prisms.getCylinderNum());
		
	}

}
