package estrutura_repeti��o;

import java.util.Scanner;

public class ex21w {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num;
		
		System.out.printf("Digite um n�mero positivo: ");
		num = ler.nextInt();
		
		while( num <= 0) {
			System.out.printf("Erro, n�mero negativo! Digite um n�mero positivo:");
			num = ler.nextInt();	
		}
		ler.close();
	}
}
