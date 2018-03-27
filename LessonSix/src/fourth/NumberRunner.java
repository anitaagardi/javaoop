package fourth;

import third.own.Number;

public class NumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Number number = new Number(Math.random());
		Number num;
		int index = 0;
		do {
			index++;
			num = new Number(Math.random());
			System.out.println(num.getNumber());
		} while (!number.isInTolerance(num.getNumber()));
		System.out.println(index);
		number.setNumber(1.5);
		System.out.println(number.getNumber());
		Number number2 = new Number(12);
		// number=number2; //the final local variable cannot be assigned

	}

}
