package masodik;

public class ElsoFeladat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double wallis = 1;
		int nevezo = 1;
		int szamlalo = 0;
		for (int i = 0; i < 1000; i++) {
			// páros
			if (i % 2 == 0) {

				szamlalo = szamlalo + 2;
			}
			// páratlan
			if (i % 2 == 1) {
				nevezo = nevezo + 2;
			}
			wallis = wallis * (szamlalo * 1.0 / nevezo);

		}
		System.out.println("Pi értéke (Wallis) " + (wallis * 2));

		double leibniz = 0;
		nevezo = 1;
		szamlalo = 1;
		for (int i = 0; i < 1000; i++) {
			if (i % 2 == 0) {
				leibniz = leibniz + (szamlalo * 1.0 / nevezo);
			} else {
				leibniz = leibniz - (szamlalo * 1.0 / nevezo);
			}
			nevezo = nevezo + 2;
		}
		System.out.println("Pi értéke (Leibniz) " + (leibniz * 4));

	}

}
