package estrutura_repeti��o;

import java.util.Scanner;

public class ex22d {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n1, n2;

		System.out.printf("Digite o primeiro n�mero: ");
		n1 = ler.nextInt();

		System.out.printf("Digite outro n�mero, maior que primeiro: ");
		n2 = ler.nextInt();

		if (n2 <= n1) {
			do {
				System.out.printf("Erro, segundo n�mero menor ou igual! Digite um n�mero maior que o primeiro:");
				n2 = ler.nextInt();

			} while (n2 <= n1);
		}
		System.out.printf("Correto!");
		ler.close();
	}

}
