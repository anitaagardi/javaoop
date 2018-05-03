package fourth;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		try {
			readFromInput1(a);
		} catch (NumberFormatException | UnsupportedConsoleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void readFromInput1(int[] a) throws NumberFormatException,UnsupportedConsoleException {
		if(System.console()==null){
			throw new UnsupportedConsoleException();
		}
		for (int i = 0; i < 5; i++) {
			
			a[i] = Integer.parseInt( System.console().readLine());
			if (a[i] < 1) {
				throw new NumberFormatException();
			}
		}
	}



}
