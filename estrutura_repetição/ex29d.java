package estrutura_repetição;

public class ex29d {
	public static void main(String[] args) {

		int t3, t1 = 1, t2 = 1, i = 3;

		System.out.printf("%d\n%d", t1, t2);
		do {
		
			System.out.printf("\n");
			t3 = t1 + t2;
			System.out.printf("%d", t3);
			t1 = t2;
			t2 = t3;
			i++;
		} while (i <= 30);
	}
}
