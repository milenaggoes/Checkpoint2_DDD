package estrutura_repetição;

import java.util.Scanner;

public class ex26f {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int t, num, a, b;
		System.out.printf("Digite um número positivo: ");
		num = ler.nextInt();

		while (num <= 0) {
			System.out.printf("Erro, número negativo! Digite um número positivo:");
			num = ler.nextInt();

		}

		System.out.printf("Digite o valor de A: ");
		a = ler.nextInt();

		System.out.printf("Digite o valor de B: ");
		b = ler.nextInt();

		while (b < a) {
			System.out.printf("Erro, B menor que A! Digite o valor de B: ");
			b = ler.nextInt();
		}
		for (int i = b; i >= a; i--) {
			t = num * i;
			System.out.printf("\n%d X %d = %d", num, i, t);
			i--;
		}
		ler.close();
	}
}
