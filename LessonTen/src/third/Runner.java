package third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		try {
			readFromInput1(a);
		} catch (PrimeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			readFromInput2(a);
		} catch (PrimeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			readFromInput3(a);
		} catch (PrimeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			readFromInput4(a);
		} catch (PrimeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readFromInput1(int[] a) throws PrimeNumberException {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			for (int j = 2; j < input; j++) {
				if (input % j == 0) {
					throw new PrimeNumberException();
				}
			}
			a[i] = input;
			if (a[i] < 1) {
				throw new PrimeNumberException();
			}
		}
	}

	public static void readFromInput2(int[] a) throws PrimeNumberException {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int input = Integer.parseInt(sc.nextLine());
			for (int j = 2; j < input; j++) {
				if (input % j == 0) {
					throw new PrimeNumberException();
				}
			}
			a[i] = input;
			if (a[i] < 1) {
				throw new PrimeNumberException();
			}
		}
	}

	public static void readFromInput3(int[] a) throws PrimeNumberException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			int input = Integer.valueOf(bf.readLine()).intValue();
			for (int j = 2; j < input; j++) {
				if (input % j == 0) {
					throw new PrimeNumberException();
				}
			}
			a[i] = input;
			if (a[i] < 1) {
				throw new PrimeNumberException();
			}
		}
	}

	public static void readFromInput4(int[] a) throws PrimeNumberException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			int input = Integer.parseInt(bf.readLine());
			for (int j = 2; j < input; j++) {
				if (input % j == 0) {
					throw new PrimeNumberException();
				}
			}
			a[i] = input;
			if (a[i] < 1) {
				throw new PrimeNumberException();
			}
		}
	}

}
