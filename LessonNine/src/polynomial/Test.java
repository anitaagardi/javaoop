package polynomial;

import java.util.Scanner;

import math.Polynomial;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearPolynomial[] lp = new LinearPolynomial[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("a: ");
			int a = Integer.parseInt(sc.nextLine());
			System.out.println("b: ");
			int b = Integer.parseInt(sc.nextLine());
			lp[i] = new LinearPolynomial(a, b);

		}
		for (int i = 0; i < 5; i++) {
			System.out.println(lp[i]);
		}
		System.out.println("Function table");
		getFunctionTable(lp[lp.length - 1]);

	}

	public static void getFunctionTable(Polynomial p) {
		for (double i = 0.0; i <= 1.0; i += 0.1) {
			System.out.println("x=" + i + " y=" + p.getY(i));
		}
	}

}
