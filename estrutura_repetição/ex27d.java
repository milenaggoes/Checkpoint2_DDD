package estrutura_repetição;

import java.util.Scanner;

public class ex27d {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, t, num;

		num = 1;

		do {
			i = 1;
			System.out.println("Tecle 0");
			ler.next();
			do {
				t = num * i;
				System.out.printf("\n%d X %d = %d", num, i, t);
				i++;
			} while (i <= 10);
			num++;
			System.out.printf("\n");
		} while (num <= 20);
		ler.close();
	}
}