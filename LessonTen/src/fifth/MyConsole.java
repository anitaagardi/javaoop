package fifth;

import java.util.Scanner;

import fourth.UnsupportedConsoleException;

public class MyConsole {

	public static int readInt(String message) {
		Scanner sc = new Scanner(System.in);
		boolean good = false;
		int number=0;
		do {
			try {
				number = sc.nextInt();
				good = true;
			} catch (NumberFormatException e) {
				System.out.println(message);
				e.printStackTrace();
			}

		} while (!good);

		return number;
	}
	public static double readDouble(String message) {
		
		boolean good = false;
		double number=0;
		do {
			try {
				if(System.console()==null){
					throw new UnsupportedConsoleException();
				}
				number = Double.parseDouble(System.console().readLine());
				good = true;
			} catch (Exception e) {
				e.printStackTrace();
			}

		} while (!good);

		return number;
	}
}
