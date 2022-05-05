package estrutura_repetição;

import java.util.Scanner;

public class ex22d {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n1, n2;

		System.out.printf("Digite o primeiro número: ");
		n1 = ler.nextInt();

		System.out.printf("Digite outro número, maior que primeiro: ");
		n2 = ler.nextInt();

		if (n2 <= n1) {
			do {
				System.out.printf("Erro, segundo número menor ou igual! Digite um número maior que o primeiro:");
				n2 = ler.nextInt();

			} while (n2 <= n1);
		}
		System.out.printf("Correto!");
		ler.close();
	}

}
