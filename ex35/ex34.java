package ex35;

import java.util.Scanner;

public class ex34 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Cliente[] listaCliente = new Cliente[5];

		int id;
		String nome;
		int idade;
		String email;
		char possuiContaBancaria;
		String agencia;
		String numero;
		double saldo;

		Cliente c;

		for (int i = 0; i <= 4; i++) {
			System.out.printf("Digite o id do cliente: ");
			id = ler.nextInt();

			System.out.printf("Digite o nome do cliente: ");
			nome = ler.next();

			System.out.printf("Digite a idade do cliente: ");
			idade = ler.nextInt();

			System.out.printf("Digite o email do cliente: ");
			email = ler.next();

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

				c = new Cliente(id, nome, idade, email, b);
			} else {
				c = new Cliente(id, nome, idade, email, null);
			}
			listaCliente[i] = c;
		}
		for (int i = 0; i <= 4; i++) {
			System.out.printf("\n Cliente %d de nome %s, idade %d, email %s criado. ", listaCliente[i].getId(),
					listaCliente[i].getNome(), listaCliente[i].getIdade(), listaCliente[i].getEmail());

			if (listaCliente[i].getContaBancaria()!= null) {
				System.out.printf("\n Conta Bancaria:", listaCliente[i].exibirDadosConta());
			}
		}
		ler.close();
	}
}
