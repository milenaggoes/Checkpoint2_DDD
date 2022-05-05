package ex36;

import java.util.Scanner;

public class programa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Produto[] listaProduto = new Produto[5];

		int id;
		String nome;
		double preco;
		double quantidade;
		char possuiCategoria;
		int idCategoria;
		String nomeCategoria;

		Produto p;

		for (int i = 0; i <= 4; i++) {
			System.out.printf("Digite o id do produto: ");
			id = ler.nextInt();

			System.out.printf("Digite o nome do produto: ");
			nome = ler.next();

			System.out.printf("Digite a quantidade do produto: ");
			quantidade = ler.nextDouble();

			System.out.printf("Digite o preço do produto: ");
			preco = ler.nextDouble();

			System.out.printf("O produto possui categoria? (S/N)");
			possuiCategoria = ler.next().charAt(0);

			if (possuiCategoria == 'S') {

				System.out.printf("Digite o id da categoria: ");
				idCategoria = ler.nextInt();

				System.out.printf("Digite o nome da categoria: ");
				nomeCategoria = ler.next();

				Categoria c = new Categoria(idCategoria, nomeCategoria);
				p = new Produto(id, nome, preco, quantidade, c);
			} else {
				p = new Produto(id, nome, preco, quantidade, null);
			}
			listaProduto[i] = p;

		}

		for (int i = 0; i <= 4; i++) {
			System.out.printf("Produto %s", listaProduto[i].getNome());

			if (listaProduto[i].getCategoria() != null) {
				System.out.printf("\n Categoria do produto %s: %s", listaProduto[i].getNome(),
						listaProduto[i].getCategoria().getNome());
			}
		}
		ler.close();
	}
}