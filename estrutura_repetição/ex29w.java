package estrutura_repetição;

public class ex29w {
	public static void main(String[] args) {

		int n=30, t3, t1=1, t2=1, i=3;
		
		System.out.printf("%d\n%d", t1, t2);
		while (i <= n) {
			System.out.printf("\n");
			t3 = t1 + t2;
			System.out.printf("%d", t3);
			t1 = t2;
			t2 = t3;
			i++;
		}	
	}
}
