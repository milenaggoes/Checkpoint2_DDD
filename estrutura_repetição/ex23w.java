package estrutura_repetição;

import java.util.Scanner;

public class ex23w {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int genero;

		System.out.printf("Digite seu sexo, 1(Feminino) ou 2(Masculino): ");
		genero = ler.nextInt();
		
		if (genero == 1 || genero == 2 ) {
			System.out.printf("Resposta válida!");
		}
		while (genero < 1 || genero > 2) {
			System.out.printf("Resposta inválida! Digite novamente:");
			genero = ler.nextInt();
		}
		ler.close();
	}
}