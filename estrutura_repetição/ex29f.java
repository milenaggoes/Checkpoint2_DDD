package estrutura_repetição;

public class ex29f {
	public static void main(String args[]) {

		int t3, t1 = 1, t2 = 1;

		System.out.printf("%d\n%d", t1, t2);
		
		for (int i = 3; i <= 30; i++) {
			System.out.printf("\n");
			t3 = t1 + t2;
			System.out.printf("%d", t3);
			t1 = t2;
			t2 = t3;
		}
	}
}
