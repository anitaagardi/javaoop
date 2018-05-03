package tank.runner;

import java.util.Scanner;

import tank.Tank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank[] tankArray=new Tank[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<tankArray.length;i++){
			System.out.println("Volume: ");
			int volume=Integer.parseInt(sc.nextLine());
			System.out.println("Pressure: ");
			double pressure=Double.parseDouble(sc.nextLine());
			tankArray[i]=new Tank(volume,pressure);
		}
		for(int i=0;i<tankArray.length;i++){
			System.out.println(tankArray[i]);
		}
		Tank maxPressureTank=tankArray[0];
		for(int i=0;i<tankArray.length;i++){
			if(Tank.getTankMorePressure(maxPressureTank, tankArray[i])==tankArray[i]){
				maxPressureTank=tankArray[i];
			}
		}
		System.out.println("Max pressure: "+maxPressureTank);
		int maxVolumeIndex=0;
		for(int i=0;i<tankArray.length;i++){
			if(tankArray[i].getVolume()>tankArray[maxVolumeIndex].getVolume()){
				maxVolumeIndex=i;
			}
		}
		System.out.println("Max volume: "+tankArray[maxVolumeIndex]);

	}

}
