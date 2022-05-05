package estrutura_repetição;

import java.util.Scanner;

public class ex28f {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int soma;
		soma = 0;

		for (int num = 1; num <= 100; num++) {
			soma = soma + num;
		}
		System.out.printf("%d", soma);
		ler.close();
	}
}
