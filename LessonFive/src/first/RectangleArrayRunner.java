package first;

import java.util.Random;
import java.util.Scanner;

public class RectangleArrayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] rec = new Rectangle[10];
		Random rand=new Random();
		for (int i = 0; i < rec.length; i++) {
			rec[i] = new Rectangle(rand.nextInt(10)+2, rand.nextInt(10)+2);
		}
		for (int i = 0; i < rec.length; i++) {
			System.out.println(rec[i].getDetails());
		}
		int minAreaIndex=0;
		for(int i=0;i<rec.length;i++){
			if(rec[minAreaIndex].isBigger(rec[i])){
				minAreaIndex=i;
			}
		}
		Scanner in=new Scanner(System.in);
		System.out.println("First side of the rectangle: ");
		int inputFirstSide=Integer.parseInt(in.nextLine());
		System.out.println("Second side of the rectangle:");
		int inputSecondSide=Integer.parseInt(in.nextLine());
		Rectangle inputRectangle=new Rectangle(inputFirstSide,inputSecondSide);
		int smallerThanInput=0;
		for(int i=0;i<rec.length;i++){
			if(inputRectangle.isBigger(rec[i])){
				smallerThanInput++;
			}
		}
		int sameIndex=-1;
		for(int i=0;i<rec.length;i++){
			if(inputRectangle.isSame(rec[i])){
				sameIndex=i;
			}
		}
		System.out.println(sameIndex);
		if(sameIndex==-1){
			System.out.println("No such rectangle");
		}
		
	}
}
