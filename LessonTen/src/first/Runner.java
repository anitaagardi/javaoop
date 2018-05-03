package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("5 number: ");
		for (int i = 0; i < 5; i++) {
			try {
				a[i] = sc.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("Error");
				return;
			}
		}
		System.out.println("5 number: ");
		sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			try {
				a[i] = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error");
				e.printStackTrace();
				return;
			}
		}
		System.out.println("5 number: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			try {
				a[i] = Integer.valueOf(bf.readLine()).intValue();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("Error");
				e.printStackTrace();
				return;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		}

		System.out.println("5 number: ");
		bf = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			try {
				a[i] = Integer.parseInt(bf.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("Error");
				e.printStackTrace();
				return;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}

	}

}
