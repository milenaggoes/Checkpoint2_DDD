package estrutura_repeti��o;

import java.util.Scanner;

public class ex25f {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num, t;
		
		do {
			System.out.printf("Digite um n�mero positivo:");
			num = ler.nextInt();
			
		} while (num <= 0);
		
		for (int i=1; i <=10; i++) {
			t = num * i;
			System.out.printf("\n%d X %d = %d", num, i, t);
		}
		ler.close();
	}
}
