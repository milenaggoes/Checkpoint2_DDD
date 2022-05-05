package estrutura_repetição;

public class ex30f {

	public static void main(String[] args) {

		int t1 = 1, t2 = 1, t3 = 1, t4;

		System.out.printf("%d\n%d\n%d", t1, t2, t3);
		for (int i =3; i<=20; i++) {
			System.out.printf("\n");
			t4 = t1 + t2 + t3;
			System.out.printf("%d", t4);
			t1 = t2;
			t2 = t3;
			t3 = t4;
		}
		
	}

}
