package estrutura_repetição;

public class ex30w {
	public static void main(String[] args) {

		int n=20, t1=1, t2=1, t3=1, t4, i=3;
		
		System.out.printf("%d\n%d\n%d", t1, t2, t3);
		while (i <= n) {
			System.out.printf("\n");
			t4 = t1 + t2 + t3;
			System.out.printf("%d", t4);
			t1 = t2;
			t2 = t3;
			t3 = t4;
			i++;
		}
	}
}
