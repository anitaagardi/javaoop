package gyak;

import java.util.Scanner;

public class HarmadikFeladat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] tomb=new double[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Adja meg a számokat!");
		double szorzat=1;
		for(int i=0;i<tomb.length;i++){
			System.out.println("Adja meg az "+(i+1)+" számot!");
			tomb[i]=input.nextDouble();
			szorzat=szorzat*tomb[i];
		}
		
		double eredmeny=Math.pow(szorzat,(-1)*tomb.length);
		System.out.println("A mértani átlag: "+eredmeny);
		

	}

}
