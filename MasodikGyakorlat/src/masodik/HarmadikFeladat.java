package masodik;

public class HarmadikFeladat {
	public static boolean primE(int szam) {
		if (szam == 1 || szam == 0) {
			return false;
		}
		int db = 2;// 1-el és önmagával minden szám osztható
		for (int i = 2; i <= Math.sqrt(szam); i++) {
			if (szam % i == 0) {
				db++;
			}
		}

		if (db == 2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int darab=0;
		for (int i = 0; i < 100; i++) {
			for (int j = i + 1; j < 100; j++) {
				if (primE(i) && primE(j)) {
					if (Math.abs(i - j) == 2) {
						System.out.println(i + " " + j);
						darab++;
					}
				}
			}
		}
		System.out.println("Az ikerprímek száma "+darab);

	}

}
