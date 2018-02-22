package masodik;

public class OtodikFeladat {
	public static void kiir(int szam){
		for(int i=0;i<szam;i++){
			System.out.print(szam+" ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++){
			kiir(i);
		}

	}

}
