package estrutura_repetição;

import java.util.Scanner;

public class ex27f {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int t;
		
		for (int num = 1; num <= 20; num++) {
			System.out.println("Tecle 0");
			ler.next();
			
			for(int i = 1; i<=10; i++) {
				t = num * i;
				System.out.printf("\n%d X %d = %d", num, i, t);
			}
			System.out.printf("\n");
		}
		ler.close();
	}
}