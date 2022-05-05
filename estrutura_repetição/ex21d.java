package estrutura_repetição;

import java.util.Scanner;

public class ex21d {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num;

		System.out.printf("Digite um número positivo: ");
		num = ler.nextInt();

		// do = faça while = enquanto
		
		if (num < 0) {
			do {
				System.out.printf("Erro! digite um numero positivo:");
				num = ler.nextInt();
				
			} while (num <= 0);
		}
			System.out.printf("Correto, número positivo!");
			ler.close();
	}
}
