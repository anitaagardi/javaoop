package masodik;

public class MasodikFeladat {
	public static int faktRek(int szam) {
		if (szam == 1) {
			return szam;
		}
		if (szam == 0) {
			return 1;
		}
		return faktRek(szam - 1) * szam;
	}

	public static int fakt(int szam) {
		int eredmeny = 1;
		for (int i = 1; i <= szam; i++) {
			eredmeny = eredmeny * i;
		}
		return eredmeny;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + faktRek(i));
			System.out.println(i + " " + fakt(i));
		}
	}

}
