package classe_atributo;

import java.util.Scanner;

public class ex33 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		produto[] listaProdutos = new produto[10];

		for (int i = 0; i <= 1; i++) {
			produto p = new produto();
			System.out.printf("Digite o id do produto:");
			p.id = ler.nextInt();
			System.out.printf("Digite a descrição do produto:");
			p.descricao = ler.next();
			System.out.printf("Digite o valor do produto:");
			p.valor = ler.nextDouble();
			System.out.printf("Digite a quantidade do produto:");
			p.quantidade = ler.nextInt();

			listaProdutos[i] = p;
		}
		
		for (int i = 0; i <= 1; i++) {
			if (listaProdutos[i].valor > 100) {
				System.out.printf("\nProduto %s com valor de R$ %.2f!", listaProdutos[i].descricao,
						listaProdutos[i].valor);
			}
		}
		ler.close();
	}
}