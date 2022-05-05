package estrutura_repetição;

import java.util.Scanner;

public class ex27w {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, t, num;
		
		num = 1;

		while (num <= 20) {
			i = 1;
			System.out.println("Tecle 0");
			ler.next();
			while (i <= 10) {
				t = num * i;
				System.out.printf("\n%d X %d = %d", num, i, t);
				i++;
				
			}
			System.out.printf("\n");
			num++;
		}
		ler.close();
	}
}