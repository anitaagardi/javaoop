package second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		readFromInput1(a);
		readFromInput2(a);
		try {
			readFromInput3(a);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			readFromInput4(a);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readFromInput1(int[] a) throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
			if (a[i] < 1) {
				throw new NumberFormatException();
			}
		}
	}

	public static void readFromInput2(int[] a) throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = Integer.parseInt(sc.nextLine());
			if (a[i] < 1) {
				throw new NumberFormatException();
			}
		}
	}

	public static void readFromInput3(int[] a) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			a[i] = Integer.valueOf(bf.readLine()).intValue();
			if (a[i] < 1) {
				throw new NumberFormatException();
			}
		}
	}

	public static void readFromInput4(int[] a) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			a[i] = Integer.parseInt(bf.readLine());
			if (a[i] < 1) {
				throw new NumberFormatException();
			}
		}
	}

}
