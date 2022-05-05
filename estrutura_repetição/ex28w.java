package estrutura_repetição;

import java.util.Scanner;

public class ex28w {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		num = 1;
		int soma = 0;
				
		while (num <= 100) {
			soma = soma + num;
			num++;
		}
		System.out.printf("%d", soma);
		ler.close();
	}
}
