package estrutura_repetição;

import java.util.Scanner;

public class ex28d {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, soma;
		num = 1;
		soma = 0;
		
		do {
			soma = soma + num;
			num++;
			 
		}while(num <=100);
		System.out.printf("%d", soma);
		
		ler.close();
	}
}
