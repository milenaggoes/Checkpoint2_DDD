package ex38;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);

		ArrayList<Produto> listaProdutos = new ArrayList<>();

		int opcao;
		int id;
		String nome;
		double preco;
		int quantidade;
		char possuiCategoria;
		int idCategoria;
		String nomeCategoria;

		do {
			System.out.printf("===> Sistema de Cadastro de Produtos <===\n\n");
			System.out.printf("Escolha uma opção:\n");
			System.out.printf("1 - Incluir produto \n" + "2 - Atualizar produto \n" + "3 - Excluir produto \n"
					+ "4 - Exibir produto \n" + "5 - Sair\n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();

			if (opcao == 1) {
				Produto produto = new Produto();

				id = listaProdutos.size() + 1;
				produto.setId(id);

				System.out.printf("\nDigite o nome do produto: ");
				nome = ler.next();
				produto.setNome(nome);

				System.out.printf("\nDigite o preço do produto: ");
				preco = ler.nextDouble();
				produto.setPreco(preco);

				System.out.printf("\nDigite a quantidade do produto: ");
				quantidade = ler.nextInt();
				produto.setQuantidade(quantidade);

				System.out.printf("Possui categoria? (S/N)");
				possuiCategoria = ler.next().charAt(0);

				if (possuiCategoria == 'S') {
					System.out.printf("Digite o id da categoria: ");
					idCategoria = ler.nextInt();

					System.out.printf("Digite o nome da categoria: ");
					nomeCategoria = ler.next();

					Categoria c = new Categoria(idCategoria, nomeCategoria);

					produto.setCategoria(c);
				}
				listaProdutos.add(produto);
				System.out.printf("Produto incluído com sucesso!");
				System.in.read();

			} else if (opcao == 2) {
				for (Produto a : listaProdutos) {
					System.out.printf("ID: %d - NOME: %s - PREÇO: %2.f - QUANTIDADE: %d \n", a.getId(), a.getNome(),
							a.getPreco(), a.getQuantidade());
					if (a.getCategoria() != null) {
						System.out.printf(a.exibirCategoria());
					}

					System.out.printf("\nDigite o id do produto que deseja atualizar: ");
					id = ler.nextInt();

					System.out.printf("\nDigite o nome do produto: ");
					nome = ler.next();

					System.out.printf("\nDigite o preço do produto: ");
					preco = ler.nextDouble();

					System.out.printf("\nDigite a quantidade do produto: ");
					quantidade = ler.nextInt();

					Produto produto = listaProdutos.get(id - 1);

					produto.setNome(nome);
					produto.setPreco(preco);
					produto.setQuantidade(quantidade);

					System.out.printf("Possui categoria? (S/N)");
					possuiCategoria = ler.next().charAt(0);

					if (possuiCategoria == 'S') {
						System.out.printf("Digite o id da categoria: ");
						idCategoria = ler.nextInt();

						System.out.printf("Digite o nome da categoria: ");
						nomeCategoria = ler.next();

						Categoria c = new Categoria(idCategoria, nomeCategoria);

						produto.setCategoria(c);

					} else {
						produto.setCategoria(null);
					}
					listaProdutos.add(produto);
					System.out.printf("Produto incluído com sucesso!");
					System.in.read();

				}
				
			} else if (opcao == 3) {
					for (Produto a : listaProdutos) {
						System.out.printf("ID: %d - NOME: %s - PREÇO: %2.f - QUANTIDADE: %d \n", a.getId(), a.getNome(),
								a.getPreco(), a.getQuantidade());
						if (a.getCategoria() != null) {
							System.out.printf(a.exibirCategoria());
						}
						 System.out.printf("\nDigite o id do produto para exclusão: ");
			                id = ler.nextInt();
			                
			                listaProdutos.remove(id-1);
			                System.out.printf("Produto excluído com sucesso!");
			                System.in.read();
					}
				}
				else if (opcao == 3) {
						for (Produto a : listaProdutos) {
							System.out.printf("ID: %d - NOME: %s - PREÇO: %2.f - QUANTIDADE: %d \n", a.getId(), a.getNome(),
									a.getPreco(), a.getQuantidade());
							if (a.getCategoria() != null) {
								System.out.printf(a.exibirCategoria());
							}
							 
			                System.in.read();
						}
				}
		} while (opcao != 5);
	ler.close();
	}
}