package estrutura_repetição;

public class ex30d {

	public static void main(String[] args) {
		
		int t1=1, t2=1, t3=1, t4, i=3;
		
		System.out.printf("%d\n%d\n%d", t1, t2, t3);
		do {
			System.out.printf("\n");
			t4 = t1 + t2 + t3;
			System.out.printf("%d", t4);
			t1 = t2;
			t2 = t3;
			t3 = t4;
			i++;
		}while (i<= 20);
	}

}
