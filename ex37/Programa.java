package ex37;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);

		ArrayList<Cliente> listaClientes = new ArrayList<>();

		int opcao;
		int id;
		String nome;
		int idade;
		String email;
		char possuiContaBancaria;
		String agencia;
		String numero;
		double saldo;

		do {
			System.out.printf("===> Sistema de Cadastro de Cliente <===\n\n");
			System.out.printf("Escolha uma opção:\n");
			System.out.printf("1 - Cadastrar Cliente \n" + "2 - Atualizar Cliente \n" + "3 - Excluir Cliente \n"
					+ "4 - Exibir Clientes \n" + "5 - Sair\n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();

			if (opcao == 1) {
				Cliente cliente = new Cliente();

				id = listaClientes.size() + 1;
				cliente.setId(id);

				System.out.printf("Digite o nome do cliente: ");
				nome = ler.next();
				cliente.setNome(nome);

				System.out.printf("Digite a idade do cliente: ");
				idade = ler.nextInt();
				cliente.setIdade(idade);

				System.out.printf("Digite o email do cliente: ");
				email = ler.next();
				cliente.setEmail(email);

				System.out.printf("Possui conta báncaria? (S/N)");
				possuiContaBancaria = ler.next().charAt(0);

				if (possuiContaBancaria == 'S') {
					System.out.printf("Digite a sua agência: ");
					agencia = ler.next();

					System.out.printf("Digite o número da sua conta: ");
					numero = ler.next();

					System.out.printf("Digite o seu saldo: ");
					saldo = ler.nextDouble();

					ContaBancaria b = new ContaBancaria(agencia, numero, saldo);

					cliente.setContaBancaria(b);

				}

				listaClientes.add(cliente);

				System.out.printf("Cliente incluído com sucesso!");
				System.in.read();

			}

			else if (opcao == 2) {
				for (Cliente a : listaClientes) {
					System.out.printf("ID: %d - NOME: %s - IDADE: %d - EMAIL: %s \n", a.getId(), a.getNome(),
							a.getIdade(), a.getEmail());
					if (a.getContaBancaria() != null) {
						System.out.printf(a.exibirDadosConta());
					}
				}

				System.out.printf("\nDigite o id do cliente que deseja atualizar: ");
				id = ler.nextInt();

				System.out.printf("Digite o novo nome do cliente: ");
				nome = ler.next();

				System.out.printf("Digite a idade do novo cliente: ");
				idade = ler.nextInt();

				System.out.printf("Digite o novo email do cliente: ");
				email = ler.next();

				Cliente cliente = listaClientes.get(id - 1);

				cliente.setNome(nome);
				cliente.setIdade(idade);
				cliente.setEmail(email);

				System.out.printf("Possui conta báncaria? (S/N)");
				possuiContaBancaria = ler.next().charAt(0);

				if (possuiContaBancaria == 'S') {
					System.out.printf("Digite a sua agência: ");
					agencia = ler.next();

					System.out.printf("Digite o número da sua conta: ");
					numero = ler.next();

					System.out.printf("Digite o seu saldo: ");
					saldo = ler.nextDouble();

					ContaBancaria b = new ContaBancaria(agencia, numero, saldo);

					cliente.setContaBancaria(b);

				} else {
					cliente.setContaBancaria(null);
				}

				System.out.printf("Cliente atualizado com sucesso!");
				System.in.read();
			} else if (opcao == 3) {
				for (Cliente a : listaClientes) {
					System.out.printf("ID: %d - NOME: %s - IDADE: %d - EMAIL: %s \n", a.getId(), a.getNome(),
							a.getIdade(), a.getEmail());
					if (a.getContaBancaria() != null) {
						System.out.printf(a.exibirDadosConta());
					}
				}

				System.out.printf("\nDigite o id do cliente para exclusão: ");
				id = ler.nextInt();

				listaClientes.remove(id - 1);

				System.out.printf("Cliente excluído com sucesso!");
				System.in.read();
			} else if (opcao == 4) {
				for (Cliente a : listaClientes) {
					System.out.printf("ID: %d - NOME: %s - IDADE: %d - EMAIL: %s \n", a.getId(), a.getNome(),
							a.getIdade(), a.getEmail());
					if (a.getContaBancaria() != null) {
						System.out.printf(a.exibirDadosConta());
					}
				}

				System.in.read();
			}

		} while (opcao != 5);
		ler.close();
	}
}
