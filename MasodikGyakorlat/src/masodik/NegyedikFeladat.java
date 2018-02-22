package masodik;

public class NegyedikFeladat {
	public static int linearis(int keresett, int[] szamok) {
		int index = 0;
		for (int szam : szamok) {
			if (szam == keresett) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public static void rendezes(int[] szamok) {

		for (int i = 0; i < szamok.length; i++) {
			int min = i;
			for (int j = i; j < szamok.length; j++) {
				if (szamok[j] < szamok[min]) {
					min = j;
				}
			}
			int seged = szamok[min];
			szamok[min] = szamok[i];
			szamok[i] = seged;
		}
	}

	public static int binaris(int keresett, int[] szamok) {
		int also = 0;
		int felso = szamok.length - 1;
		while (also <= felso) {
			int k = also + (felso - also) / 2;
			if (keresett < szamok[k])
				felso = k - 1;
			else if (keresett > szamok[k])
				also = k + 1;
			else
				return k;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] szamok = new int[] { 45, 3, 4, 10, 15, 25, 78, 4, 5, 7 };
		int[] szamok2 = new int[10];
		System.out.println("10-et keresem: " + linearis(10, szamok));
		System.out.println("100-at keresem: " + linearis(100, szamok));
		rendezes(szamok);
		for (int i = 0; i < szamok.length; i++) {
			System.out.print(szamok[i] + " ");
		}
		System.out.println("");
		System.out.println("10-et keresem: " + binaris(10, szamok));
		System.out.println("100-at keresem: " + binaris(100, szamok));

	}

}
