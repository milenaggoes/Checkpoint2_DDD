package classe_atributo;

import java.util.Scanner;

public class ex32 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		clientes[] listaClientes = new clientes[4];

		for (int i = 0; i <= 4; i++) {
			clientes c = new clientes();

			System.out.printf("Digite o id do cliente:");
			c.id = ler.nextInt();
			System.out.printf("Digite o nome do cliente:");
			c.nome = ler.next();
			System.out.printf("Digite a idade do cliente:");
			c.idade = ler.nextInt();
			System.out.printf("Digite o email do cliente:");
			c.email = ler.next();

			listaClientes[i] = c;
		}

		for (int i = 0; i <= 4; i++) {
			if (listaClientes[i].idade >= 18) {
				System.out.printf("\nCliente %d maior de 18 (%s)!", listaClientes[i].id, listaClientes[i].nome);

			}
		}
		ler.close();
	}
}
